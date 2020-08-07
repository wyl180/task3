package com.jnshu.service;

import com.jnshu.pojo.Banner;

import java.util.List;

/**
 * @ClassName ShowBannerService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 23:13
 * @Version 1.0
 */
public interface ShowBannerService {
    /**
     * 查询Banner列表
     */
    List<Banner> selectBannerList();
}
