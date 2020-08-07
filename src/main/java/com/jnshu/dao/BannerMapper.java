package com.jnshu.dao;

import com.jnshu.pojo.Banner;

import java.util.List;

/**
 * @Author 韦延伦
 * @Description 根据id查找banner的Mapper
 * @Date 2020/8/4 15:02
 **/
public interface BannerMapper {

    /**
     * 查找banner列表
     * @param
     * @return Banner
     */
    List<Banner> selectBannerList();

}