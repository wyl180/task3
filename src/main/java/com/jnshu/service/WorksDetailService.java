package com.jnshu.service;

import com.jnshu.pojo.Works;

/**
 * @ClassName WorksDetailService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 22:45
 * @Version 1.0
 */
public interface WorksDetailService {

    /**
     * 查看作品详情(有留言)
     * @param id
     * @return
     */
    Works getWorksDetail(int id);
    /**
     * 单表查询作品表(无留言)
     * @param id
     * @return
     */
    Works selectWorksById(int id);
}
