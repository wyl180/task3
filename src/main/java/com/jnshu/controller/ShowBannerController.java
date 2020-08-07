package com.jnshu.controller;

import com.jnshu.pojo.Banner;
import com.jnshu.result.Result;
import com.jnshu.service.ShowBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ShowBannerController
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 23:16
 * @Version 1.0
 */
@Controller
public class ShowBannerController {
    @Autowired
    ShowBannerService showBannerService;

    /**
     * 查询banner列表接口
     *
     * @return
     */
    @GetMapping("/banner")
    @ResponseBody
    public Map<String, Object> showBanner() {
        List<Banner> banner = showBannerService.selectBannerList();
        if (banner != null && !banner.isEmpty()) {
            return Result.set(200, "查询banner成功", banner);

        } else {
            return Result.set(404, "查询banner失败");
        }
    }
}
