package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class ViolentVideo {
    private Long id;

    private String name;

    private Date createTime;

    private Date endTime;

    private String streamId;

    private String type;

    private String url;

    private Long violentMeettingId;

    private Long violentPersonnelId;

    private String apply;

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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId == null ? null : streamId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getViolentMeettingId() {
        return violentMeettingId;
    }

    public void setViolentMeettingId(Long violentMeettingId) {
        this.violentMeettingId = violentMeettingId;
    }

    public Long getViolentPersonnelId() {
        return violentPersonnelId;
    }

    public void setViolentPersonnelId(Long violentPersonnelId) {
        this.violentPersonnelId = violentPersonnelId;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply == null ? null : apply.trim();
    }
}