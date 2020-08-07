package com.jnshu.controller;

import com.jnshu.pojo.FirstPortFolio;
import com.jnshu.result.Result;
import com.jnshu.service.FirstPortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * @ClassName ShowSecondPortfolioController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 20:11
 * @Version 1.0
 */
@Controller
@RequestMapping("/task3")
public class CatalogController {
    @Autowired
    FirstPortfolioService firstPortfolioService;
    /**
     * 查看一级导航下的二级导航接口
     * @param firstId
     * @return
     */
    @GetMapping("/catalog/{firstId}")
    @ResponseBody
    public Map<String,Object> showSecond(@PathVariable int firstId){
        FirstPortFolio firstPortFolio=firstPortfolioService.getFirstPortfolio(firstId);

        if (firstPortFolio!=null){

            return Result.set(200,"查看二级导航成功",firstPortFolio);
        }else {
            return Result.set(404,"查看二级导航失败");
        }
    }
}
