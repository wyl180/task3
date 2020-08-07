package com.jnshu.service.impl;

import com.jnshu.dao.IntroMapper;
import com.jnshu.pojo.Intro;
import com.jnshu.service.ShowIntroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ShowIntroServiceImpl
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 21:17
 * @Version 1.0
 */
@Service
public class ShowIntroServiceImpl implements ShowIntroService {
    @Autowired
    IntroMapper introMapper;
    @Override
    public Intro selectByType(int type) {
        return introMapper.selectByType(type);
    }
}
