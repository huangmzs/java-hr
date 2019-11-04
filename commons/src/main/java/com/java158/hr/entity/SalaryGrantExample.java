package com.java158.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryGrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryGrantExample() {
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

        public Criteria andSgrIdIsNull() {
            addCriterion("sgr_id is null");
            return (Criteria) this;
        }

        public Criteria andSgrIdIsNotNull() {
            addCriterion("sgr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSgrIdEqualTo(Short value) {
            addCriterion("sgr_id =", value, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdNotEqualTo(Short value) {
            addCriterion("sgr_id <>", value, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdGreaterThan(Short value) {
            addCriterion("sgr_id >", value, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdGreaterThanOrEqualTo(Short value) {
            addCriterion("sgr_id >=", value, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdLessThan(Short value) {
            addCriterion("sgr_id <", value, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdLessThanOrEqualTo(Short value) {
            addCriterion("sgr_id <=", value, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdIn(List<Short> values) {
            addCriterion("sgr_id in", values, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdNotIn(List<Short> values) {
            addCriterion("sgr_id not in", values, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdBetween(Short value1, Short value2) {
            addCriterion("sgr_id between", value1, value2, "sgrId");
            return (Criteria) this;
        }

        public Criteria andSgrIdNotBetween(Short value1, Short value2) {
            addCriterion("sgr_id not between", value1, value2, "sgrId");
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

        public Criteria andSalaryStandardIdIsNull() {
            addCriterion("salary_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIsNotNull() {
            addCriterion("salary_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdEqualTo(String value) {
            addCriterion("salary_standard_id =", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotEqualTo(String value) {
            addCriterion("salary_standard_id <>", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdGreaterThan(String value) {
            addCriterion("salary_standard_id >", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_standard_id >=", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLessThan(String value) {
            addCriterion("salary_standard_id <", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLessThanOrEqualTo(String value) {
            addCriterion("salary_standard_id <=", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLike(String value) {
            addCriterion("salary_standard_id like", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotLike(String value) {
            addCriterion("salary_standard_id not like", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIn(List<String> values) {
            addCriterion("salary_standard_id in", values, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotIn(List<String> values) {
            addCriterion("salary_standard_id not in", values, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdBetween(String value1, String value2) {
            addCriterion("salary_standard_id between", value1, value2, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotBetween(String value1, String value2) {
            addCriterion("salary_standard_id not between", value1, value2, "salaryStandardId");
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

        public Criteria andThirdKindIdIsNull() {
            addCriterion("third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNotNull() {
            addCriterion("third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdEqualTo(String value) {
            addCriterion("third_kind_id =", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotEqualTo(String value) {
            addCriterion("third_kind_id <>", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThan(String value) {
            addCriterion("third_kind_id >", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_id >=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThan(String value) {
            addCriterion("third_kind_id <", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("third_kind_id <=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLike(String value) {
            addCriterion("third_kind_id like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotLike(String value) {
            addCriterion("third_kind_id not like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIn(List<String> values) {
            addCriterion("third_kind_id in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotIn(List<String> values) {
            addCriterion("third_kind_id not in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdBetween(String value1, String value2) {
            addCriterion("third_kind_id between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("third_kind_id not between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNull() {
            addCriterion("third_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNotNull() {
            addCriterion("third_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameEqualTo(String value) {
            addCriterion("third_kind_name =", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotEqualTo(String value) {
            addCriterion("third_kind_name <>", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThan(String value) {
            addCriterion("third_kind_name >", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_name >=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThan(String value) {
            addCriterion("third_kind_name <", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThanOrEqualTo(String value) {
            addCriterion("third_kind_name <=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLike(String value) {
            addCriterion("third_kind_name like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotLike(String value) {
            addCriterion("third_kind_name not like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIn(List<String> values) {
            addCriterion("third_kind_name in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotIn(List<String> values) {
            addCriterion("third_kind_name not in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameBetween(String value1, String value2) {
            addCriterion("third_kind_name between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotBetween(String value1, String value2) {
            addCriterion("third_kind_name not between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andHumanAmountIsNull() {
            addCriterion("human_amount is null");
            return (Criteria) this;
        }

        public Criteria andHumanAmountIsNotNull() {
            addCriterion("human_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAmountEqualTo(Short value) {
            addCriterion("human_amount =", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountNotEqualTo(Short value) {
            addCriterion("human_amount <>", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountGreaterThan(Short value) {
            addCriterion("human_amount >", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("human_amount >=", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountLessThan(Short value) {
            addCriterion("human_amount <", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountLessThanOrEqualTo(Short value) {
            addCriterion("human_amount <=", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountIn(List<Short> values) {
            addCriterion("human_amount in", values, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountNotIn(List<Short> values) {
            addCriterion("human_amount not in", values, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountBetween(Short value1, Short value2) {
            addCriterion("human_amount between", value1, value2, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountNotBetween(Short value1, Short value2) {
            addCriterion("human_amount not between", value1, value2, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIsNull() {
            addCriterion("salary_standard_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIsNotNull() {
            addCriterion("salary_standard_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumEqualTo(Double value) {
            addCriterion("salary_standard_sum =", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotEqualTo(Double value) {
            addCriterion("salary_standard_sum <>", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumGreaterThan(Double value) {
            addCriterion("salary_standard_sum >", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_standard_sum >=", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumLessThan(Double value) {
            addCriterion("salary_standard_sum <", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumLessThanOrEqualTo(Double value) {
            addCriterion("salary_standard_sum <=", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIn(List<Double> values) {
            addCriterion("salary_standard_sum in", values, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotIn(List<Double> values) {
            addCriterion("salary_standard_sum not in", values, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumBetween(Double value1, Double value2) {
            addCriterion("salary_standard_sum between", value1, value2, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotBetween(Double value1, Double value2) {
            addCriterion("salary_standard_sum not between", value1, value2, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumIsNull() {
            addCriterion("salary_paid_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumIsNotNull() {
            addCriterion("salary_paid_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumEqualTo(Double value) {
            addCriterion("salary_paid_sum =", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumNotEqualTo(Double value) {
            addCriterion("salary_paid_sum <>", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumGreaterThan(Double value) {
            addCriterion("salary_paid_sum >", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_paid_sum >=", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumLessThan(Double value) {
            addCriterion("salary_paid_sum <", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumLessThanOrEqualTo(Double value) {
            addCriterion("salary_paid_sum <=", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumIn(List<Double> values) {
            addCriterion("salary_paid_sum in", values, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumNotIn(List<Double> values) {
            addCriterion("salary_paid_sum not in", values, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumBetween(Double value1, Double value2) {
            addCriterion("salary_paid_sum between", value1, value2, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumNotBetween(Double value1, Double value2) {
            addCriterion("salary_paid_sum not between", value1, value2, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Short value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Short value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Short value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Short value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Short> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Short> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Short value1, Short value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
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