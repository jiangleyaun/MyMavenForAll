package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CounselorAndMediatorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CounselorAndMediatorsExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNull() {
            addCriterion("ABILITY is null");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNotNull() {
            addCriterion("ABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityEqualTo(String value) {
            addCriterion("ABILITY =", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotEqualTo(String value) {
            addCriterion("ABILITY <>", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThan(String value) {
            addCriterion("ABILITY >", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("ABILITY >=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThan(String value) {
            addCriterion("ABILITY <", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThanOrEqualTo(String value) {
            addCriterion("ABILITY <=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLike(String value) {
            addCriterion("ABILITY like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotLike(String value) {
            addCriterion("ABILITY not like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityIn(List<String> values) {
            addCriterion("ABILITY in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotIn(List<String> values) {
            addCriterion("ABILITY not in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityBetween(String value1, String value2) {
            addCriterion("ABILITY between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotBetween(String value1, String value2) {
            addCriterion("ABILITY not between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andActualNameIsNull() {
            addCriterion("ACTUAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActualNameIsNotNull() {
            addCriterion("ACTUAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActualNameEqualTo(String value) {
            addCriterion("ACTUAL_NAME =", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotEqualTo(String value) {
            addCriterion("ACTUAL_NAME <>", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameGreaterThan(String value) {
            addCriterion("ACTUAL_NAME >", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_NAME >=", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameLessThan(String value) {
            addCriterion("ACTUAL_NAME <", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_NAME <=", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameLike(String value) {
            addCriterion("ACTUAL_NAME like", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotLike(String value) {
            addCriterion("ACTUAL_NAME not like", value, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameIn(List<String> values) {
            addCriterion("ACTUAL_NAME in", values, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotIn(List<String> values) {
            addCriterion("ACTUAL_NAME not in", values, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameBetween(String value1, String value2) {
            addCriterion("ACTUAL_NAME between", value1, value2, "actualName");
            return (Criteria) this;
        }

        public Criteria andActualNameNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_NAME not between", value1, value2, "actualName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("BIRTH like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("BIRTH not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCurAddressIsNull() {
            addCriterion("CUR_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCurAddressIsNotNull() {
            addCriterion("CUR_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCurAddressEqualTo(String value) {
            addCriterion("CUR_ADDRESS =", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressNotEqualTo(String value) {
            addCriterion("CUR_ADDRESS <>", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressGreaterThan(String value) {
            addCriterion("CUR_ADDRESS >", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ADDRESS >=", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressLessThan(String value) {
            addCriterion("CUR_ADDRESS <", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressLessThanOrEqualTo(String value) {
            addCriterion("CUR_ADDRESS <=", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressLike(String value) {
            addCriterion("CUR_ADDRESS like", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressNotLike(String value) {
            addCriterion("CUR_ADDRESS not like", value, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressIn(List<String> values) {
            addCriterion("CUR_ADDRESS in", values, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressNotIn(List<String> values) {
            addCriterion("CUR_ADDRESS not in", values, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressBetween(String value1, String value2) {
            addCriterion("CUR_ADDRESS between", value1, value2, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressNotBetween(String value1, String value2) {
            addCriterion("CUR_ADDRESS not between", value1, value2, "curAddress");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailIsNull() {
            addCriterion("CUR_ADDRESS_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailIsNotNull() {
            addCriterion("CUR_ADDRESS_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailEqualTo(String value) {
            addCriterion("CUR_ADDRESS_DETAIL =", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailNotEqualTo(String value) {
            addCriterion("CUR_ADDRESS_DETAIL <>", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailGreaterThan(String value) {
            addCriterion("CUR_ADDRESS_DETAIL >", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ADDRESS_DETAIL >=", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailLessThan(String value) {
            addCriterion("CUR_ADDRESS_DETAIL <", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("CUR_ADDRESS_DETAIL <=", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailLike(String value) {
            addCriterion("CUR_ADDRESS_DETAIL like", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailNotLike(String value) {
            addCriterion("CUR_ADDRESS_DETAIL not like", value, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailIn(List<String> values) {
            addCriterion("CUR_ADDRESS_DETAIL in", values, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailNotIn(List<String> values) {
            addCriterion("CUR_ADDRESS_DETAIL not in", values, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailBetween(String value1, String value2) {
            addCriterion("CUR_ADDRESS_DETAIL between", value1, value2, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCurAddressDetailNotBetween(String value1, String value2) {
            addCriterion("CUR_ADDRESS_DETAIL not between", value1, value2, "curAddressDetail");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("DISTRICT =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("DISTRICT <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("DISTRICT like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("DISTRICT not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("DISTRICT in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("EXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("EXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("EXPERIENCE =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("EXPERIENCE <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("EXPERIENCE >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("EXPERIENCE >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("EXPERIENCE <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("EXPERIENCE <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("EXPERIENCE like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("EXPERIENCE not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("EXPERIENCE in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("EXPERIENCE not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("EXPERIENCE between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("EXPERIENCE not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andImgOtherIsNull() {
            addCriterion("IMG_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andImgOtherIsNotNull() {
            addCriterion("IMG_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andImgOtherEqualTo(String value) {
            addCriterion("IMG_OTHER =", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherNotEqualTo(String value) {
            addCriterion("IMG_OTHER <>", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherGreaterThan(String value) {
            addCriterion("IMG_OTHER >", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_OTHER >=", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherLessThan(String value) {
            addCriterion("IMG_OTHER <", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherLessThanOrEqualTo(String value) {
            addCriterion("IMG_OTHER <=", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherLike(String value) {
            addCriterion("IMG_OTHER like", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherNotLike(String value) {
            addCriterion("IMG_OTHER not like", value, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherIn(List<String> values) {
            addCriterion("IMG_OTHER in", values, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherNotIn(List<String> values) {
            addCriterion("IMG_OTHER not in", values, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherBetween(String value1, String value2) {
            addCriterion("IMG_OTHER between", value1, value2, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgOtherNotBetween(String value1, String value2) {
            addCriterion("IMG_OTHER not between", value1, value2, "imgOther");
            return (Criteria) this;
        }

        public Criteria andImgPhotoIsNull() {
            addCriterion("IMG_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andImgPhotoIsNotNull() {
            addCriterion("IMG_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andImgPhotoEqualTo(String value) {
            addCriterion("IMG_PHOTO =", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoNotEqualTo(String value) {
            addCriterion("IMG_PHOTO <>", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoGreaterThan(String value) {
            addCriterion("IMG_PHOTO >", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_PHOTO >=", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoLessThan(String value) {
            addCriterion("IMG_PHOTO <", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoLessThanOrEqualTo(String value) {
            addCriterion("IMG_PHOTO <=", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoLike(String value) {
            addCriterion("IMG_PHOTO like", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoNotLike(String value) {
            addCriterion("IMG_PHOTO not like", value, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoIn(List<String> values) {
            addCriterion("IMG_PHOTO in", values, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoNotIn(List<String> values) {
            addCriterion("IMG_PHOTO not in", values, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoBetween(String value1, String value2) {
            addCriterion("IMG_PHOTO between", value1, value2, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPhotoNotBetween(String value1, String value2) {
            addCriterion("IMG_PHOTO not between", value1, value2, "imgPhoto");
            return (Criteria) this;
        }

        public Criteria andImgPositiveIsNull() {
            addCriterion("IMG_POSITIVE is null");
            return (Criteria) this;
        }

        public Criteria andImgPositiveIsNotNull() {
            addCriterion("IMG_POSITIVE is not null");
            return (Criteria) this;
        }

        public Criteria andImgPositiveEqualTo(String value) {
            addCriterion("IMG_POSITIVE =", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveNotEqualTo(String value) {
            addCriterion("IMG_POSITIVE <>", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveGreaterThan(String value) {
            addCriterion("IMG_POSITIVE >", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_POSITIVE >=", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveLessThan(String value) {
            addCriterion("IMG_POSITIVE <", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveLessThanOrEqualTo(String value) {
            addCriterion("IMG_POSITIVE <=", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveLike(String value) {
            addCriterion("IMG_POSITIVE like", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveNotLike(String value) {
            addCriterion("IMG_POSITIVE not like", value, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveIn(List<String> values) {
            addCriterion("IMG_POSITIVE in", values, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveNotIn(List<String> values) {
            addCriterion("IMG_POSITIVE not in", values, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveBetween(String value1, String value2) {
            addCriterion("IMG_POSITIVE between", value1, value2, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgPositiveNotBetween(String value1, String value2) {
            addCriterion("IMG_POSITIVE not between", value1, value2, "imgPositive");
            return (Criteria) this;
        }

        public Criteria andImgQuaIsNull() {
            addCriterion("IMG_QUA is null");
            return (Criteria) this;
        }

        public Criteria andImgQuaIsNotNull() {
            addCriterion("IMG_QUA is not null");
            return (Criteria) this;
        }

        public Criteria andImgQuaEqualTo(String value) {
            addCriterion("IMG_QUA =", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaNotEqualTo(String value) {
            addCriterion("IMG_QUA <>", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaGreaterThan(String value) {
            addCriterion("IMG_QUA >", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_QUA >=", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaLessThan(String value) {
            addCriterion("IMG_QUA <", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaLessThanOrEqualTo(String value) {
            addCriterion("IMG_QUA <=", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaLike(String value) {
            addCriterion("IMG_QUA like", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaNotLike(String value) {
            addCriterion("IMG_QUA not like", value, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaIn(List<String> values) {
            addCriterion("IMG_QUA in", values, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaNotIn(List<String> values) {
            addCriterion("IMG_QUA not in", values, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaBetween(String value1, String value2) {
            addCriterion("IMG_QUA between", value1, value2, "imgQua");
            return (Criteria) this;
        }

        public Criteria andImgQuaNotBetween(String value1, String value2) {
            addCriterion("IMG_QUA not between", value1, value2, "imgQua");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobstartIsNull() {
            addCriterion("JOBSTART is null");
            return (Criteria) this;
        }

        public Criteria andJobstartIsNotNull() {
            addCriterion("JOBSTART is not null");
            return (Criteria) this;
        }

        public Criteria andJobstartEqualTo(String value) {
            addCriterion("JOBSTART =", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotEqualTo(String value) {
            addCriterion("JOBSTART <>", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartGreaterThan(String value) {
            addCriterion("JOBSTART >", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartGreaterThanOrEqualTo(String value) {
            addCriterion("JOBSTART >=", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartLessThan(String value) {
            addCriterion("JOBSTART <", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartLessThanOrEqualTo(String value) {
            addCriterion("JOBSTART <=", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartLike(String value) {
            addCriterion("JOBSTART like", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotLike(String value) {
            addCriterion("JOBSTART not like", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartIn(List<String> values) {
            addCriterion("JOBSTART in", values, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotIn(List<String> values) {
            addCriterion("JOBSTART not in", values, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartBetween(String value1, String value2) {
            addCriterion("JOBSTART between", value1, value2, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotBetween(String value1, String value2) {
            addCriterion("JOBSTART not between", value1, value2, "jobstart");
            return (Criteria) this;
        }

        public Criteria andMechWorkIsNull() {
            addCriterion("MECH_WORK is null");
            return (Criteria) this;
        }

        public Criteria andMechWorkIsNotNull() {
            addCriterion("MECH_WORK is not null");
            return (Criteria) this;
        }

        public Criteria andMechWorkEqualTo(String value) {
            addCriterion("MECH_WORK =", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkNotEqualTo(String value) {
            addCriterion("MECH_WORK <>", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkGreaterThan(String value) {
            addCriterion("MECH_WORK >", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkGreaterThanOrEqualTo(String value) {
            addCriterion("MECH_WORK >=", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkLessThan(String value) {
            addCriterion("MECH_WORK <", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkLessThanOrEqualTo(String value) {
            addCriterion("MECH_WORK <=", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkLike(String value) {
            addCriterion("MECH_WORK like", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkNotLike(String value) {
            addCriterion("MECH_WORK not like", value, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkIn(List<String> values) {
            addCriterion("MECH_WORK in", values, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkNotIn(List<String> values) {
            addCriterion("MECH_WORK not in", values, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkBetween(String value1, String value2) {
            addCriterion("MECH_WORK between", value1, value2, "mechWork");
            return (Criteria) this;
        }

        public Criteria andMechWorkNotBetween(String value1, String value2) {
            addCriterion("MECH_WORK not between", value1, value2, "mechWork");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNull() {
            addCriterion("POLITICAL is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNotNull() {
            addCriterion("POLITICAL is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalEqualTo(String value) {
            addCriterion("POLITICAL =", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotEqualTo(String value) {
            addCriterion("POLITICAL <>", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThan(String value) {
            addCriterion("POLITICAL >", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL >=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThan(String value) {
            addCriterion("POLITICAL <", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL <=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLike(String value) {
            addCriterion("POLITICAL like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotLike(String value) {
            addCriterion("POLITICAL not like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalIn(List<String> values) {
            addCriterion("POLITICAL in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotIn(List<String> values) {
            addCriterion("POLITICAL not in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalBetween(String value1, String value2) {
            addCriterion("POLITICAL between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotBetween(String value1, String value2) {
            addCriterion("POLITICAL not between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andQualificatNameIsNull() {
            addCriterion("QUALIFICAT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andQualificatNameIsNotNull() {
            addCriterion("QUALIFICAT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andQualificatNameEqualTo(String value) {
            addCriterion("QUALIFICAT_NAME =", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameNotEqualTo(String value) {
            addCriterion("QUALIFICAT_NAME <>", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameGreaterThan(String value) {
            addCriterion("QUALIFICAT_NAME >", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameGreaterThanOrEqualTo(String value) {
            addCriterion("QUALIFICAT_NAME >=", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameLessThan(String value) {
            addCriterion("QUALIFICAT_NAME <", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameLessThanOrEqualTo(String value) {
            addCriterion("QUALIFICAT_NAME <=", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameLike(String value) {
            addCriterion("QUALIFICAT_NAME like", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameNotLike(String value) {
            addCriterion("QUALIFICAT_NAME not like", value, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameIn(List<String> values) {
            addCriterion("QUALIFICAT_NAME in", values, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameNotIn(List<String> values) {
            addCriterion("QUALIFICAT_NAME not in", values, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameBetween(String value1, String value2) {
            addCriterion("QUALIFICAT_NAME between", value1, value2, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andQualificatNameNotBetween(String value1, String value2) {
            addCriterion("QUALIFICAT_NAME not between", value1, value2, "qualificatName");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("ROLE is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("ROLE =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("ROLE <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("ROLE >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("ROLE <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("ROLE <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("ROLE like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("ROLE not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("ROLE in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("ROLE not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("ROLE between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("ROLE not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiIsNull() {
            addCriterion("WORK_ADD_DETI is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiIsNotNull() {
            addCriterion("WORK_ADD_DETI is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiEqualTo(String value) {
            addCriterion("WORK_ADD_DETI =", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiNotEqualTo(String value) {
            addCriterion("WORK_ADD_DETI <>", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiGreaterThan(String value) {
            addCriterion("WORK_ADD_DETI >", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ADD_DETI >=", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiLessThan(String value) {
            addCriterion("WORK_ADD_DETI <", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiLessThanOrEqualTo(String value) {
            addCriterion("WORK_ADD_DETI <=", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiLike(String value) {
            addCriterion("WORK_ADD_DETI like", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiNotLike(String value) {
            addCriterion("WORK_ADD_DETI not like", value, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiIn(List<String> values) {
            addCriterion("WORK_ADD_DETI in", values, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiNotIn(List<String> values) {
            addCriterion("WORK_ADD_DETI not in", values, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiBetween(String value1, String value2) {
            addCriterion("WORK_ADD_DETI between", value1, value2, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddDetiNotBetween(String value1, String value2) {
            addCriterion("WORK_ADD_DETI not between", value1, value2, "workAddDeti");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNull() {
            addCriterion("WORK_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNotNull() {
            addCriterion("WORK_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressEqualTo(String value) {
            addCriterion("WORK_ADDRESS =", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotEqualTo(String value) {
            addCriterion("WORK_ADDRESS <>", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThan(String value) {
            addCriterion("WORK_ADDRESS >", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ADDRESS >=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThan(String value) {
            addCriterion("WORK_ADDRESS <", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("WORK_ADDRESS <=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLike(String value) {
            addCriterion("WORK_ADDRESS like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotLike(String value) {
            addCriterion("WORK_ADDRESS not like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIn(List<String> values) {
            addCriterion("WORK_ADDRESS in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotIn(List<String> values) {
            addCriterion("WORK_ADDRESS not in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2) {
            addCriterion("WORK_ADDRESS between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2) {
            addCriterion("WORK_ADDRESS not between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("NOTICE =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("NOTICE <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("NOTICE >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("NOTICE <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("NOTICE <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("NOTICE like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("NOTICE not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("NOTICE in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("NOTICE not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("NOTICE between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("NOTICE not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateIsNull() {
            addCriterion("IS_AUTHENTICATE is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateIsNotNull() {
            addCriterion("IS_AUTHENTICATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateEqualTo(String value) {
            addCriterion("IS_AUTHENTICATE =", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotEqualTo(String value) {
            addCriterion("IS_AUTHENTICATE <>", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateGreaterThan(String value) {
            addCriterion("IS_AUTHENTICATE >", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUTHENTICATE >=", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateLessThan(String value) {
            addCriterion("IS_AUTHENTICATE <", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateLessThanOrEqualTo(String value) {
            addCriterion("IS_AUTHENTICATE <=", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateLike(String value) {
            addCriterion("IS_AUTHENTICATE like", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotLike(String value) {
            addCriterion("IS_AUTHENTICATE not like", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateIn(List<String> values) {
            addCriterion("IS_AUTHENTICATE in", values, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotIn(List<String> values) {
            addCriterion("IS_AUTHENTICATE not in", values, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateBetween(String value1, String value2) {
            addCriterion("IS_AUTHENTICATE between", value1, value2, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotBetween(String value1, String value2) {
            addCriterion("IS_AUTHENTICATE not between", value1, value2, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsCounselorIsNull() {
            addCriterion("IS_COUNSELOR is null");
            return (Criteria) this;
        }

        public Criteria andIsCounselorIsNotNull() {
            addCriterion("IS_COUNSELOR is not null");
            return (Criteria) this;
        }

        public Criteria andIsCounselorEqualTo(String value) {
            addCriterion("IS_COUNSELOR =", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorNotEqualTo(String value) {
            addCriterion("IS_COUNSELOR <>", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorGreaterThan(String value) {
            addCriterion("IS_COUNSELOR >", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorGreaterThanOrEqualTo(String value) {
            addCriterion("IS_COUNSELOR >=", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorLessThan(String value) {
            addCriterion("IS_COUNSELOR <", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorLessThanOrEqualTo(String value) {
            addCriterion("IS_COUNSELOR <=", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorLike(String value) {
            addCriterion("IS_COUNSELOR like", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorNotLike(String value) {
            addCriterion("IS_COUNSELOR not like", value, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorIn(List<String> values) {
            addCriterion("IS_COUNSELOR in", values, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorNotIn(List<String> values) {
            addCriterion("IS_COUNSELOR not in", values, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorBetween(String value1, String value2) {
            addCriterion("IS_COUNSELOR between", value1, value2, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsCounselorNotBetween(String value1, String value2) {
            addCriterion("IS_COUNSELOR not between", value1, value2, "isCounselor");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNull() {
            addCriterion("IS_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNotNull() {
            addCriterion("IS_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoginEqualTo(String value) {
            addCriterion("IS_LOGIN =", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotEqualTo(String value) {
            addCriterion("IS_LOGIN <>", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThan(String value) {
            addCriterion("IS_LOGIN >", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOGIN >=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThan(String value) {
            addCriterion("IS_LOGIN <", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThanOrEqualTo(String value) {
            addCriterion("IS_LOGIN <=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLike(String value) {
            addCriterion("IS_LOGIN like", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotLike(String value) {
            addCriterion("IS_LOGIN not like", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginIn(List<String> values) {
            addCriterion("IS_LOGIN in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotIn(List<String> values) {
            addCriterion("IS_LOGIN not in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginBetween(String value1, String value2) {
            addCriterion("IS_LOGIN between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotBetween(String value1, String value2) {
            addCriterion("IS_LOGIN not between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsBusyIsNull() {
            addCriterion("IS_BUSY is null");
            return (Criteria) this;
        }

        public Criteria andIsBusyIsNotNull() {
            addCriterion("IS_BUSY is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusyEqualTo(String value) {
            addCriterion("IS_BUSY =", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyNotEqualTo(String value) {
            addCriterion("IS_BUSY <>", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyGreaterThan(String value) {
            addCriterion("IS_BUSY >", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BUSY >=", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyLessThan(String value) {
            addCriterion("IS_BUSY <", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyLessThanOrEqualTo(String value) {
            addCriterion("IS_BUSY <=", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyLike(String value) {
            addCriterion("IS_BUSY like", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyNotLike(String value) {
            addCriterion("IS_BUSY not like", value, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyIn(List<String> values) {
            addCriterion("IS_BUSY in", values, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyNotIn(List<String> values) {
            addCriterion("IS_BUSY not in", values, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyBetween(String value1, String value2) {
            addCriterion("IS_BUSY between", value1, value2, "isBusy");
            return (Criteria) this;
        }

        public Criteria andIsBusyNotBetween(String value1, String value2) {
            addCriterion("IS_BUSY not between", value1, value2, "isBusy");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("LICENSE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("LICENSE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("LICENSE_NUMBER =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("LICENSE_NUMBER <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("LICENSE_NUMBER >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_NUMBER >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("LICENSE_NUMBER <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("LICENSE_NUMBER <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("LICENSE_NUMBER like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("LICENSE_NUMBER not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("LICENSE_NUMBER in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("LICENSE_NUMBER not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("LICENSE_NUMBER between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("LICENSE_NUMBER not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andPrivatePageIsNull() {
            addCriterion("PRIVATE_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andPrivatePageIsNotNull() {
            addCriterion("PRIVATE_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatePageEqualTo(String value) {
            addCriterion("PRIVATE_PAGE =", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageNotEqualTo(String value) {
            addCriterion("PRIVATE_PAGE <>", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageGreaterThan(String value) {
            addCriterion("PRIVATE_PAGE >", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVATE_PAGE >=", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageLessThan(String value) {
            addCriterion("PRIVATE_PAGE <", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageLessThanOrEqualTo(String value) {
            addCriterion("PRIVATE_PAGE <=", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageLike(String value) {
            addCriterion("PRIVATE_PAGE like", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageNotLike(String value) {
            addCriterion("PRIVATE_PAGE not like", value, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageIn(List<String> values) {
            addCriterion("PRIVATE_PAGE in", values, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageNotIn(List<String> values) {
            addCriterion("PRIVATE_PAGE not in", values, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageBetween(String value1, String value2) {
            addCriterion("PRIVATE_PAGE between", value1, value2, "privatePage");
            return (Criteria) this;
        }

        public Criteria andPrivatePageNotBetween(String value1, String value2) {
            addCriterion("PRIVATE_PAGE not between", value1, value2, "privatePage");
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