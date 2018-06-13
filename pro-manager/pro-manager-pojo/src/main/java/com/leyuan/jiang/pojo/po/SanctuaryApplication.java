package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class SanctuaryApplication {
    private Long id;

    private String name;

    private String address;

    private String contactHotline;

    private Date createTime;

    private String modeOfTransportation;

    private String serviceNo;

    private String status;

    private Date updateTime;

    private Long sanctuaryId;

    private Long violentCaseId;

    private Date arriveTime;

    private Date leaveTime;

    private String remindedOrNot;

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

    public String getContactHotline() {
        return contactHotline;
    }

    public void setContactHotline(String contactHotline) {
        this.contactHotline = contactHotline == null ? null : contactHotline.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModeOfTransportation() {
        return modeOfTransportation;
    }

    public void setModeOfTransportation(String modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation == null ? null : modeOfTransportation.trim();
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo == null ? null : serviceNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getSanctuaryId() {
        return sanctuaryId;
    }

    public void setSanctuaryId(Long sanctuaryId) {
        this.sanctuaryId = sanctuaryId;
    }

    public Long getViolentCaseId() {
        return violentCaseId;
    }

    public void setViolentCaseId(Long violentCaseId) {
        this.violentCaseId = violentCaseId;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getRemindedOrNot() {
        return remindedOrNot;
    }

    public void setRemindedOrNot(String remindedOrNot) {
        this.remindedOrNot = remindedOrNot == null ? null : remindedOrNot.trim();
    }
}