package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class DisputesData {
    private Long id;

    private String name;

    private Long disputesId;

    private Long disputesMessageId;

    private Date createTime;

    private Date updateTime;

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

    public Long getDisputesId() {
        return disputesId;
    }

    public void setDisputesId(Long disputesId) {
        this.disputesId = disputesId;
    }

    public Long getDisputesMessageId() {
        return disputesMessageId;
    }

    public void setDisputesMessageId(Long disputesMessageId) {
        this.disputesMessageId = disputesMessageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}