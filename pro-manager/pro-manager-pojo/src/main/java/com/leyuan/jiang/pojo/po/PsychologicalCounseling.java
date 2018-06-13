package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class PsychologicalCounseling {
    private Long id;

    private String name;

    private Date createTime;

    private Integer number;

    private String reservationType;

    private String serviceNo;

    private String status;

    private Date updateTime;

    private Long camId;

    private Long reservationOrgId;

    private Long violentCaseId;

    private Date appointmentDate;

    private String timeRange;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType == null ? null : reservationType.trim();
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

    public Long getCamId() {
        return camId;
    }

    public void setCamId(Long camId) {
        this.camId = camId;
    }

    public Long getReservationOrgId() {
        return reservationOrgId;
    }

    public void setReservationOrgId(Long reservationOrgId) {
        this.reservationOrgId = reservationOrgId;
    }

    public Long getViolentCaseId() {
        return violentCaseId;
    }

    public void setViolentCaseId(Long violentCaseId) {
        this.violentCaseId = violentCaseId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange == null ? null : timeRange.trim();
    }
}