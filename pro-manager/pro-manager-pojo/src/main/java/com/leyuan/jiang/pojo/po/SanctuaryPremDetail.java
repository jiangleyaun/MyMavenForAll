package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class SanctuaryPremDetail {
    private Long id;

    private Date createDate;

    private Long sanctuaryId;

    private String status;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getSanctuaryId() {
        return sanctuaryId;
    }

    public void setSanctuaryId(Long sanctuaryId) {
        this.sanctuaryId = sanctuaryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}