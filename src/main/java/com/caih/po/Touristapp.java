package com.caih.po;

import java.util.Date;

public class Touristapp {
    private String id;

    private String mounth;

    private String dat;

    private String remoteprovincename;

    private String remoteprovinceid;

    private String localcityname;

    private String cityid;

    private String areaId;

    private String areaname;

    private String appbigtype;

    private String appsmalltype;

    private String num;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMounth() {
        return mounth;
    }

    public void setMounth(String mounth) {
        this.mounth = mounth == null ? null : mounth.trim();
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat == null ? null : dat.trim();
    }

    public String getRemoteprovincename() {
        return remoteprovincename;
    }

    public void setRemoteprovincename(String remoteprovincename) {
        this.remoteprovincename = remoteprovincename == null ? null : remoteprovincename.trim();
    }

    public String getRemoteprovinceid() {
        return remoteprovinceid;
    }

    public void setRemoteprovinceid(String remoteprovinceid) {
        this.remoteprovinceid = remoteprovinceid == null ? null : remoteprovinceid.trim();
    }

    public String getLocalcityname() {
        return localcityname;
    }

    public void setLocalcityname(String localcityname) {
        this.localcityname = localcityname == null ? null : localcityname.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getAppbigtype() {
        return appbigtype;
    }

    public void setAppbigtype(String appbigtype) {
        this.appbigtype = appbigtype == null ? null : appbigtype.trim();
    }

    public String getAppsmalltype() {
        return appsmalltype;
    }

    public void setAppsmalltype(String appsmalltype) {
        this.appsmalltype = appsmalltype == null ? null : appsmalltype.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}