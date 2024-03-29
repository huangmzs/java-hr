package com.java158.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigPrimaryKeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigPrimaryKeyExample() {
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

        public Criteria andPrkIdIsNull() {
            addCriterion("prk_id is null");
            return (Criteria) this;
        }

        public Criteria andPrkIdIsNotNull() {
            addCriterion("prk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrkIdEqualTo(Short value) {
            addCriterion("prk_id =", value, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdNotEqualTo(Short value) {
            addCriterion("prk_id <>", value, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdGreaterThan(Short value) {
            addCriterion("prk_id >", value, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdGreaterThanOrEqualTo(Short value) {
            addCriterion("prk_id >=", value, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdLessThan(Short value) {
            addCriterion("prk_id <", value, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdLessThanOrEqualTo(Short value) {
            addCriterion("prk_id <=", value, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdIn(List<Short> values) {
            addCriterion("prk_id in", values, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdNotIn(List<Short> values) {
            addCriterion("prk_id not in", values, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdBetween(Short value1, Short value2) {
            addCriterion("prk_id between", value1, value2, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrkIdNotBetween(Short value1, Short value2) {
            addCriterion("prk_id not between", value1, value2, "prkId");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableIsNull() {
            addCriterion("primary_key_table is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableIsNotNull() {
            addCriterion("primary_key_table is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableEqualTo(String value) {
            addCriterion("primary_key_table =", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableNotEqualTo(String value) {
            addCriterion("primary_key_table <>", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableGreaterThan(String value) {
            addCriterion("primary_key_table >", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableGreaterThanOrEqualTo(String value) {
            addCriterion("primary_key_table >=", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableLessThan(String value) {
            addCriterion("primary_key_table <", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableLessThanOrEqualTo(String value) {
            addCriterion("primary_key_table <=", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableLike(String value) {
            addCriterion("primary_key_table like", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableNotLike(String value) {
            addCriterion("primary_key_table not like", value, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableIn(List<String> values) {
            addCriterion("primary_key_table in", values, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableNotIn(List<String> values) {
            addCriterion("primary_key_table not in", values, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableBetween(String value1, String value2) {
            addCriterion("primary_key_table between", value1, value2, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyTableNotBetween(String value1, String value2) {
            addCriterion("primary_key_table not between", value1, value2, "primaryKeyTable");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyIsNull() {
            addCriterion("primary_key is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyIsNotNull() {
            addCriterion("primary_key is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyEqualTo(String value) {
            addCriterion("primary_key =", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotEqualTo(String value) {
            addCriterion("primary_key <>", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyGreaterThan(String value) {
            addCriterion("primary_key >", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyGreaterThanOrEqualTo(String value) {
            addCriterion("primary_key >=", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyLessThan(String value) {
            addCriterion("primary_key <", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyLessThanOrEqualTo(String value) {
            addCriterion("primary_key <=", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyLike(String value) {
            addCriterion("primary_key like", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotLike(String value) {
            addCriterion("primary_key not like", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyIn(List<String> values) {
            addCriterion("primary_key in", values, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotIn(List<String> values) {
            addCriterion("primary_key not in", values, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyBetween(String value1, String value2) {
            addCriterion("primary_key between", value1, value2, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotBetween(String value1, String value2) {
            addCriterion("primary_key not between", value1, value2, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNull() {
            addCriterion("key_name is null");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNotNull() {
            addCriterion("key_name is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNameEqualTo(String value) {
            addCriterion("key_name =", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotEqualTo(String value) {
            addCriterion("key_name <>", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThan(String value) {
            addCriterion("key_name >", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("key_name >=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThan(String value) {
            addCriterion("key_name <", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThanOrEqualTo(String value) {
            addCriterion("key_name <=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLike(String value) {
            addCriterion("key_name like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotLike(String value) {
            addCriterion("key_name not like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameIn(List<String> values) {
            addCriterion("key_name in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotIn(List<String> values) {
            addCriterion("key_name not in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameBetween(String value1, String value2) {
            addCriterion("key_name between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotBetween(String value1, String value2) {
            addCriterion("key_name not between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusIsNull() {
            addCriterion("primary_key_status is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusIsNotNull() {
            addCriterion("primary_key_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusEqualTo(Byte value) {
            addCriterion("primary_key_status =", value, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusNotEqualTo(Byte value) {
            addCriterion("primary_key_status <>", value, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusGreaterThan(Byte value) {
            addCriterion("primary_key_status >", value, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("primary_key_status >=", value, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusLessThan(Byte value) {
            addCriterion("primary_key_status <", value, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("primary_key_status <=", value, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusIn(List<Byte> values) {
            addCriterion("primary_key_status in", values, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusNotIn(List<Byte> values) {
            addCriterion("primary_key_status not in", values, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusBetween(Byte value1, Byte value2) {
            addCriterion("primary_key_status between", value1, value2, "primaryKeyStatus");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("primary_key_status not between", value1, value2, "primaryKeyStatus");
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