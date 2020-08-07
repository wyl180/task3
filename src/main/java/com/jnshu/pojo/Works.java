package com.jnshu.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 韦延伦
 * @Description 作品实体类
 * @Date 2020/8/4 14:41
 **/
public class Works {
    /**
     * 作品id
     */

    private Integer id;
    /**
     * 作品名称
     */
    private String name;
    /**
     * 所属二级分类id
     */
    private Integer secondId;
    /**
     * 缩略图
     */
    private String tImage;
    /**
     * 作品简介
     */
    private String intro;
    /**
     * 详情图
     */

    private String dImage;
    /**
     * 作品类型,0.图片，1.视频，2.文字
     */
    private int type;
    /**
     * 视频
     */
    private String video;
    /**
     * 更新人
     */

    private String updateBy;
    /**
     * 创建时间
     */

    private Long createAt;
    /**
     * 更新时间
     */

    private Long updateAt;
    /**
     * 创建人
     */

    private String createBy;
    /**
     * 留言列表
     */

    private ArrayList<Message> messageList;

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
        this.name = name;
    }

    public Integer getSecondId() {
        return secondId;
    }

    public void setSecondId(Integer secondId) {
        this.secondId = secondId;
    }


    public String gettImage() {
        return tImage;
    }

    public void settImage(String tImage) {
        this.tImage = tImage;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getdImage() {
        return dImage;
    }

    public void setdImage(String dImage) {
        this.dImage = dImage;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
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
        this.createBy = createBy;
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(ArrayList<Message> messageList) {
        this.messageList = messageList;
    }

    @Override
    public String toString() {
        return "Works{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondId=" + secondId +
                ", tImage='" + tImage + '\'' +
                ", intro='" + intro + '\'' +
                ", dImage='" + dImage + '\'' +
                ", type=" + type +
                ", video='" + video + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}