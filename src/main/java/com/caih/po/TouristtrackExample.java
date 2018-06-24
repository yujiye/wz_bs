package com.caih.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TouristtrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TouristtrackExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("areaId like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("areaId not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
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

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNull() {
            addCriterion("userNumber is null");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNotNull() {
            addCriterion("userNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumberEqualTo(String value) {
            addCriterion("userNumber =", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotEqualTo(String value) {
            addCriterion("userNumber <>", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThan(String value) {
            addCriterion("userNumber >", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThanOrEqualTo(String value) {
            addCriterion("userNumber >=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThan(String value) {
            addCriterion("userNumber <", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThanOrEqualTo(String value) {
            addCriterion("userNumber <=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLike(String value) {
            addCriterion("userNumber like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotLike(String value) {
            addCriterion("userNumber not like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberIn(List<String> values) {
            addCriterion("userNumber in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotIn(List<String> values) {
            addCriterion("userNumber not in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberBetween(String value1, String value2) {
            addCriterion("userNumber between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotBetween(String value1, String value2) {
            addCriterion("userNumber not between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andScenicordervIsNull() {
            addCriterion("scenicOrderV is null");
            return (Criteria) this;
        }

        public Criteria andScenicordervIsNotNull() {
            addCriterion("scenicOrderV is not null");
            return (Criteria) this;
        }

        public Criteria andScenicordervEqualTo(String value) {
            addCriterion("scenicOrderV =", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervNotEqualTo(String value) {
            addCriterion("scenicOrderV <>", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervGreaterThan(String value) {
            addCriterion("scenicOrderV >", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervGreaterThanOrEqualTo(String value) {
            addCriterion("scenicOrderV >=", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervLessThan(String value) {
            addCriterion("scenicOrderV <", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervLessThanOrEqualTo(String value) {
            addCriterion("scenicOrderV <=", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervLike(String value) {
            addCriterion("scenicOrderV like", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervNotLike(String value) {
            addCriterion("scenicOrderV not like", value, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervIn(List<String> values) {
            addCriterion("scenicOrderV in", values, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervNotIn(List<String> values) {
            addCriterion("scenicOrderV not in", values, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervBetween(String value1, String value2) {
            addCriterion("scenicOrderV between", value1, value2, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andScenicordervNotBetween(String value1, String value2) {
            addCriterion("scenicOrderV not between", value1, value2, "scenicorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervIsNull() {
            addCriterion("countryOrderV is null");
            return (Criteria) this;
        }

        public Criteria andCountryordervIsNotNull() {
            addCriterion("countryOrderV is not null");
            return (Criteria) this;
        }

        public Criteria andCountryordervEqualTo(String value) {
            addCriterion("countryOrderV =", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervNotEqualTo(String value) {
            addCriterion("countryOrderV <>", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervGreaterThan(String value) {
            addCriterion("countryOrderV >", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervGreaterThanOrEqualTo(String value) {
            addCriterion("countryOrderV >=", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervLessThan(String value) {
            addCriterion("countryOrderV <", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervLessThanOrEqualTo(String value) {
            addCriterion("countryOrderV <=", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervLike(String value) {
            addCriterion("countryOrderV like", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervNotLike(String value) {
            addCriterion("countryOrderV not like", value, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervIn(List<String> values) {
            addCriterion("countryOrderV in", values, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervNotIn(List<String> values) {
            addCriterion("countryOrderV not in", values, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervBetween(String value1, String value2) {
            addCriterion("countryOrderV between", value1, value2, "countryorderv");
            return (Criteria) this;
        }

        public Criteria andCountryordervNotBetween(String value1, String value2) {
            addCriterion("countryOrderV not between", value1, value2, "countryorderv");
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