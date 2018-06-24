package com.caih.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaytimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaytimeExample() {
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

        public Criteria andProvincegxidIsNull() {
            addCriterion("provinceGXId is null");
            return (Criteria) this;
        }

        public Criteria andProvincegxidIsNotNull() {
            addCriterion("provinceGXId is not null");
            return (Criteria) this;
        }

        public Criteria andProvincegxidEqualTo(String value) {
            addCriterion("provinceGXId =", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidNotEqualTo(String value) {
            addCriterion("provinceGXId <>", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidGreaterThan(String value) {
            addCriterion("provinceGXId >", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidGreaterThanOrEqualTo(String value) {
            addCriterion("provinceGXId >=", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidLessThan(String value) {
            addCriterion("provinceGXId <", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidLessThanOrEqualTo(String value) {
            addCriterion("provinceGXId <=", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidLike(String value) {
            addCriterion("provinceGXId like", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidNotLike(String value) {
            addCriterion("provinceGXId not like", value, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidIn(List<String> values) {
            addCriterion("provinceGXId in", values, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidNotIn(List<String> values) {
            addCriterion("provinceGXId not in", values, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidBetween(String value1, String value2) {
            addCriterion("provinceGXId between", value1, value2, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxidNotBetween(String value1, String value2) {
            addCriterion("provinceGXId not between", value1, value2, "provincegxid");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameIsNull() {
            addCriterion("provinceGXName is null");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameIsNotNull() {
            addCriterion("provinceGXName is not null");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameEqualTo(String value) {
            addCriterion("provinceGXName =", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameNotEqualTo(String value) {
            addCriterion("provinceGXName <>", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameGreaterThan(String value) {
            addCriterion("provinceGXName >", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameGreaterThanOrEqualTo(String value) {
            addCriterion("provinceGXName >=", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameLessThan(String value) {
            addCriterion("provinceGXName <", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameLessThanOrEqualTo(String value) {
            addCriterion("provinceGXName <=", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameLike(String value) {
            addCriterion("provinceGXName like", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameNotLike(String value) {
            addCriterion("provinceGXName not like", value, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameIn(List<String> values) {
            addCriterion("provinceGXName in", values, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameNotIn(List<String> values) {
            addCriterion("provinceGXName not in", values, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameBetween(String value1, String value2) {
            addCriterion("provinceGXName between", value1, value2, "provincegxname");
            return (Criteria) this;
        }

        public Criteria andProvincegxnameNotBetween(String value1, String value2) {
            addCriterion("provinceGXName not between", value1, value2, "provincegxname");
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

        public Criteria andNdayIsNull() {
            addCriterion("nDay is null");
            return (Criteria) this;
        }

        public Criteria andNdayIsNotNull() {
            addCriterion("nDay is not null");
            return (Criteria) this;
        }

        public Criteria andNdayEqualTo(String value) {
            addCriterion("nDay =", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayNotEqualTo(String value) {
            addCriterion("nDay <>", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayGreaterThan(String value) {
            addCriterion("nDay >", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayGreaterThanOrEqualTo(String value) {
            addCriterion("nDay >=", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayLessThan(String value) {
            addCriterion("nDay <", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayLessThanOrEqualTo(String value) {
            addCriterion("nDay <=", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayLike(String value) {
            addCriterion("nDay like", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayNotLike(String value) {
            addCriterion("nDay not like", value, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayIn(List<String> values) {
            addCriterion("nDay in", values, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayNotIn(List<String> values) {
            addCriterion("nDay not in", values, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayBetween(String value1, String value2) {
            addCriterion("nDay between", value1, value2, "nday");
            return (Criteria) this;
        }

        public Criteria andNdayNotBetween(String value1, String value2) {
            addCriterion("nDay not between", value1, value2, "nday");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIsNull() {
            addCriterion("peopleNum is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIsNotNull() {
            addCriterion("peopleNum is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumEqualTo(String value) {
            addCriterion("peopleNum =", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotEqualTo(String value) {
            addCriterion("peopleNum <>", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumGreaterThan(String value) {
            addCriterion("peopleNum >", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumGreaterThanOrEqualTo(String value) {
            addCriterion("peopleNum >=", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLessThan(String value) {
            addCriterion("peopleNum <", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLessThanOrEqualTo(String value) {
            addCriterion("peopleNum <=", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLike(String value) {
            addCriterion("peopleNum like", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotLike(String value) {
            addCriterion("peopleNum not like", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIn(List<String> values) {
            addCriterion("peopleNum in", values, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotIn(List<String> values) {
            addCriterion("peopleNum not in", values, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumBetween(String value1, String value2) {
            addCriterion("peopleNum between", value1, value2, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotBetween(String value1, String value2) {
            addCriterion("peopleNum not between", value1, value2, "peoplenum");
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

        public Criteria andRemotecitynameIsNull() {
            addCriterion("remoteCityName is null");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameIsNotNull() {
            addCriterion("remoteCityName is not null");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameEqualTo(String value) {
            addCriterion("remoteCityName =", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameNotEqualTo(String value) {
            addCriterion("remoteCityName <>", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameGreaterThan(String value) {
            addCriterion("remoteCityName >", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameGreaterThanOrEqualTo(String value) {
            addCriterion("remoteCityName >=", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameLessThan(String value) {
            addCriterion("remoteCityName <", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameLessThanOrEqualTo(String value) {
            addCriterion("remoteCityName <=", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameLike(String value) {
            addCriterion("remoteCityName like", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameNotLike(String value) {
            addCriterion("remoteCityName not like", value, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameIn(List<String> values) {
            addCriterion("remoteCityName in", values, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameNotIn(List<String> values) {
            addCriterion("remoteCityName not in", values, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameBetween(String value1, String value2) {
            addCriterion("remoteCityName between", value1, value2, "remotecityname");
            return (Criteria) this;
        }

        public Criteria andRemotecitynameNotBetween(String value1, String value2) {
            addCriterion("remoteCityName not between", value1, value2, "remotecityname");
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

        public Criteria andRemotecityidIsNull() {
            addCriterion("remoteCityId is null");
            return (Criteria) this;
        }

        public Criteria andRemotecityidIsNotNull() {
            addCriterion("remoteCityId is not null");
            return (Criteria) this;
        }

        public Criteria andRemotecityidEqualTo(String value) {
            addCriterion("remoteCityId =", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidNotEqualTo(String value) {
            addCriterion("remoteCityId <>", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidGreaterThan(String value) {
            addCriterion("remoteCityId >", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidGreaterThanOrEqualTo(String value) {
            addCriterion("remoteCityId >=", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidLessThan(String value) {
            addCriterion("remoteCityId <", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidLessThanOrEqualTo(String value) {
            addCriterion("remoteCityId <=", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidLike(String value) {
            addCriterion("remoteCityId like", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidNotLike(String value) {
            addCriterion("remoteCityId not like", value, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidIn(List<String> values) {
            addCriterion("remoteCityId in", values, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidNotIn(List<String> values) {
            addCriterion("remoteCityId not in", values, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidBetween(String value1, String value2) {
            addCriterion("remoteCityId between", value1, value2, "remotecityid");
            return (Criteria) this;
        }

        public Criteria andRemotecityidNotBetween(String value1, String value2) {
            addCriterion("remoteCityId not between", value1, value2, "remotecityid");
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