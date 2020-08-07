package com.jnshu.pojo;
/**
 * @Author 韦延伦
 * @Description banner实体类
 * @Date 2020/8/4 13:33
 **/
public class Banner {
    /**id*/
    private Integer id;
    /**图片链接*/
    private String url;
    /**创建人*/
    private String createBy;
    /**更新人*/
    private String updateBy;
    /**创建时间*/
    private Long createAt;
    /**更新时间*/
    private Long updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
}