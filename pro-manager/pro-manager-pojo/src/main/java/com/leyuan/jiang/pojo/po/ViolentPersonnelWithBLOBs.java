package com.leyuan.jiang.pojo.po;

public class ViolentPersonnelWithBLOBs extends ViolentPersonnel {
    private String illnessDetail;

    private String vusersig;

    public String getIllnessDetail() {
        return illnessDetail;
    }

    public void setIllnessDetail(String illnessDetail) {
        this.illnessDetail = illnessDetail == null ? null : illnessDetail.trim();
    }

    public String getVusersig() {
        return vusersig;
    }

    public void setVusersig(String vusersig) {
        this.vusersig = vusersig == null ? null : vusersig.trim();
    }
}