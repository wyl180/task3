package com.jnshu.dao;
import com.jnshu.pojo.SecondPortFolio;
/**
 * @Author 韦延伦
 * @Description 获取二级作品分类下所有作品的Mapper
 * @Date 2020/8/4 15:09
 **/
public interface SecondPortFolioMapper {

    /**
     * 根据二级作品分类id查找改分类下的所有作品
     * @param id
     * @return SecondPortFolio
     */
    SecondPortFolio getAllWorkList(int id);


}