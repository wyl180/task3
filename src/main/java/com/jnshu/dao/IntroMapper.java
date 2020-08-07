package com.jnshu.dao;

import com.jnshu.pojo.Intro;
/**
 * @Author 韦延伦
 * @Description 根据简介类型查找对应的简介内容的Mapper接口
 * @Date 2020/8/4 15:05
 **/
public interface IntroMapper {
    /**
     * 根据简介类型查找对应的简介内容
     * @param type
     * @return Intro
     */
    Intro selectByType(int type);

}