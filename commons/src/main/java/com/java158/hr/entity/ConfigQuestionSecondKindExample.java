package com.java158.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigQuestionSecondKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigQuestionSecondKindExample() {
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

        public Criteria andQskIdIsNull() {
            addCriterion("qsk_id is null");
            return (Criteria) this;
        }

        public Criteria andQskIdIsNotNull() {
            addCriterion("qsk_id is not null");
            return (Criteria) this;
        }

        public Criteria andQskIdEqualTo(Short value) {
            addCriterion("qsk_id =", value, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdNotEqualTo(Short value) {
            addCriterion("qsk_id <>", value, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdGreaterThan(Short value) {
            addCriterion("qsk_id >", value, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdGreaterThanOrEqualTo(Short value) {
            addCriterion("qsk_id >=", value, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdLessThan(Short value) {
            addCriterion("qsk_id <", value, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdLessThanOrEqualTo(Short value) {
            addCriterion("qsk_id <=", value, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdIn(List<Short> values) {
            addCriterion("qsk_id in", values, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdNotIn(List<Short> values) {
            addCriterion("qsk_id not in", values, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdBetween(Short value1, Short value2) {
            addCriterion("qsk_id between", value1, value2, "qskId");
            return (Criteria) this;
        }

        public Criteria andQskIdNotBetween(Short value1, Short value2) {
            addCriterion("qsk_id not between", value1, value2, "qskId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNull() {
            addCriterion("first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNotNull() {
            addCriterion("first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdEqualTo(String value) {
            addCriterion("first_kind_id =", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotEqualTo(String value) {
            addCriterion("first_kind_id <>", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThan(String value) {
            addCriterion("first_kind_id >", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_id >=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThan(String value) {
            addCriterion("first_kind_id <", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("first_kind_id <=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLike(String value) {
            addCriterion("first_kind_id like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotLike(String value) {
            addCriterion("first_kind_id not like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIn(List<String> values) {
            addCriterion("first_kind_id in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotIn(List<String> values) {
            addCriterion("first_kind_id not in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdBetween(String value1, String value2) {
            addCriterion("first_kind_id between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("first_kind_id not between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNull() {
            addCriterion("first_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNotNull() {
            addCriterion("first_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameEqualTo(String value) {
            addCriterion("first_kind_name =", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotEqualTo(String value) {
            addCriterion("first_kind_name <>", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThan(String value) {
            addCriterion("first_kind_name >", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_name >=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThan(String value) {
            addCriterion("first_kind_name <", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("first_kind_name <=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLike(String value) {
            addCriterion("first_kind_name like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotLike(String value) {
            addCriterion("first_kind_name not like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIn(List<String> values) {
            addCriterion("first_kind_name in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotIn(List<String> values) {
            addCriterion("first_kind_name not in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameBetween(String value1, String value2) {
            addCriterion("first_kind_name between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("first_kind_name not between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNull() {
            addCriterion("second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNotNull() {
            addCriterion("second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdEqualTo(String value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(String value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(String value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(String value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLike(String value) {
            addCriterion("second_kind_id like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotLike(String value) {
            addCriterion("second_kind_id not like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<String> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<String> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(String value1, String value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNull() {
            addCriterion("second_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNotNull() {
            addCriterion("second_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameEqualTo(String value) {
            addCriterion("second_kind_name =", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotEqualTo(String value) {
            addCriterion("second_kind_name <>", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThan(String value) {
            addCriterion("second_kind_name >", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_name >=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThan(String value) {
            addCriterion("second_kind_name <", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("second_kind_name <=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLike(String value) {
            addCriterion("second_kind_name like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotLike(String value) {
            addCriterion("second_kind_name not like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIn(List<String> values) {
            addCriterion("second_kind_name in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotIn(List<String> values) {
            addCriterion("second_kind_name not in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameBetween(String value1, String value2) {
            addCriterion("second_kind_name between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("second_kind_name not between", value1, value2, "secondKindName");
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