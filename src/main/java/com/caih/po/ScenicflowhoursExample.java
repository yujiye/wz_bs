package com.caih.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicflowhoursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicflowhoursExample() {
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

        public Criteria andMonthIdIsNull() {
            addCriterion("month_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthIdIsNotNull() {
            addCriterion("month_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIdEqualTo(String value) {
            addCriterion("month_id =", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotEqualTo(String value) {
            addCriterion("month_id <>", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdGreaterThan(String value) {
            addCriterion("month_id >", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdGreaterThanOrEqualTo(String value) {
            addCriterion("month_id >=", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdLessThan(String value) {
            addCriterion("month_id <", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdLessThanOrEqualTo(String value) {
            addCriterion("month_id <=", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdLike(String value) {
            addCriterion("month_id like", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotLike(String value) {
            addCriterion("month_id not like", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdIn(List<String> values) {
            addCriterion("month_id in", values, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotIn(List<String> values) {
            addCriterion("month_id not in", values, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdBetween(String value1, String value2) {
            addCriterion("month_id between", value1, value2, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotBetween(String value1, String value2) {
            addCriterion("month_id not between", value1, value2, "monthId");
            return (Criteria) this;
        }

        public Criteria andDayIdIsNull() {
            addCriterion("day_id is null");
            return (Criteria) this;
        }

        public Criteria andDayIdIsNotNull() {
            addCriterion("day_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayIdEqualTo(String value) {
            addCriterion("day_id =", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotEqualTo(String value) {
            addCriterion("day_id <>", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdGreaterThan(String value) {
            addCriterion("day_id >", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdGreaterThanOrEqualTo(String value) {
            addCriterion("day_id >=", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLessThan(String value) {
            addCriterion("day_id <", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLessThanOrEqualTo(String value) {
            addCriterion("day_id <=", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLike(String value) {
            addCriterion("day_id like", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotLike(String value) {
            addCriterion("day_id not like", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdIn(List<String> values) {
            addCriterion("day_id in", values, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotIn(List<String> values) {
            addCriterion("day_id not in", values, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdBetween(String value1, String value2) {
            addCriterion("day_id between", value1, value2, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotBetween(String value1, String value2) {
            addCriterion("day_id not between", value1, value2, "dayId");
            return (Criteria) this;
        }

        public Criteria andHourIdIsNull() {
            addCriterion("hour_id is null");
            return (Criteria) this;
        }

        public Criteria andHourIdIsNotNull() {
            addCriterion("hour_id is not null");
            return (Criteria) this;
        }

        public Criteria andHourIdEqualTo(String value) {
            addCriterion("hour_id =", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotEqualTo(String value) {
            addCriterion("hour_id <>", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdGreaterThan(String value) {
            addCriterion("hour_id >", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdGreaterThanOrEqualTo(String value) {
            addCriterion("hour_id >=", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdLessThan(String value) {
            addCriterion("hour_id <", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdLessThanOrEqualTo(String value) {
            addCriterion("hour_id <=", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdLike(String value) {
            addCriterion("hour_id like", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotLike(String value) {
            addCriterion("hour_id not like", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdIn(List<String> values) {
            addCriterion("hour_id in", values, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotIn(List<String> values) {
            addCriterion("hour_id not in", values, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdBetween(String value1, String value2) {
            addCriterion("hour_id between", value1, value2, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotBetween(String value1, String value2) {
            addCriterion("hour_id not between", value1, value2, "hourId");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNull() {
            addCriterion("prov_name is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("prov_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("prov_name =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("prov_name <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("prov_name >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("prov_name >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("prov_name <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("prov_name <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("prov_name like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("prov_name not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("prov_name in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("prov_name not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("prov_name between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("prov_name not between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvIdIsNull() {
            addCriterion("prov_id is null");
            return (Criteria) this;
        }

        public Criteria andProvIdIsNotNull() {
            addCriterion("prov_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvIdEqualTo(String value) {
            addCriterion("prov_id =", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotEqualTo(String value) {
            addCriterion("prov_id <>", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdGreaterThan(String value) {
            addCriterion("prov_id >", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdGreaterThanOrEqualTo(String value) {
            addCriterion("prov_id >=", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdLessThan(String value) {
            addCriterion("prov_id <", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdLessThanOrEqualTo(String value) {
            addCriterion("prov_id <=", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdLike(String value) {
            addCriterion("prov_id like", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotLike(String value) {
            addCriterion("prov_id not like", value, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdIn(List<String> values) {
            addCriterion("prov_id in", values, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotIn(List<String> values) {
            addCriterion("prov_id not in", values, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdBetween(String value1, String value2) {
            addCriterion("prov_id between", value1, value2, "provId");
            return (Criteria) this;
        }

        public Criteria andProvIdNotBetween(String value1, String value2) {
            addCriterion("prov_id not between", value1, value2, "provId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNull() {
            addCriterion("area_no is null");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNotNull() {
            addCriterion("area_no is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNoEqualTo(String value) {
            addCriterion("area_no =", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotEqualTo(String value) {
            addCriterion("area_no <>", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThan(String value) {
            addCriterion("area_no >", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThanOrEqualTo(String value) {
            addCriterion("area_no >=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThan(String value) {
            addCriterion("area_no <", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThanOrEqualTo(String value) {
            addCriterion("area_no <=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLike(String value) {
            addCriterion("area_no like", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotLike(String value) {
            addCriterion("area_no not like", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoIn(List<String> values) {
            addCriterion("area_no in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotIn(List<String> values) {
            addCriterion("area_no not in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoBetween(String value1, String value2) {
            addCriterion("area_no between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotBetween(String value1, String value2) {
            addCriterion("area_no not between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andScenicCodeIsNull() {
            addCriterion("scenic_code is null");
            return (Criteria) this;
        }

        public Criteria andScenicCodeIsNotNull() {
            addCriterion("scenic_code is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCodeEqualTo(String value) {
            addCriterion("scenic_code =", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeNotEqualTo(String value) {
            addCriterion("scenic_code <>", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeGreaterThan(String value) {
            addCriterion("scenic_code >", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_code >=", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeLessThan(String value) {
            addCriterion("scenic_code <", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeLessThanOrEqualTo(String value) {
            addCriterion("scenic_code <=", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeLike(String value) {
            addCriterion("scenic_code like", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeNotLike(String value) {
            addCriterion("scenic_code not like", value, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeIn(List<String> values) {
            addCriterion("scenic_code in", values, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeNotIn(List<String> values) {
            addCriterion("scenic_code not in", values, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeBetween(String value1, String value2) {
            addCriterion("scenic_code between", value1, value2, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicCodeNotBetween(String value1, String value2) {
            addCriterion("scenic_code not between", value1, value2, "scenicCode");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNull() {
            addCriterion("scenic_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("scenic_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("scenic_name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("scenic_name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("scenic_name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("scenic_name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("scenic_name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("scenic_name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("scenic_name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("scenic_name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("scenic_name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("scenic_name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoIsNull() {
            addCriterion("from_provno is null");
            return (Criteria) this;
        }

        public Criteria andFromProvnoIsNotNull() {
            addCriterion("from_provno is not null");
            return (Criteria) this;
        }

        public Criteria andFromProvnoEqualTo(String value) {
            addCriterion("from_provno =", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNotEqualTo(String value) {
            addCriterion("from_provno <>", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoGreaterThan(String value) {
            addCriterion("from_provno >", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoGreaterThanOrEqualTo(String value) {
            addCriterion("from_provno >=", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoLessThan(String value) {
            addCriterion("from_provno <", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoLessThanOrEqualTo(String value) {
            addCriterion("from_provno <=", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoLike(String value) {
            addCriterion("from_provno like", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNotLike(String value) {
            addCriterion("from_provno not like", value, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoIn(List<String> values) {
            addCriterion("from_provno in", values, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNotIn(List<String> values) {
            addCriterion("from_provno not in", values, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoBetween(String value1, String value2) {
            addCriterion("from_provno between", value1, value2, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNotBetween(String value1, String value2) {
            addCriterion("from_provno not between", value1, value2, "fromProvno");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameIsNull() {
            addCriterion("from_provno_name is null");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameIsNotNull() {
            addCriterion("from_provno_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameEqualTo(String value) {
            addCriterion("from_provno_name =", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameNotEqualTo(String value) {
            addCriterion("from_provno_name <>", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameGreaterThan(String value) {
            addCriterion("from_provno_name >", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_provno_name >=", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameLessThan(String value) {
            addCriterion("from_provno_name <", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameLessThanOrEqualTo(String value) {
            addCriterion("from_provno_name <=", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameLike(String value) {
            addCriterion("from_provno_name like", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameNotLike(String value) {
            addCriterion("from_provno_name not like", value, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameIn(List<String> values) {
            addCriterion("from_provno_name in", values, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameNotIn(List<String> values) {
            addCriterion("from_provno_name not in", values, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameBetween(String value1, String value2) {
            addCriterion("from_provno_name between", value1, value2, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromProvnoNameNotBetween(String value1, String value2) {
            addCriterion("from_provno_name not between", value1, value2, "fromProvnoName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoIsNull() {
            addCriterion("from_area_no is null");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoIsNotNull() {
            addCriterion("from_area_no is not null");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoEqualTo(String value) {
            addCriterion("from_area_no =", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoNotEqualTo(String value) {
            addCriterion("from_area_no <>", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoGreaterThan(String value) {
            addCriterion("from_area_no >", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoGreaterThanOrEqualTo(String value) {
            addCriterion("from_area_no >=", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoLessThan(String value) {
            addCriterion("from_area_no <", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoLessThanOrEqualTo(String value) {
            addCriterion("from_area_no <=", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoLike(String value) {
            addCriterion("from_area_no like", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoNotLike(String value) {
            addCriterion("from_area_no not like", value, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoIn(List<String> values) {
            addCriterion("from_area_no in", values, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoNotIn(List<String> values) {
            addCriterion("from_area_no not in", values, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoBetween(String value1, String value2) {
            addCriterion("from_area_no between", value1, value2, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNoNotBetween(String value1, String value2) {
            addCriterion("from_area_no not between", value1, value2, "fromAreaNo");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameIsNull() {
            addCriterion("from_area_name is null");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameIsNotNull() {
            addCriterion("from_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameEqualTo(String value) {
            addCriterion("from_area_name =", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameNotEqualTo(String value) {
            addCriterion("from_area_name <>", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameGreaterThan(String value) {
            addCriterion("from_area_name >", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_area_name >=", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameLessThan(String value) {
            addCriterion("from_area_name <", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameLessThanOrEqualTo(String value) {
            addCriterion("from_area_name <=", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameLike(String value) {
            addCriterion("from_area_name like", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameNotLike(String value) {
            addCriterion("from_area_name not like", value, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameIn(List<String> values) {
            addCriterion("from_area_name in", values, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameNotIn(List<String> values) {
            addCriterion("from_area_name not in", values, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameBetween(String value1, String value2) {
            addCriterion("from_area_name between", value1, value2, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andFromAreaNameNotBetween(String value1, String value2) {
            addCriterion("from_area_name not between", value1, value2, "fromAreaName");
            return (Criteria) this;
        }

        public Criteria andUsersumIsNull() {
            addCriterion("usersum is null");
            return (Criteria) this;
        }

        public Criteria andUsersumIsNotNull() {
            addCriterion("usersum is not null");
            return (Criteria) this;
        }

        public Criteria andUsersumEqualTo(String value) {
            addCriterion("usersum =", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumNotEqualTo(String value) {
            addCriterion("usersum <>", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumGreaterThan(String value) {
            addCriterion("usersum >", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumGreaterThanOrEqualTo(String value) {
            addCriterion("usersum >=", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumLessThan(String value) {
            addCriterion("usersum <", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumLessThanOrEqualTo(String value) {
            addCriterion("usersum <=", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumLike(String value) {
            addCriterion("usersum like", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumNotLike(String value) {
            addCriterion("usersum not like", value, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumIn(List<String> values) {
            addCriterion("usersum in", values, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumNotIn(List<String> values) {
            addCriterion("usersum not in", values, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumBetween(String value1, String value2) {
            addCriterion("usersum between", value1, value2, "usersum");
            return (Criteria) this;
        }

        public Criteria andUsersumNotBetween(String value1, String value2) {
            addCriterion("usersum not between", value1, value2, "usersum");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(String value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(String value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(String value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(String value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(String value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(String value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLike(String value) {
            addCriterion("sum like", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotLike(String value) {
            addCriterion("sum not like", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<String> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<String> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(String value1, String value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(String value1, String value2) {
            addCriterion("sum not between", value1, value2, "sum");
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