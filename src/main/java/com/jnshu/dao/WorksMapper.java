package com.jnshu.dao;

import com.jnshu.pojo.Works;

import java.util.List;
/**
 * @Author 韦延伦
 * @Description 获取作品相关信息和根据作品名称和作品简介的关键字搜索的Mapper
 * @Date 2020/8/4 15:14
 **/
public interface WorksMapper {
    /**
     *根据关键字搜索作品
     * @Param [keyword]
     * @return java.util.List<com.jnshu.pojo.Works>
     **/
    List<Works> selectByKeyword(String keyword);
    /**
     * 一对多这个作品详情(有留言)
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