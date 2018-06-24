package com.caih.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TouristappExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TouristappExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMounthIsNull() {
            addCriterion("mounth is null");
            return (Criteria) this;
        }

        public Criteria andMounthIsNotNull() {
            addCriterion("mounth is not null");
            return (Criteria) this;
        }

        public Criteria andMounthEqualTo(String value) {
            addCriterion("mounth =", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthNotEqualTo(String value) {
            addCriterion("mounth <>", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthGreaterThan(String value) {
            addCriterion("mounth >", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthGreaterThanOrEqualTo(String value) {
            addCriterion("mounth >=", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthLessThan(String value) {
            addCriterion("mounth <", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthLessThanOrEqualTo(String value) {
            addCriterion("mounth <=", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthLike(String value) {
            addCriterion("mounth like", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthNotLike(String value) {
            addCriterion("mounth not like", value, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthIn(List<String> values) {
            addCriterion("mounth in", values, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthNotIn(List<String> values) {
            addCriterion("mounth not in", values, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthBetween(String value1, String value2) {
            addCriterion("mounth between", value1, value2, "mounth");
            return (Criteria) this;
        }

        public Criteria andMounthNotBetween(String value1, String value2) {
            addCriterion("mounth not between", value1, value2, "mounth");
            return (Criteria) this;
        }

        public Criteria andDatIsNull() {
            addCriterion("dat is null");
            return (Criteria) this;
        }

        public Criteria andDatIsNotNull() {
            addCriterion("dat is not null");
            return (Criteria) this;
        }

        public Criteria andDatEqualTo(String value) {
            addCriterion("dat =", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatNotEqualTo(String value) {
            addCriterion("dat <>", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatGreaterThan(String value) {
            addCriterion("dat >", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatGreaterThanOrEqualTo(String value) {
            addCriterion("dat >=", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatLessThan(String value) {
            addCriterion("dat <", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatLessThanOrEqualTo(String value) {
            addCriterion("dat <=", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatLike(String value) {
            addCriterion("dat like", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatNotLike(String value) {
            addCriterion("dat not like", value, "dat");
            return (Criteria) this;
        }

        public Criteria andDatIn(List<String> values) {
            addCriterion("dat in", values, "dat");
            return (Criteria) this;
        }

        public Criteria andDatNotIn(List<String> values) {
            addCriterion("dat not in", values, "dat");
            return (Criteria) this;
        }

        public Criteria andDatBetween(String value1, String value2) {
            addCriterion("dat between", value1, value2, "dat");
            return (Criteria) this;
        }

        public Criteria andDatNotBetween(String value1, String value2) {
            addCriterion("dat not between", value1, value2, "dat");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameIsNull() {
            addCriterion("remoteProvinceName is null");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameIsNotNull() {
            addCriterion("remoteProvinceName is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameEqualTo(String value) {
            addCriterion("remoteProvinceName =", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameNotEqualTo(String value) {
            addCriterion("remoteProvinceName <>", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameGreaterThan(String value) {
            addCriterion("remoteProvinceName >", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameGreaterThanOrEqualTo(String value) {
            addCriterion("remoteProvinceName >=", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameLessThan(String value) {
            addCriterion("remoteProvinceName <", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameLessThanOrEqualTo(String value) {
            addCriterion("remoteProvinceName <=", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameLike(String value) {
            addCriterion("remoteProvinceName like", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameNotLike(String value) {
            addCriterion("remoteProvinceName not like", value, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameIn(List<String> values) {
            addCriterion("remoteProvinceName in", values, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameNotIn(List<String> values) {
            addCriterion("remoteProvinceName not in", values, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameBetween(String value1, String value2) {
            addCriterion("remoteProvinceName between", value1, value2, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovincenameNotBetween(String value1, String value2) {
            addCriterion("remoteProvinceName not between", value1, value2, "remoteprovincename");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidIsNull() {
            addCriterion("remoteProvinceId is null");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidIsNotNull() {
            addCriterion("remoteProvinceId is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidEqualTo(String value) {
            addCriterion("remoteProvinceId =", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidNotEqualTo(String value) {
            addCriterion("remoteProvinceId <>", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidGreaterThan(String value) {
            addCriterion("remoteProvinceId >", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidGreaterThanOrEqualTo(String value) {
            addCriterion("remoteProvinceId >=", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidLessThan(String value) {
            addCriterion("remoteProvinceId <", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidLessThanOrEqualTo(String value) {
            addCriterion("remoteProvinceId <=", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidLike(String value) {
            addCriterion("remoteProvinceId like", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidNotLike(String value) {
            addCriterion("remoteProvinceId not like", value, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidIn(List<String> values) {
            addCriterion("remoteProvinceId in", values, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidNotIn(List<String> values) {
            addCriterion("remoteProvinceId not in", values, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidBetween(String value1, String value2) {
            addCriterion("remoteProvinceId between", value1, value2, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andRemoteprovinceidNotBetween(String value1, String value2) {
            addCriterion("remoteProvinceId not between", value1, value2, "remoteprovinceid");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameIsNull() {
            addCriterion("localcityName is null");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameIsNotNull() {
            addCriterion("localcityName is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameEqualTo(String value) {
            addCriterion("localcityName =", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameNotEqualTo(String value) {
            addCriterion("localcityName <>", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameGreaterThan(String value) {
            addCriterion("localcityName >", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameGreaterThanOrEqualTo(String value) {
            addCriterion("localcityName >=", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameLessThan(String value) {
            addCriterion("localcityName <", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameLessThanOrEqualTo(String value) {
            addCriterion("localcityName <=", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameLike(String value) {
            addCriterion("localcityName like", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameNotLike(String value) {
            addCriterion("localcityName not like", value, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameIn(List<String> values) {
            addCriterion("localcityName in", values, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameNotIn(List<String> values) {
            addCriterion("localcityName not in", values, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameBetween(String value1, String value2) {
            addCriterion("localcityName between", value1, value2, "localcityname");
            return (Criteria) this;
        }

        public Criteria andLocalcitynameNotBetween(String value1, String value2) {
            addCriterion("localcityName not between", value1, value2, "localcityname");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityId like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityId not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeIsNull() {
            addCriterion("appBigType is null");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeIsNotNull() {
            addCriterion("appBigType is not null");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeEqualTo(String value) {
            addCriterion("appBigType =", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeNotEqualTo(String value) {
            addCriterion("appBigType <>", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeGreaterThan(String value) {
            addCriterion("appBigType >", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeGreaterThanOrEqualTo(String value) {
            addCriterion("appBigType >=", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeLessThan(String value) {
            addCriterion("appBigType <", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeLessThanOrEqualTo(String value) {
            addCriterion("appBigType <=", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeLike(String value) {
            addCriterion("appBigType like", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeNotLike(String value) {
            addCriterion("appBigType not like", value, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeIn(List<String> values) {
            addCriterion("appBigType in", values, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeNotIn(List<String> values) {
            addCriterion("appBigType not in", values, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeBetween(String value1, String value2) {
            addCriterion("appBigType between", value1, value2, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppbigtypeNotBetween(String value1, String value2) {
            addCriterion("appBigType not between", value1, value2, "appbigtype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeIsNull() {
            addCriterion("appSmallType is null");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeIsNotNull() {
            addCriterion("appSmallType is not null");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeEqualTo(String value) {
            addCriterion("appSmallType =", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeNotEqualTo(String value) {
            addCriterion("appSmallType <>", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeGreaterThan(String value) {
            addCriterion("appSmallType >", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeGreaterThanOrEqualTo(String value) {
            addCriterion("appSmallType >=", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeLessThan(String value) {
            addCriterion("appSmallType <", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeLessThanOrEqualTo(String value) {
            addCriterion("appSmallType <=", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeLike(String value) {
            addCriterion("appSmallType like", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeNotLike(String value) {
            addCriterion("appSmallType not like", value, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeIn(List<String> values) {
            addCriterion("appSmallType in", values, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeNotIn(List<String> values) {
            addCriterion("appSmallType not in", values, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeBetween(String value1, String value2) {
            addCriterion("appSmallType between", value1, value2, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andAppsmalltypeNotBetween(String value1, String value2) {
            addCriterion("appSmallType not between", value1, value2, "appsmalltype");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}