package com.jnshu.service.impl;

import com.jnshu.dao.MessageMapper;
import com.jnshu.dao.WorksMapper;
import com.jnshu.pojo.Message;
import com.jnshu.pojo.Works;
import com.jnshu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MessageServiceImpl
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 13:07
 * @Version 1.0
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Autowired
    WorksMapper worksMapper;
    @Override
    public int addMessage(Message message) {
        return  messageMapper.insertMessage(message);
    }




}
