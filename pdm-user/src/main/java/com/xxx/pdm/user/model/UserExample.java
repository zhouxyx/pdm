package com.xxx.pdm.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("reg_date is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("reg_date =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("reg_date <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("reg_date >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_date >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("reg_date <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("reg_date <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("reg_date in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("reg_date not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("reg_date between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("reg_date not between", value1, value2, "regDate");
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