package com.caih.po;

import java.util.Date;

public class Touristtrack {
    private String id;

    private String mounth;

    private String dat;

    private String provincegxid;

    private String provincegxname;

    private String cityid;

    private String localcityname;

    private String remoteprovinceid;

    private String remoteprovincename;

    private String areaid;

    private String areaname;

    private String lng;

    private String lat;

    private String usernumber;

    private String scenicorderv;

    private String countryorderv;

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

    public String getRemoteprovinceid() {
        return remoteprovinceid;
    }

    public void setRemoteprovinceid(String remoteprovinceid) {
        this.remoteprovinceid = remoteprovinceid == null ? null : remoteprovinceid.trim();
    }

    public String getRemoteprovincename() {
        return remoteprovincename;
    }

    public void setRemoteprovincename(String remoteprovincename) {
        this.remoteprovincename = remoteprovincename == null ? null : remoteprovincename.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber == null ? null : usernumber.trim();
    }

    public String getScenicorderv() {
        return scenicorderv;
    }

    public void setScenicorderv(String scenicorderv) {
        this.scenicorderv = scenicorderv == null ? null : scenicorderv.trim();
    }

    public String getCountryorderv() {
        return countryorderv;
    }

    public void setCountryorderv(String countryorderv) {
        this.countryorderv = countryorderv == null ? null : countryorderv.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}