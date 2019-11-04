package com.java158.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionsExample() {
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

        public Criteria andMentIdIsNull() {
            addCriterion("ment_id is null");
            return (Criteria) this;
        }

        public Criteria andMentIdIsNotNull() {
            addCriterion("ment_id is not null");
            return (Criteria) this;
        }

        public Criteria andMentIdEqualTo(Integer value) {
            addCriterion("ment_id =", value, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdNotEqualTo(Integer value) {
            addCriterion("ment_id <>", value, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdGreaterThan(Integer value) {
            addCriterion("ment_id >", value, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ment_id >=", value, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdLessThan(Integer value) {
            addCriterion("ment_id <", value, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdLessThanOrEqualTo(Integer value) {
            addCriterion("ment_id <=", value, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdIn(List<Integer> values) {
            addCriterion("ment_id in", values, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdNotIn(List<Integer> values) {
            addCriterion("ment_id not in", values, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdBetween(Integer value1, Integer value2) {
            addCriterion("ment_id between", value1, value2, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ment_id not between", value1, value2, "mentId");
            return (Criteria) this;
        }

        public Criteria andMentNameIsNull() {
            addCriterion("ment_name is null");
            return (Criteria) this;
        }

        public Criteria andMentNameIsNotNull() {
            addCriterion("ment_name is not null");
            return (Criteria) this;
        }

        public Criteria andMentNameEqualTo(String value) {
            addCriterion("ment_name =", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameNotEqualTo(String value) {
            addCriterion("ment_name <>", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameGreaterThan(String value) {
            addCriterion("ment_name >", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameGreaterThanOrEqualTo(String value) {
            addCriterion("ment_name >=", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameLessThan(String value) {
            addCriterion("ment_name <", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameLessThanOrEqualTo(String value) {
            addCriterion("ment_name <=", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameLike(String value) {
            addCriterion("ment_name like", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameNotLike(String value) {
            addCriterion("ment_name not like", value, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameIn(List<String> values) {
            addCriterion("ment_name in", values, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameNotIn(List<String> values) {
            addCriterion("ment_name not in", values, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameBetween(String value1, String value2) {
            addCriterion("ment_name between", value1, value2, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentNameNotBetween(String value1, String value2) {
            addCriterion("ment_name not between", value1, value2, "mentName");
            return (Criteria) this;
        }

        public Criteria andMentStateIsNull() {
            addCriterion("ment_state is null");
            return (Criteria) this;
        }

        public Criteria andMentStateIsNotNull() {
            addCriterion("ment_state is not null");
            return (Criteria) this;
        }

        public Criteria andMentStateEqualTo(Integer value) {
            addCriterion("ment_state =", value, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateNotEqualTo(Integer value) {
            addCriterion("ment_state <>", value, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateGreaterThan(Integer value) {
            addCriterion("ment_state >", value, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ment_state >=", value, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateLessThan(Integer value) {
            addCriterion("ment_state <", value, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateLessThanOrEqualTo(Integer value) {
            addCriterion("ment_state <=", value, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateIn(List<Integer> values) {
            addCriterion("ment_state in", values, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateNotIn(List<Integer> values) {
            addCriterion("ment_state not in", values, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateBetween(Integer value1, Integer value2) {
            addCriterion("ment_state between", value1, value2, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ment_state not between", value1, value2, "mentState");
            return (Criteria) this;
        }

        public Criteria andMentUrlIsNull() {
            addCriterion("ment_url is null");
            return (Criteria) this;
        }

        public Criteria andMentUrlIsNotNull() {
            addCriterion("ment_url is not null");
            return (Criteria) this;
        }

        public Criteria andMentUrlEqualTo(String value) {
            addCriterion("ment_url =", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlNotEqualTo(String value) {
            addCriterion("ment_url <>", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlGreaterThan(String value) {
            addCriterion("ment_url >", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ment_url >=", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlLessThan(String value) {
            addCriterion("ment_url <", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlLessThanOrEqualTo(String value) {
            addCriterion("ment_url <=", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlLike(String value) {
            addCriterion("ment_url like", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlNotLike(String value) {
            addCriterion("ment_url not like", value, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlIn(List<String> values) {
            addCriterion("ment_url in", values, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlNotIn(List<String> values) {
            addCriterion("ment_url not in", values, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlBetween(String value1, String value2) {
            addCriterion("ment_url between", value1, value2, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andMentUrlNotBetween(String value1, String value2) {
            addCriterion("ment_url not between", value1, value2, "mentUrl");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdIsNull() {
            addCriterion("super_ment_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdIsNotNull() {
            addCriterion("super_ment_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdEqualTo(Integer value) {
            addCriterion("super_ment_id =", value, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdNotEqualTo(Integer value) {
            addCriterion("super_ment_id <>", value, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdGreaterThan(Integer value) {
            addCriterion("super_ment_id >", value, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_ment_id >=", value, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdLessThan(Integer value) {
            addCriterion("super_ment_id <", value, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdLessThanOrEqualTo(Integer value) {
            addCriterion("super_ment_id <=", value, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdIn(List<Integer> values) {
            addCriterion("super_ment_id in", values, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdNotIn(List<Integer> values) {
            addCriterion("super_ment_id not in", values, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdBetween(Integer value1, Integer value2) {
            addCriterion("super_ment_id between", value1, value2, "superMentId");
            return (Criteria) this;
        }

        public Criteria andSuperMentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("super_ment_id not between", value1, value2, "superMentId");
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