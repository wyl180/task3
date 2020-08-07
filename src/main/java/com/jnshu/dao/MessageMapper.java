package com.jnshu.dao;

import com.jnshu.pojo.Message;


/**
 * @Author 韦延伦
 * @Description 游客留言的Mapper接口
 * @Date 2020/8/4 15:07
 **/
public interface MessageMapper {
    /**
     * 游客留言的方法
     * @param message
     * @return java.lang.Integer
     */
    int insertMessage(Message message);


}