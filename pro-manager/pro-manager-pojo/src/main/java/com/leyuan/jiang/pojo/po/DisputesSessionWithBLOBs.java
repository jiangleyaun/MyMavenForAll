package com.leyuan.jiang.pojo.po;

public class DisputesSessionWithBLOBs extends DisputesSession {
    private String opin;

    private String report;

    public String getOpin() {
        return opin;
    }

    public void setOpin(String opin) {
        this.opin = opin == null ? null : opin.trim();
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
    }
}