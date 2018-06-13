package com.leyuan.jiang.pojo.po;

public class ViolentCaseWithBLOBs extends ViolentCase {
    private String appeal;

    private String remarks;

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal == null ? null : appeal.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}