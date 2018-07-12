package com.caih.vo;

public class ApprovalData {
    //当前排队人数
    private String linenumber;
    //今日累计受理
    private String accepttoday;
    //累计受理业务
    private String acceptsum;
    //平均受理时长
    private String acceptaverage;
    //在途业务
    private String onwork;
    //出证总数&累计出证
    private String hallissuing;

    public String getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(String linenumber) {
        this.linenumber = linenumber;
    }

    public String getAccepttoday() {
        return accepttoday;
    }

    public void setAccepttoday(String accepttoday) {
        this.accepttoday = accepttoday;
    }

    public String getAcceptsum() {
        return acceptsum;
    }

    public void setAcceptsum(String acceptsum) {
        this.acceptsum = acceptsum;
    }

    public String getAcceptaverage() {
        return acceptaverage;
    }

    public void setAcceptaverage(String acceptaverage) {
        this.acceptaverage = acceptaverage;
    }

    public String getOnwork() {
        return onwork;
    }

    public void setOnwork(String onwork) {
        this.onwork = onwork;
    }

    public String getHallissuing() {
        return hallissuing;
    }

    public void setHallissuing(String hallissuing) {
        this.hallissuing = hallissuing;
    }
}
