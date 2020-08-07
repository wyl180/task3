package com.jnshu.service;

import com.jnshu.pojo.Works;

import java.util.List;

/**
 * @ClassName FindService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 21:27
 * @Version 1.0
 */
public interface FindService {
    /**
     * 根据关键字搜索
     * @param keyword
     * @return
     */
    List<Works> selectByKeyword(String keyword);
}
