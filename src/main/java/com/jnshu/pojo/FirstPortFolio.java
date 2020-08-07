package com.jnshu.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
/**
 * @Author 韦延伦
 * @Description 一级分类实体类
 * @Date 2020/8/4 14:34
 **/
public class FirstPortFolio {
    /**一级分类id*/

    private Integer id;
    /**一级分类名称*/
    private String name;
    /**创建时间*/

    private Long createAt;
    /**更新时间*/

    private Long updateAt;
    /**创建人*/

    private String createBy;
    /**更新人*/

    private String updateBy;
    /**一级分类下的二级分类菜单列表*/
    private List<SecondPortFolio> secondPortFolioList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public List<SecondPortFolio> getSecondPortFolioList() {
        return secondPortFolioList;
    }

    public void setSecondPortFolioList(List<SecondPortFolio> secondPortFolioList) {
        this.secondPortFolioList = secondPortFolioList;
    }

    @Override
    public String toString() {
        return "FirstPortFolio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", secondPortFolioList=" + secondPortFolioList +
                '}';
    }
}