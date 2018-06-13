package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class ViolentPrivacy {
    private Long id;

    private String name;

    private Date createTime;

    private String crimeHistory;

    private String disease;

    private String diseaseHistory;

    private String domesticViolenceHistory;

    private Boolean mentalIllness;

    private Boolean privacy;

    private Date updateTime;

    private Long violentPersonnelId;

    private String illnessDetail;

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

    public String getCrimeHistory() {
        return crimeHistory;
    }

    public void setCrimeHistory(String crimeHistory) {
        this.crimeHistory = crimeHistory == null ? null : crimeHistory.trim();
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease == null ? null : disease.trim();
    }

    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
    }

    public String getDomesticViolenceHistory() {
        return domesticViolenceHistory;
    }

    public void setDomesticViolenceHistory(String domesticViolenceHistory) {
        this.domesticViolenceHistory = domesticViolenceHistory == null ? null : domesticViolenceHistory.trim();
    }

    public Boolean getMentalIllness() {
        return mentalIllness;
    }

    public void setMentalIllness(Boolean mentalIllness) {
        this.mentalIllness = mentalIllness;
    }

    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getViolentPersonnelId() {
        return violentPersonnelId;
    }

    public void setViolentPersonnelId(Long violentPersonnelId) {
        this.violentPersonnelId = violentPersonnelId;
    }

    public String getIllnessDetail() {
        return illnessDetail;
    }

    public void setIllnessDetail(String illnessDetail) {
        this.illnessDetail = illnessDetail == null ? null : illnessDetail.trim();
    }
}