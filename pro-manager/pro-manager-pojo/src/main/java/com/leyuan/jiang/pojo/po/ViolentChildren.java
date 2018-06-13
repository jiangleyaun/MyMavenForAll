package com.leyuan.jiang.pojo.po;

public class ViolentChildren {
    private Long id;

    private String name;

    private Integer age;

    private String sex;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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