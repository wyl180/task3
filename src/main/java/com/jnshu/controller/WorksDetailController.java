package com.jnshu.controller;

import com.jnshu.pojo.Works;
import com.jnshu.result.Result;
import com.jnshu.service.WorksDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

/**
 * @ClassName WorksDetailController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 22:50
 * @Version 1.0
 */
@Controller
public class WorksDetailController {
    @Autowired
    WorksDetailService worksDetailService;

    /**
     * 查看作品详情
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/works/{id}")
    @ResponseBody
    public Map<String, Object> showMessage(@PathVariable int id) {
        Works worksMessage = worksDetailService.getWorksDetail(id);
        Works works=worksDetailService.selectWorksById(id);
        if (worksMessage == null) {
            //如果一对多查询出来的作品详情（包含留言）是空就返回单表查询出来的作品详情(不包含留言)
            return Result.set(200, "查看作品详情成功", works);
        } else if(worksMessage!=null&&works!=null){
            return Result.set(200, "查看作品详情成功",worksMessage);
        }else {
            return Result.set(404,"展示作品详情失败");
        }
    }
}