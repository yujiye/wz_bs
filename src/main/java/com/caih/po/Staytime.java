package com.caih.po;

import java.util.Date;

public class Staytime {
    private String id;

    private String mounth;

    private String dat;

    private String provincegxid;

    private String provincegxname;

    private String cityid;

    private String localcityname;

    private String nday;

    private String peoplenum;

    private String remoteprovincename;

    private String remotecityname;

    private String remoteprovinceid;

    private String remotecityid;

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

    public String getProvincegxid() {
        return provincegxid;
    }

    public void setProvincegxid(String provincegxid) {
        this.provincegxid = provincegxid == null ? null : provincegxid.trim();
    }

    public String getProvincegxname() {
        return provincegxname;
    }

    public void setProvincegxname(String provincegxname) {
        this.provincegxname = provincegxname == null ? null : provincegxname.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getLocalcityname() {
        return localcityname;
    }

    public void setLocalcityname(String localcityname) {
        this.localcityname = localcityname == null ? null : localcityname.trim();
    }

    public String getNday() {
        return nday;
    }

    public void setNday(String nday) {
        this.nday = nday == null ? null : nday.trim();
    }

    public String getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(String peoplenum) {
        this.peoplenum = peoplenum == null ? null : peoplenum.trim();
    }

    public String getRemoteprovincename() {
        return remoteprovincename;
    }

    public void setRemoteprovincename(String remoteprovincename) {
        this.remoteprovincename = remoteprovincename == null ? null : remoteprovincename.trim();
    }

    public String getRemotecityname() {
        return remotecityname;
    }

    public void setRemotecityname(String remotecityname) {
        this.remotecityname = remotecityname == null ? null : remotecityname.trim();
    }

    public String getRemoteprovinceid() {
        return remoteprovinceid;
    }

    public void setRemoteprovinceid(String remoteprovinceid) {
        this.remoteprovinceid = remoteprovinceid == null ? null : remoteprovinceid.trim();
    }

    public String getRemotecityid() {
        return remotecityid;
    }

    public void setRemotecityid(String remotecityid) {
        this.remotecityid = remotecityid == null ? null : remotecityid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}