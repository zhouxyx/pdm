package com.xxx.pdm.inexp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInExpTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInExpTypeExample() {
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

        public Criteria andUserInexpTypeUidIsNull() {
            addCriterion("user_inexp_type_uid is null");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidIsNotNull() {
            addCriterion("user_inexp_type_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidEqualTo(String value) {
            addCriterion("user_inexp_type_uid =", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidNotEqualTo(String value) {
            addCriterion("user_inexp_type_uid <>", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidGreaterThan(String value) {
            addCriterion("user_inexp_type_uid >", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidGreaterThanOrEqualTo(String value) {
            addCriterion("user_inexp_type_uid >=", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidLessThan(String value) {
            addCriterion("user_inexp_type_uid <", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidLessThanOrEqualTo(String value) {
            addCriterion("user_inexp_type_uid <=", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidLike(String value) {
            addCriterion("user_inexp_type_uid like", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidNotLike(String value) {
            addCriterion("user_inexp_type_uid not like", value, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidIn(List<String> values) {
            addCriterion("user_inexp_type_uid in", values, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidNotIn(List<String> values) {
            addCriterion("user_inexp_type_uid not in", values, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidBetween(String value1, String value2) {
            addCriterion("user_inexp_type_uid between", value1, value2, "userInexpTypeUid");
            return (Criteria) this;
        }

        public Criteria andUserInexpTypeUidNotBetween(String value1, String value2) {
            addCriterion("user_inexp_type_uid not between", value1, value2, "userInexpTypeUid");
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

        public Criteria andUserUidIsNull() {
            addCriterion("user_uid is null");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNotNull() {
            addCriterion("user_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUidEqualTo(String value) {
            addCriterion("user_uid =", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotEqualTo(String value) {
            addCriterion("user_uid <>", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThan(String value) {
            addCriterion("user_uid >", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThanOrEqualTo(String value) {
            addCriterion("user_uid >=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThan(String value) {
            addCriterion("user_uid <", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThanOrEqualTo(String value) {
            addCriterion("user_uid <=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLike(String value) {
            addCriterion("user_uid like", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotLike(String value) {
            addCriterion("user_uid not like", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidIn(List<String> values) {
            addCriterion("user_uid in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotIn(List<String> values) {
            addCriterion("user_uid not in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidBetween(String value1, String value2) {
            addCriterion("user_uid between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotBetween(String value1, String value2) {
            addCriterion("user_uid not between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameIsNull() {
            addCriterion("inexp_type_name is null");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameIsNotNull() {
            addCriterion("inexp_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameEqualTo(String value) {
            addCriterion("inexp_type_name =", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameNotEqualTo(String value) {
            addCriterion("inexp_type_name <>", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameGreaterThan(String value) {
            addCriterion("inexp_type_name >", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("inexp_type_name >=", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameLessThan(String value) {
            addCriterion("inexp_type_name <", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameLessThanOrEqualTo(String value) {
            addCriterion("inexp_type_name <=", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameLike(String value) {
            addCriterion("inexp_type_name like", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameNotLike(String value) {
            addCriterion("inexp_type_name not like", value, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameIn(List<String> values) {
            addCriterion("inexp_type_name in", values, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameNotIn(List<String> values) {
            addCriterion("inexp_type_name not in", values, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameBetween(String value1, String value2) {
            addCriterion("inexp_type_name between", value1, value2, "inexpTypeName");
            return (Criteria) this;
        }

        public Criteria andInexpTypeNameNotBetween(String value1, String value2) {
            addCriterion("inexp_type_name not between", value1, value2, "inexpTypeName");
            return (Criteria) this;
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