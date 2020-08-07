package com.jnshu.controller;

import com.jnshu.pojo.SecondPortFolio;
import com.jnshu.result.Result;
import com.jnshu.service.ShowWorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName ShowWorksController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 20:38
 * @Version 1.0
 */
@Controller
@RequestMapping("/task3")
public class ShowWorksController {
    @Autowired
    ShowWorksService showWorksService;

    /**
     * 展示二级导航下的所有作品
     * @param secondId
     * @return
     */
    @GetMapping("/works/list/{secondId}")
    @ResponseBody
    public Map<String,Object> showWorks(@PathVariable int secondId){
        SecondPortFolio secondPortFolio=showWorksService.getAllWorkList(secondId);
        if(secondPortFolio!=null){
            return Result.set(200,"展示作品成功",secondPortFolio.getWorksList());
        }else {
            return Result.set(404,"展示作品失败");
        }
    }
}
