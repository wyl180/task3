package com.jnshu.controller;

import com.jnshu.pojo.Intro;
import com.jnshu.result.Result;
import com.jnshu.service.ShowIntroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName ShowIntroController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 21:20
 * @Version 1.0
 */
@Controller
public class ShowIntroController {
    @Autowired
    ShowIntroService showIntroService;
    @GetMapping("/intro/{type}")
    @ResponseBody
    public Map<String,Object> showIntro(@PathVariable int type){
        Intro intro=showIntroService.selectByType(type);
        if(intro!=null){
            return Result.set(200,"展示简介成功",intro);
        }else {
            return Result.set(404,"展示简介失败");
        }
    }
}
