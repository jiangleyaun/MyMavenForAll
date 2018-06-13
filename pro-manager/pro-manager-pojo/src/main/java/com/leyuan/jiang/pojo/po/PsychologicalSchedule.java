package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class PsychologicalSchedule {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Long customer;

    private Long counselorId;

    private Date workDay;

    private String workType;

    private String name;

    private Long userId;

    private Long psychologicalCounselingId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public Long getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(Long counselorId) {
        this.counselorId = counselorId;
    }

    public Date getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Date workDay) {
        this.workDay = workDay;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType == null ? null : workType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPsychologicalCounselingId() {
        return psychologicalCounselingId;
    }

    public void setPsychologicalCounselingId(Long psychologicalCounselingId) {
        this.psychologicalCounselingId = psychologicalCounselingId;
    }
}