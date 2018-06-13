package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class ProtectOrder {
    private Long id;

    private String name;

    private Date createTime;

    private Boolean isSubmit;

    private String serviceNo;

    private String status;

    private Date updateTime;

    private Long organizationId;

    private Long violentCaseId;

    private String orgByAddressType;

    private String factAndReasons;

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

    public Boolean getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(Boolean isSubmit) {
        this.isSubmit = isSubmit;
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

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getViolentCaseId() {
        return violentCaseId;
    }

    public void setViolentCaseId(Long violentCaseId) {
        this.violentCaseId = violentCaseId;
    }

    public String getOrgByAddressType() {
        return orgByAddressType;
    }

    public void setOrgByAddressType(String orgByAddressType) {
        this.orgByAddressType = orgByAddressType == null ? null : orgByAddressType.trim();
    }

    public String getFactAndReasons() {
        return factAndReasons;
    }

    public void setFactAndReasons(String factAndReasons) {
        this.factAndReasons = factAndReasons == null ? null : factAndReasons.trim();
    }
}