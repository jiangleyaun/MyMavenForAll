package com.leyuan.jiang.pojo.po;

public class ViolentLiveMember {
    private Long id;

    private String name;

    private String code;

    private String content;

    private Long violentPersonnelId;

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

    public Long getViolentPersonnelId() {
        return violentPersonnelId;
    }

    public void setViolentPersonnelId(Long violentPersonnelId) {
        this.violentPersonnelId = violentPersonnelId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}