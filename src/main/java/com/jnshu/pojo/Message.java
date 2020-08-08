package com.jnshu.pojo;

/**
 * @Author 韦延伦
 * @Description 留言实体类
 * @Date 2020/8/4 14:36
 **/


public class Message {
    private int id;
    /**留言内容*/
    private String content;
   /**留言时间*/
    private long messageTime;
    /**作品id*/
    private int worksId;
    /**游客昵称*/
    private String touristName;
    /**留言状态，0普通留言，1,精选留言*/
    private int status;
    /**回复人*/
    private String replyName;
    /**回复内容*/
    private String replyContent;
    /**回复时间*/
    private String replyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public int getWorksId() {
        return worksId;
    }

    public void setWorksId(int worksId) {
        this.worksId = worksId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", messageTime=" + messageTime +
                ", worksId=" + worksId +
                ", touristName='" + touristName + '\'' +
                ", status=" + status +
                ", replyName='" + replyName + '\'' +
                ", replyContent='" + replyContent + '\'' +
                ", replyTime='" + replyTime + '\'' +
                '}';
    }
}