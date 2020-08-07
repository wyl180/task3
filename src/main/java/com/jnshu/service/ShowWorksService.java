package com.jnshu.service;

import com.jnshu.pojo.SecondPortFolio;

/**
 * @ClassName ShowWorksService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 20:33
 * @Version 1.0
 */
public interface ShowWorksService {
    /**
     * 查询二级导航下的所有作品
     * @param id
     * @return
     */
    SecondPortFolio getAllWorkList(int id);
}
