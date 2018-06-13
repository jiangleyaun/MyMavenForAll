package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class ViolentCaseOrangeDiary {
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Long orangeDiaryId;

    private Long violentCaseId;

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOrangeDiaryId() {
        return orangeDiaryId;
    }

    public void setOrangeDiaryId(Long orangeDiaryId) {
        this.orangeDiaryId = orangeDiaryId;
    }

    public Long getViolentCaseId() {
        return violentCaseId;
    }

    public void setViolentCaseId(Long violentCaseId) {
        this.violentCaseId = violentCaseId;
    }
}