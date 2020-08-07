package com.jnshu.service.impl;

import com.jnshu.dao.WorksMapper;
import com.jnshu.pojo.Works;
import com.jnshu.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName FindServiceImpl
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 21:28
 * @Version 1.0
 */
@Service
public class FindServiceImpl implements FindService {
    @Autowired
    WorksMapper worksMapper;
    @Override
    public List<Works> selectByKeyword(String keyword) {
        return worksMapper.selectByKeyword(keyword);
    }
}
