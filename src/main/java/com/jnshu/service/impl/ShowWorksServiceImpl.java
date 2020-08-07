package com.jnshu.service.impl;

import com.jnshu.dao.SecondPortFolioMapper;
import com.jnshu.pojo.SecondPortFolio;
import com.jnshu.service.ShowWorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ShowWorksServiceImpl
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 20:34
 * @Version 1.0
 */
@Service
public class ShowWorksServiceImpl implements ShowWorksService {
    @Autowired
    SecondPortFolioMapper secondPortFolioMapper;
    @Override
    public SecondPortFolio getAllWorkList(int id) {
        return secondPortFolioMapper.getAllWorkList(id);
    }
}
