package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class MeettingRecord {
    private Long id;

    private String name;

    private Date createTime;

    private String importantParts;

    private String psychologicalBehavior;

    private String psychologicalConsultant;

    private Date updateTime;

    private Long violentMeettingId;

    private String url;

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

    public String getImportantParts() {
        return importantParts;
    }

    public void setImportantParts(String importantParts) {
        this.importantParts = importantParts == null ? null : importantParts.trim();
    }

    public String getPsychologicalBehavior() {
        return psychologicalBehavior;
    }

    public void setPsychologicalBehavior(String psychologicalBehavior) {
        this.psychologicalBehavior = psychologicalBehavior == null ? null : psychologicalBehavior.trim();
    }

    public String getPsychologicalConsultant() {
        return psychologicalConsultant;
    }

    public void setPsychologicalConsultant(String psychologicalConsultant) {
        this.psychologicalConsultant = psychologicalConsultant == null ? null : psychologicalConsultant.trim();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}