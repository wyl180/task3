package com.jnshu.controller;

import com.jnshu.pojo.Message;
import com.jnshu.pojo.Works;
import com.jnshu.result.Result;
import com.jnshu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MessageController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 13:12
 * @Version 1.0
 */
@Controller
@RequestMapping("/task3")
public class MessageController {
    @Autowired
    MessageService messageService;

    /**
     * 游客评论接口
     */
    @PostMapping(value = "/message")
    @ResponseBody
    public Map<String, Object> postMassage(@RequestParam String touristName, @RequestParam String content, @RequestParam int worksId) {
        Message message = new Message();
        //留言时间
        message.setMessageTime(System.currentTimeMillis());
        //留言内容
        message.setContent(content);
        //要留言的作品id
        message.setWorksId(worksId);
        //游客昵称
        message.setTouristName(touristName);
        messageService.addMessage(message);
        return Result.set(200, "留言成功");

    }


}

