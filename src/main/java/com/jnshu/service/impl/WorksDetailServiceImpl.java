package com.jnshu.service.impl;

import com.jnshu.dao.WorksMapper;
import com.jnshu.pojo.Works;
import com.jnshu.service.WorksDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName WorksDetailServiceImpl
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 22:46
 * @Version 1.0
 */
@Service
public class WorksDetailServiceImpl implements WorksDetailService {
    @Autowired
    WorksMapper worksMapper;

    @Override
    public Works getWorksDetail(int id) {
        return worksMapper.getWorksDetail(id);
    }

    @Override
    public Works selectWorksById(int id) {
        return worksMapper.selectWorksById(id);
    }
}
