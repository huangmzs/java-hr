package com.java158.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class SalaryGrantDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryGrantDetailsExample() {
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

        public Criteria andGrdIdIsNull() {
            addCriterion("grd_id is null");
            return (Criteria) this;
        }

        public Criteria andGrdIdIsNotNull() {
            addCriterion("grd_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrdIdEqualTo(Short value) {
            addCriterion("grd_id =", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdNotEqualTo(Short value) {
            addCriterion("grd_id <>", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdGreaterThan(Short value) {
            addCriterion("grd_id >", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdGreaterThanOrEqualTo(Short value) {
            addCriterion("grd_id >=", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdLessThan(Short value) {
            addCriterion("grd_id <", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdLessThanOrEqualTo(Short value) {
            addCriterion("grd_id <=", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdIn(List<Short> values) {
            addCriterion("grd_id in", values, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdNotIn(List<Short> values) {
            addCriterion("grd_id not in", values, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdBetween(Short value1, Short value2) {
            addCriterion("grd_id between", value1, value2, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdNotBetween(Short value1, Short value2) {
            addCriterion("grd_id not between", value1, value2, "grdId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIsNull() {
            addCriterion("salary_grant_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIsNotNull() {
            addCriterion("salary_grant_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdEqualTo(String value) {
            addCriterion("salary_grant_id =", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotEqualTo(String value) {
            addCriterion("salary_grant_id <>", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdGreaterThan(String value) {
            addCriterion("salary_grant_id >", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_grant_id >=", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLessThan(String value) {
            addCriterion("salary_grant_id <", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLessThanOrEqualTo(String value) {
            addCriterion("salary_grant_id <=", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLike(String value) {
            addCriterion("salary_grant_id like", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotLike(String value) {
            addCriterion("salary_grant_id not like", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIn(List<String> values) {
            addCriterion("salary_grant_id in", values, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotIn(List<String> values) {
            addCriterion("salary_grant_id not in", values, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdBetween(String value1, String value2) {
            addCriterion("salary_grant_id between", value1, value2, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotBetween(String value1, String value2) {
            addCriterion("salary_grant_id not between", value1, value2, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andHumanIdIsNull() {
            addCriterion("human_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanIdIsNotNull() {
            addCriterion("human_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanIdEqualTo(String value) {
            addCriterion("human_id =", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotEqualTo(String value) {
            addCriterion("human_id <>", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdGreaterThan(String value) {
            addCriterion("human_id >", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdGreaterThanOrEqualTo(String value) {
            addCriterion("human_id >=", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLessThan(String value) {
            addCriterion("human_id <", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLessThanOrEqualTo(String value) {
            addCriterion("human_id <=", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLike(String value) {
            addCriterion("human_id like", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotLike(String value) {
            addCriterion("human_id not like", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdIn(List<String> values) {
            addCriterion("human_id in", values, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotIn(List<String> values) {
            addCriterion("human_id not in", values, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdBetween(String value1, String value2) {
            addCriterion("human_id between", value1, value2, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotBetween(String value1, String value2) {
            addCriterion("human_id not between", value1, value2, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNull() {
            addCriterion("human_name is null");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNotNull() {
            addCriterion("human_name is not null");
            return (Criteria) this;
        }

        public Criteria andHumanNameEqualTo(String value) {
            addCriterion("human_name =", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotEqualTo(String value) {
            addCriterion("human_name <>", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThan(String value) {
            addCriterion("human_name >", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThanOrEqualTo(String value) {
            addCriterion("human_name >=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThan(String value) {
            addCriterion("human_name <", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThanOrEqualTo(String value) {
            addCriterion("human_name <=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLike(String value) {
            addCriterion("human_name like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotLike(String value) {
            addCriterion("human_name not like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameIn(List<String> values) {
            addCriterion("human_name in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotIn(List<String> values) {
            addCriterion("human_name not in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameBetween(String value1, String value2) {
            addCriterion("human_name between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotBetween(String value1, String value2) {
            addCriterion("human_name not between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andBounsSumIsNull() {
            addCriterion("bouns_sum is null");
            return (Criteria) this;
        }

        public Criteria andBounsSumIsNotNull() {
            addCriterion("bouns_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBounsSumEqualTo(Double value) {
            addCriterion("bouns_sum =", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotEqualTo(Double value) {
            addCriterion("bouns_sum <>", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumGreaterThan(Double value) {
            addCriterion("bouns_sum >", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumGreaterThanOrEqualTo(Double value) {
            addCriterion("bouns_sum >=", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumLessThan(Double value) {
            addCriterion("bouns_sum <", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumLessThanOrEqualTo(Double value) {
            addCriterion("bouns_sum <=", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumIn(List<Double> values) {
            addCriterion("bouns_sum in", values, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotIn(List<Double> values) {
            addCriterion("bouns_sum not in", values, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumBetween(Double value1, Double value2) {
            addCriterion("bouns_sum between", value1, value2, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotBetween(Double value1, Double value2) {
            addCriterion("bouns_sum not between", value1, value2, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNull() {
            addCriterion("sale_sum is null");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNotNull() {
            addCriterion("sale_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSaleSumEqualTo(Double value) {
            addCriterion("sale_sum =", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotEqualTo(Double value) {
            addCriterion("sale_sum <>", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThan(Double value) {
            addCriterion("sale_sum >", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_sum >=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThan(Double value) {
            addCriterion("sale_sum <", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThanOrEqualTo(Double value) {
            addCriterion("sale_sum <=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIn(List<Double> values) {
            addCriterion("sale_sum in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotIn(List<Double> values) {
            addCriterion("sale_sum not in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumBetween(Double value1, Double value2) {
            addCriterion("sale_sum between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotBetween(Double value1, Double value2) {
            addCriterion("sale_sum not between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumIsNull() {
            addCriterion("deduct_sum is null");
            return (Criteria) this;
        }

        public Criteria andDeductSumIsNotNull() {
            addCriterion("deduct_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDeductSumEqualTo(Double value) {
            addCriterion("deduct_sum =", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotEqualTo(Double value) {
            addCriterion("deduct_sum <>", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumGreaterThan(Double value) {
            addCriterion("deduct_sum >", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_sum >=", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumLessThan(Double value) {
            addCriterion("deduct_sum <", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumLessThanOrEqualTo(Double value) {
            addCriterion("deduct_sum <=", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumIn(List<Double> values) {
            addCriterion("deduct_sum in", values, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotIn(List<Double> values) {
            addCriterion("deduct_sum not in", values, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumBetween(Double value1, Double value2) {
            addCriterion("deduct_sum between", value1, value2, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotBetween(Double value1, Double value2) {
            addCriterion("deduct_sum not between", value1, value2, "deductSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxIsNull() {
            addCriterion("salary_standard_sumx is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxIsNotNull() {
            addCriterion("salary_standard_sumx is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxEqualTo(Double value) {
            addCriterion("salary_standard_sumx =", value, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxNotEqualTo(Double value) {
            addCriterion("salary_standard_sumx <>", value, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxGreaterThan(Double value) {
            addCriterion("salary_standard_sumx >", value, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_standard_sumx >=", value, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxLessThan(Double value) {
            addCriterion("salary_standard_sumx <", value, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxLessThanOrEqualTo(Double value) {
            addCriterion("salary_standard_sumx <=", value, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxIn(List<Double> values) {
            addCriterion("salary_standard_sumx in", values, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxNotIn(List<Double> values) {
            addCriterion("salary_standard_sumx not in", values, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxBetween(Double value1, Double value2) {
            addCriterion("salary_standard_sumx between", value1, value2, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumxNotBetween(Double value1, Double value2) {
            addCriterion("salary_standard_sumx not between", value1, value2, "salaryStandardSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxIsNull() {
            addCriterion("salary_paid_sumx is null");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxIsNotNull() {
            addCriterion("salary_paid_sumx is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxEqualTo(Double value) {
            addCriterion("salary_paid_sumx =", value, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxNotEqualTo(Double value) {
            addCriterion("salary_paid_sumx <>", value, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxGreaterThan(Double value) {
            addCriterion("salary_paid_sumx >", value, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_paid_sumx >=", value, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxLessThan(Double value) {
            addCriterion("salary_paid_sumx <", value, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxLessThanOrEqualTo(Double value) {
            addCriterion("salary_paid_sumx <=", value, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxIn(List<Double> values) {
            addCriterion("salary_paid_sumx in", values, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxNotIn(List<Double> values) {
            addCriterion("salary_paid_sumx not in", values, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxBetween(Double value1, Double value2) {
            addCriterion("salary_paid_sumx between", value1, value2, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumxNotBetween(Double value1, Double value2) {
            addCriterion("salary_paid_sumx not between", value1, value2, "salaryPaidSumx");
            return (Criteria) this;
        }

        public Criteria andStandardIdIsNull() {
            addCriterion("standard_id is null");
            return (Criteria) this;
        }

        public Criteria andStandardIdIsNotNull() {
            addCriterion("standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandardIdEqualTo(String value) {
            addCriterion("standard_id =", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotEqualTo(String value) {
            addCriterion("standard_id <>", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdGreaterThan(String value) {
            addCriterion("standard_id >", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("standard_id >=", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLessThan(String value) {
            addCriterion("standard_id <", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLessThanOrEqualTo(String value) {
            addCriterion("standard_id <=", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLike(String value) {
            addCriterion("standard_id like", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotLike(String value) {
            addCriterion("standard_id not like", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdIn(List<String> values) {
            addCriterion("standard_id in", values, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotIn(List<String> values) {
            addCriterion("standard_id not in", values, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdBetween(String value1, String value2) {
            addCriterion("standard_id between", value1, value2, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotBetween(String value1, String value2) {
            addCriterion("standard_id not between", value1, value2, "standardId");
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