package com.caih.po;

import java.util.Date;

public class Scenicflowhours {
    private String id;

    private String monthId;

    private String dayId;

    private String hourId;

    private String provName;

    private String provId;

    private String areaName;

    private String areaNo;

    private String scenicCode;

    private String scenicName;

    private String fromProvno;

    private String fromProvnoName;

    private String fromAreaNo;

    private String fromAreaName;

    private String usersum;

    private String sum;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMonthId() {
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId == null ? null : monthId.trim();
    }

    public String getDayId() {
        return dayId;
    }

    public void setDayId(String dayId) {
        this.dayId = dayId == null ? null : dayId.trim();
    }

    public String getHourId() {
        return hourId;
    }

    public void setHourId(String hourId) {
        this.hourId = hourId == null ? null : hourId.trim();
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId == null ? null : provId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo == null ? null : areaNo.trim();
    }

    public String getScenicCode() {
        return scenicCode;
    }

    public void setScenicCode(String scenicCode) {
        this.scenicCode = scenicCode == null ? null : scenicCode.trim();
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getFromProvno() {
        return fromProvno;
    }

    public void setFromProvno(String fromProvno) {
        this.fromProvno = fromProvno == null ? null : fromProvno.trim();
    }

    public String getFromProvnoName() {
        return fromProvnoName;
    }

    public void setFromProvnoName(String fromProvnoName) {
        this.fromProvnoName = fromProvnoName == null ? null : fromProvnoName.trim();
    }

    public String getFromAreaNo() {
        return fromAreaNo;
    }

    public void setFromAreaNo(String fromAreaNo) {
        this.fromAreaNo = fromAreaNo == null ? null : fromAreaNo.trim();
    }

    public String getFromAreaName() {
        return fromAreaName;
    }

    public void setFromAreaName(String fromAreaName) {
        this.fromAreaName = fromAreaName == null ? null : fromAreaName.trim();
    }

    public String getUsersum() {
        return usersum;
    }

    public void setUsersum(String usersum) {
        this.usersum = usersum == null ? null : usersum.trim();
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum == null ? null : sum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}