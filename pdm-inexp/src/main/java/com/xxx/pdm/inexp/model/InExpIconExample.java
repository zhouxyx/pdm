package com.xxx.pdm.inexp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InExpIconExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InExpIconExample() {
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

        public Criteria andIconUidIsNull() {
            addCriterion("icon_uid is null");
            return (Criteria) this;
        }

        public Criteria andIconUidIsNotNull() {
            addCriterion("icon_uid is not null");
            return (Criteria) this;
        }

        public Criteria andIconUidEqualTo(String value) {
            addCriterion("icon_uid =", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidNotEqualTo(String value) {
            addCriterion("icon_uid <>", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidGreaterThan(String value) {
            addCriterion("icon_uid >", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidGreaterThanOrEqualTo(String value) {
            addCriterion("icon_uid >=", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidLessThan(String value) {
            addCriterion("icon_uid <", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidLessThanOrEqualTo(String value) {
            addCriterion("icon_uid <=", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidLike(String value) {
            addCriterion("icon_uid like", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidNotLike(String value) {
            addCriterion("icon_uid not like", value, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidIn(List<String> values) {
            addCriterion("icon_uid in", values, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidNotIn(List<String> values) {
            addCriterion("icon_uid not in", values, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidBetween(String value1, String value2) {
            addCriterion("icon_uid between", value1, value2, "iconUid");
            return (Criteria) this;
        }

        public Criteria andIconUidNotBetween(String value1, String value2) {
            addCriterion("icon_uid not between", value1, value2, "iconUid");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNull() {
            addCriterion("row_version is null");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNotNull() {
            addCriterion("row_version is not null");
            return (Criteria) this;
        }

        public Criteria andRowVersionEqualTo(Date value) {
            addCriterion("row_version =", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotEqualTo(Date value) {
            addCriterion("row_version <>", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThan(Date value) {
            addCriterion("row_version >", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThanOrEqualTo(Date value) {
            addCriterion("row_version >=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThan(Date value) {
            addCriterion("row_version <", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThanOrEqualTo(Date value) {
            addCriterion("row_version <=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionIn(List<Date> values) {
            addCriterion("row_version in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotIn(List<Date> values) {
            addCriterion("row_version not in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionBetween(Date value1, Date value2) {
            addCriterion("row_version between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotBetween(Date value1, Date value2) {
            addCriterion("row_version not between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowStatusIsNull() {
            addCriterion("row_status is null");
            return (Criteria) this;
        }

        public Criteria andRowStatusIsNotNull() {
            addCriterion("row_status is not null");
            return (Criteria) this;
        }

        public Criteria andRowStatusEqualTo(Integer value) {
            addCriterion("row_status =", value, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusNotEqualTo(Integer value) {
            addCriterion("row_status <>", value, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusGreaterThan(Integer value) {
            addCriterion("row_status >", value, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_status >=", value, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusLessThan(Integer value) {
            addCriterion("row_status <", value, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusLessThanOrEqualTo(Integer value) {
            addCriterion("row_status <=", value, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusIn(List<Integer> values) {
            addCriterion("row_status in", values, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusNotIn(List<Integer> values) {
            addCriterion("row_status not in", values, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusBetween(Integer value1, Integer value2) {
            addCriterion("row_status between", value1, value2, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andRowStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("row_status not between", value1, value2, "rowStatus");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconDescIsNull() {
            addCriterion("icon_desc is null");
            return (Criteria) this;
        }

        public Criteria andIconDescIsNotNull() {
            addCriterion("icon_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIconDescEqualTo(String value) {
            addCriterion("icon_desc =", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotEqualTo(String value) {
            addCriterion("icon_desc <>", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescGreaterThan(String value) {
            addCriterion("icon_desc >", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescGreaterThanOrEqualTo(String value) {
            addCriterion("icon_desc >=", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescLessThan(String value) {
            addCriterion("icon_desc <", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescLessThanOrEqualTo(String value) {
            addCriterion("icon_desc <=", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescLike(String value) {
            addCriterion("icon_desc like", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotLike(String value) {
            addCriterion("icon_desc not like", value, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescIn(List<String> values) {
            addCriterion("icon_desc in", values, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotIn(List<String> values) {
            addCriterion("icon_desc not in", values, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescBetween(String value1, String value2) {
            addCriterion("icon_desc between", value1, value2, "iconDesc");
            return (Criteria) this;
        }

        public Criteria andIconDescNotBetween(String value1, String value2) {
            addCriterion("icon_desc not between", value1, value2, "iconDesc");
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