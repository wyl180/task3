package com.jnshu.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
/**
 * @Author 韦延伦
 * @Description 二级分类实体类
 * @Date 2020/8/4 14:36
 **/
public class SecondPortFolio {
    /**二级分类id*/

    private Integer id;
    /**二级分类名字*/
    private String name;
    /**二级分类下的作品列表*/
    private List<Works> worksList;

    /**创建人*/

    private String createBy;
    /**更新人*/

    private String updateBy;
    /**创建时间*/

    private Long createAt;
    /**更新时间*/

    private Long updateAt;

    public List<Works> getWorksList() {
        return worksList;
    }

    public void setWorksList(List<Works> worksList) {
        this.worksList = worksList;
    }

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

    @Override
    public String toString() {
        return "SecondPortFolio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", worksList=" + worksList +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}