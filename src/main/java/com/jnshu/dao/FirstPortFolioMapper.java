package com.jnshu.dao;

import com.jnshu.pojo.FirstPortFolio;

/**
 * @Author 韦延伦
 * @Description 根据id查找一级作品分类的Mapper接口
 * @Date 2020/8/4 15:03
 **/
public interface FirstPortFolioMapper {
    /**
     * 根据id查找一级作品分类
     * @param id
     * @return FirstPortFolio
     */
    FirstPortFolio getFirstPortfolio(int id);

    int getFirstPortfolioCount();
}