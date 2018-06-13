package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class PsyReport {
    private Long id;

    private String name;

    private String address;

    private String content;

    private String counselor;

    private Date createTime;

    private Integer meetingHour;

    private Integer meetingMin;

    private String seeMeetingId;

    private Date time;

    private Date updateTime;

    private Long violentMeettingId;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor == null ? null : counselor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMeetingHour() {
        return meetingHour;
    }

    public void setMeetingHour(Integer meetingHour) {
        this.meetingHour = meetingHour;
    }

    public Integer getMeetingMin() {
        return meetingMin;
    }

    public void setMeetingMin(Integer meetingMin) {
        this.meetingMin = meetingMin;
    }

    public String getSeeMeetingId() {
        return seeMeetingId;
    }

    public void setSeeMeetingId(String seeMeetingId) {
        this.seeMeetingId = seeMeetingId == null ? null : seeMeetingId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getViolentMeettingId() {
        return violentMeettingId;
    }

    public void setViolentMeettingId(Long violentMeettingId) {
        this.violentMeettingId = violentMeettingId;
    }
}