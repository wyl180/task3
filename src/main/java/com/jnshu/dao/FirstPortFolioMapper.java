package com.jnshu.dao;

import com.jnshu.pojo.FirstPortFolio;

import java.util.List;

/**
 * @Author 韦延伦
 * @Description 根据id查找一级作品分类的Mapper接口
 * @Date 2020/8/4 15:03
 **/
public interface FirstPortFolioMapper {
    /**
     * 查找一级作品分类列表
     * @param
     * @return FirstPortFolio
     */
    List<FirstPortFolio> getFirstPortfolio();

    int getFirstPortfolioCount();


}