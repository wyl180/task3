package com.jnshu.service;

import com.jnshu.pojo.FirstPortFolio;

import java.util.List;

/**
 * @ClassName FirstPortfolio
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 19:59
 * @Version 1.0
 */
public interface FirstPortfolioService {
    /**
     * 查找一级导航下的二级导航
     * @param id
     * @return
     */
    FirstPortFolio getFirstPortfolio(int id);

    /**
     * 查看全部一级导航
     * @return
     */
    List<FirstPortFolio> getAllFirstPortFolio();
}
