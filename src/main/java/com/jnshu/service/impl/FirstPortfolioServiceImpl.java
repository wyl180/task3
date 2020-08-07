package com.jnshu.service.impl;

import com.jnshu.dao.FirstPortFolioMapper;
import com.jnshu.pojo.FirstPortFolio;
import com.jnshu.service.FirstPortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName FirstPortfolioServiceImpl
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 20:01
 * @Version 1.0
 */
@Service
public class FirstPortfolioServiceImpl implements FirstPortfolioService {
    @Autowired
    FirstPortFolioMapper firstPortFolioMapper;
    @Override
    public FirstPortFolio getFirstPortfolio(int id) {
        return firstPortFolioMapper.getFirstPortfolio(id);
    }


}
