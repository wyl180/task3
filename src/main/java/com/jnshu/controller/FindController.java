package com.jnshu.controller;

import com.jnshu.pojo.Works;
import com.jnshu.result.Result;
import com.jnshu.service.FindService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
/**
 * @ClassName FindController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 21:32
 * @Version 1.0
 */
@Controller
public class FindController  {
    @Autowired
    FindService findService;

    @GetMapping("/find")
    @ResponseBody
    public Map<String,Object> findByKeyword(@RequestParam String keyword){
        List<Works> worksList=findService.selectByKeyword(keyword);
        if(worksList!=null&&!worksList.isEmpty()){
            return Result.set(200,"搜索成功",worksList);
        }else {
            return Result.set(404,"搜索失败");
        }
    }
}
