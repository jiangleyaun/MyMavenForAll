package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
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

        public Criteria andIsAuthenticateIsNull() {
            addCriterion("IS_AUTHENTICATE is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateIsNotNull() {
            addCriterion("IS_AUTHENTICATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateEqualTo(Integer value) {
            addCriterion("IS_AUTHENTICATE =", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotEqualTo(Integer value) {
            addCriterion("IS_AUTHENTICATE <>", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateGreaterThan(Integer value) {
            addCriterion("IS_AUTHENTICATE >", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_AUTHENTICATE >=", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateLessThan(Integer value) {
            addCriterion("IS_AUTHENTICATE <", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateLessThanOrEqualTo(Integer value) {
            addCriterion("IS_AUTHENTICATE <=", value, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateIn(List<Integer> values) {
            addCriterion("IS_AUTHENTICATE in", values, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotIn(List<Integer> values) {
            addCriterion("IS_AUTHENTICATE not in", values, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateBetween(Integer value1, Integer value2) {
            addCriterion("IS_AUTHENTICATE between", value1, value2, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticateNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_AUTHENTICATE not between", value1, value2, "isAuthenticate");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNatureIsNull() {
            addCriterion("ORG_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andOrgNatureIsNotNull() {
            addCriterion("ORG_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNatureEqualTo(String value) {
            addCriterion("ORG_NATURE =", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotEqualTo(String value) {
            addCriterion("ORG_NATURE <>", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureGreaterThan(String value) {
            addCriterion("ORG_NATURE >", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NATURE >=", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureLessThan(String value) {
            addCriterion("ORG_NATURE <", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureLessThanOrEqualTo(String value) {
            addCriterion("ORG_NATURE <=", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureLike(String value) {
            addCriterion("ORG_NATURE like", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotLike(String value) {
            addCriterion("ORG_NATURE not like", value, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureIn(List<String> values) {
            addCriterion("ORG_NATURE in", values, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotIn(List<String> values) {
            addCriterion("ORG_NATURE not in", values, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureBetween(String value1, String value2) {
            addCriterion("ORG_NATURE between", value1, value2, "orgNature");
            return (Criteria) this;
        }

        public Criteria andOrgNatureNotBetween(String value1, String value2) {
            addCriterion("ORG_NATURE not between", value1, value2, "orgNature");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNull() {
            addCriterion("REGISTRATION is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNotNull() {
            addCriterion("REGISTRATION is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationEqualTo(String value) {
            addCriterion("REGISTRATION =", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotEqualTo(String value) {
            addCriterion("REGISTRATION <>", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThan(String value) {
            addCriterion("REGISTRATION >", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATION >=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThan(String value) {
            addCriterion("REGISTRATION <", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATION <=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLike(String value) {
            addCriterion("REGISTRATION like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotLike(String value) {
            addCriterion("REGISTRATION not like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationIn(List<String> values) {
            addCriterion("REGISTRATION in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotIn(List<String> values) {
            addCriterion("REGISTRATION not in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationBetween(String value1, String value2) {
            addCriterion("REGISTRATION between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotBetween(String value1, String value2) {
            addCriterion("REGISTRATION not between", value1, value2, "registration");
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

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("ROLE =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("ROLE <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("ROLE >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("ROLE <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("ROLE in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("ROLE not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("ROLE between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE not between", value1, value2, "role");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAreasCodeIsNull() {
            addCriterion("AREAS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreasCodeIsNotNull() {
            addCriterion("AREAS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreasCodeEqualTo(String value) {
            addCriterion("AREAS_CODE =", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotEqualTo(String value) {
            addCriterion("AREAS_CODE <>", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeGreaterThan(String value) {
            addCriterion("AREAS_CODE >", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS_CODE >=", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeLessThan(String value) {
            addCriterion("AREAS_CODE <", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeLessThanOrEqualTo(String value) {
            addCriterion("AREAS_CODE <=", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeLike(String value) {
            addCriterion("AREAS_CODE like", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotLike(String value) {
            addCriterion("AREAS_CODE not like", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeIn(List<String> values) {
            addCriterion("AREAS_CODE in", values, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotIn(List<String> values) {
            addCriterion("AREAS_CODE not in", values, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeBetween(String value1, String value2) {
            addCriterion("AREAS_CODE between", value1, value2, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotBetween(String value1, String value2) {
            addCriterion("AREAS_CODE not between", value1, value2, "areasCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeIsNull() {
            addCriterion("DOMICILE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeIsNotNull() {
            addCriterion("DOMICILE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeEqualTo(String value) {
            addCriterion("DOMICILE_CODE =", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeNotEqualTo(String value) {
            addCriterion("DOMICILE_CODE <>", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeGreaterThan(String value) {
            addCriterion("DOMICILE_CODE >", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE_CODE >=", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeLessThan(String value) {
            addCriterion("DOMICILE_CODE <", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE_CODE <=", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeLike(String value) {
            addCriterion("DOMICILE_CODE like", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeNotLike(String value) {
            addCriterion("DOMICILE_CODE not like", value, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeIn(List<String> values) {
            addCriterion("DOMICILE_CODE in", values, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeNotIn(List<String> values) {
            addCriterion("DOMICILE_CODE not in", values, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeBetween(String value1, String value2) {
            addCriterion("DOMICILE_CODE between", value1, value2, "domicileCode");
            return (Criteria) this;
        }

        public Criteria andDomicileCodeNotBetween(String value1, String value2) {
            addCriterion("DOMICILE_CODE not between", value1, value2, "domicileCode");
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

        public Criteria andIsMobileAuthIsNull() {
            addCriterion("IS_MOBILE_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthIsNotNull() {
            addCriterion("IS_MOBILE_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthEqualTo(Integer value) {
            addCriterion("IS_MOBILE_AUTH =", value, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthNotEqualTo(Integer value) {
            addCriterion("IS_MOBILE_AUTH <>", value, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthGreaterThan(Integer value) {
            addCriterion("IS_MOBILE_AUTH >", value, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_MOBILE_AUTH >=", value, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthLessThan(Integer value) {
            addCriterion("IS_MOBILE_AUTH <", value, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthLessThanOrEqualTo(Integer value) {
            addCriterion("IS_MOBILE_AUTH <=", value, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthIn(List<Integer> values) {
            addCriterion("IS_MOBILE_AUTH in", values, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthNotIn(List<Integer> values) {
            addCriterion("IS_MOBILE_AUTH not in", values, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthBetween(Integer value1, Integer value2) {
            addCriterion("IS_MOBILE_AUTH between", value1, value2, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andIsMobileAuthNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_MOBILE_AUTH not between", value1, value2, "isMobileAuth");
            return (Criteria) this;
        }

        public Criteria andUseAppIsNull() {
            addCriterion("USE_APP is null");
            return (Criteria) this;
        }

        public Criteria andUseAppIsNotNull() {
            addCriterion("USE_APP is not null");
            return (Criteria) this;
        }

        public Criteria andUseAppEqualTo(String value) {
            addCriterion("USE_APP =", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppNotEqualTo(String value) {
            addCriterion("USE_APP <>", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppGreaterThan(String value) {
            addCriterion("USE_APP >", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppGreaterThanOrEqualTo(String value) {
            addCriterion("USE_APP >=", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppLessThan(String value) {
            addCriterion("USE_APP <", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppLessThanOrEqualTo(String value) {
            addCriterion("USE_APP <=", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppLike(String value) {
            addCriterion("USE_APP like", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppNotLike(String value) {
            addCriterion("USE_APP not like", value, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppIn(List<String> values) {
            addCriterion("USE_APP in", values, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppNotIn(List<String> values) {
            addCriterion("USE_APP not in", values, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppBetween(String value1, String value2) {
            addCriterion("USE_APP between", value1, value2, "useApp");
            return (Criteria) this;
        }

        public Criteria andUseAppNotBetween(String value1, String value2) {
            addCriterion("USE_APP not between", value1, value2, "useApp");
            return (Criteria) this;
        }

        public Criteria andMobileTokenIsNull() {
            addCriterion("MOBILE_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andMobileTokenIsNotNull() {
            addCriterion("MOBILE_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTokenEqualTo(String value) {
            addCriterion("MOBILE_TOKEN =", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenNotEqualTo(String value) {
            addCriterion("MOBILE_TOKEN <>", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenGreaterThan(String value) {
            addCriterion("MOBILE_TOKEN >", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_TOKEN >=", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenLessThan(String value) {
            addCriterion("MOBILE_TOKEN <", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_TOKEN <=", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenLike(String value) {
            addCriterion("MOBILE_TOKEN like", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenNotLike(String value) {
            addCriterion("MOBILE_TOKEN not like", value, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenIn(List<String> values) {
            addCriterion("MOBILE_TOKEN in", values, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenNotIn(List<String> values) {
            addCriterion("MOBILE_TOKEN not in", values, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenBetween(String value1, String value2) {
            addCriterion("MOBILE_TOKEN between", value1, value2, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTokenNotBetween(String value1, String value2) {
            addCriterion("MOBILE_TOKEN not between", value1, value2, "mobileToken");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIsNull() {
            addCriterion("MOBILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIsNotNull() {
            addCriterion("MOBILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTypeEqualTo(String value) {
            addCriterion("MOBILE_TYPE =", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotEqualTo(String value) {
            addCriterion("MOBILE_TYPE <>", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeGreaterThan(String value) {
            addCriterion("MOBILE_TYPE >", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_TYPE >=", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLessThan(String value) {
            addCriterion("MOBILE_TYPE <", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_TYPE <=", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeLike(String value) {
            addCriterion("MOBILE_TYPE like", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotLike(String value) {
            addCriterion("MOBILE_TYPE not like", value, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeIn(List<String> values) {
            addCriterion("MOBILE_TYPE in", values, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotIn(List<String> values) {
            addCriterion("MOBILE_TYPE not in", values, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeBetween(String value1, String value2) {
            addCriterion("MOBILE_TYPE between", value1, value2, "mobileType");
            return (Criteria) this;
        }

        public Criteria andMobileTypeNotBetween(String value1, String value2) {
            addCriterion("MOBILE_TYPE not between", value1, value2, "mobileType");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNull() {
            addCriterion("WECHAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("WECHAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("WECHAT_ID =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("WECHAT_ID <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("WECHAT_ID >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT_ID >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("WECHAT_ID <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("WECHAT_ID <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("WECHAT_ID like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("WECHAT_ID not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("WECHAT_ID in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("WECHAT_ID not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("WECHAT_ID between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("WECHAT_ID not between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andMobileVersionIsNull() {
            addCriterion("MOBILE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMobileVersionIsNotNull() {
            addCriterion("MOBILE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMobileVersionEqualTo(String value) {
            addCriterion("MOBILE_VERSION =", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionNotEqualTo(String value) {
            addCriterion("MOBILE_VERSION <>", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionGreaterThan(String value) {
            addCriterion("MOBILE_VERSION >", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_VERSION >=", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionLessThan(String value) {
            addCriterion("MOBILE_VERSION <", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_VERSION <=", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionLike(String value) {
            addCriterion("MOBILE_VERSION like", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionNotLike(String value) {
            addCriterion("MOBILE_VERSION not like", value, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionIn(List<String> values) {
            addCriterion("MOBILE_VERSION in", values, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionNotIn(List<String> values) {
            addCriterion("MOBILE_VERSION not in", values, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionBetween(String value1, String value2) {
            addCriterion("MOBILE_VERSION between", value1, value2, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileVersionNotBetween(String value1, String value2) {
            addCriterion("MOBILE_VERSION not between", value1, value2, "mobileVersion");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceIsNull() {
            addCriterion("MOBILE_DEVICE is null");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceIsNotNull() {
            addCriterion("MOBILE_DEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceEqualTo(String value) {
            addCriterion("MOBILE_DEVICE =", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceNotEqualTo(String value) {
            addCriterion("MOBILE_DEVICE <>", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceGreaterThan(String value) {
            addCriterion("MOBILE_DEVICE >", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_DEVICE >=", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceLessThan(String value) {
            addCriterion("MOBILE_DEVICE <", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_DEVICE <=", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceLike(String value) {
            addCriterion("MOBILE_DEVICE like", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceNotLike(String value) {
            addCriterion("MOBILE_DEVICE not like", value, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceIn(List<String> values) {
            addCriterion("MOBILE_DEVICE in", values, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceNotIn(List<String> values) {
            addCriterion("MOBILE_DEVICE not in", values, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceBetween(String value1, String value2) {
            addCriterion("MOBILE_DEVICE between", value1, value2, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andMobileDeviceNotBetween(String value1, String value2) {
            addCriterion("MOBILE_DEVICE not between", value1, value2, "mobileDevice");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE not between", value1, value2, "age");
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