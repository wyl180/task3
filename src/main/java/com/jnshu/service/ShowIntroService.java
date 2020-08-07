package com.jnshu.service;

import com.jnshu.pojo.Intro;

/**
 * @ClassName ShowIntroService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 21:15
 * @Version 1.0
 */
public interface ShowIntroService {
    /**
     * 根据简介类型查询简介表
     * @param type
     * @return
     */
    Intro selectByType(int type);
}
