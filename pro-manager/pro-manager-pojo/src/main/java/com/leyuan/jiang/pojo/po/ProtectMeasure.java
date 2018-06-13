package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class ProtectMeasure {
    private Long id;

    private String name;

    private String code;

    private String content;

    private Date createTime;

    private Date updateTime;

    private Long personalSafetyProtectionOrderId;

    private String delFlag;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public Long getPersonalSafetyProtectionOrderId() {
        return personalSafetyProtectionOrderId;
    }

    public void setPersonalSafetyProtectionOrderId(Long personalSafetyProtectionOrderId) {
        this.personalSafetyProtectionOrderId = personalSafetyProtectionOrderId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}