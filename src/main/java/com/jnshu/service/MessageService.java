package com.jnshu.service;
import com.jnshu.pojo.Message;
import com.jnshu.pojo.Works;

/**
 * @ClassName MessageService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 12:08
 * @Version 1.0
 */
public interface MessageService  {
    /**
     * 游客评论
     * @param message
     * @return
     */
    int addMessage(Message message);


}
