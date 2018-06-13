package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class ViolentMsg {
    private Long id;

    private String name;

    private Date createTime;

    private Boolean isFile;

    private Boolean isRead;

    private String sender;

    private Long violentMeettingId;

    private Long violentPersonnelId;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsFile() {
        return isFile;
    }

    public void setIsFile(Boolean isFile) {
        this.isFile = isFile;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public Long getViolentMeettingId() {
        return violentMeettingId;
    }

    public void setViolentMeettingId(Long violentMeettingId) {
        this.violentMeettingId = violentMeettingId;
    }

    public Long getViolentPersonnelId() {
        return violentPersonnelId;
    }

    public void setViolentPersonnelId(Long violentPersonnelId) {
        this.violentPersonnelId = violentPersonnelId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}