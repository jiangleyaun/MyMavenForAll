package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonnelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelExample() {
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

        public Criteria andCorporationIsNull() {
            addCriterion("CORPORATION is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNotNull() {
            addCriterion("CORPORATION is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationEqualTo(String value) {
            addCriterion("CORPORATION =", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotEqualTo(String value) {
            addCriterion("CORPORATION <>", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThan(String value) {
            addCriterion("CORPORATION >", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("CORPORATION >=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThan(String value) {
            addCriterion("CORPORATION <", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThanOrEqualTo(String value) {
            addCriterion("CORPORATION <=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLike(String value) {
            addCriterion("CORPORATION like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotLike(String value) {
            addCriterion("CORPORATION not like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationIn(List<String> values) {
            addCriterion("CORPORATION in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotIn(List<String> values) {
            addCriterion("CORPORATION not in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationBetween(String value1, String value2) {
            addCriterion("CORPORATION between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotBetween(String value1, String value2) {
            addCriterion("CORPORATION not between", value1, value2, "corporation");
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

        public Criteria andEnterprisePhoneIsNull() {
            addCriterion("ENTERPRISE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNotNull() {
            addCriterion("ENTERPRISE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneEqualTo(String value) {
            addCriterion("ENTERPRISE_PHONE =", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotEqualTo(String value) {
            addCriterion("ENTERPRISE_PHONE <>", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThan(String value) {
            addCriterion("ENTERPRISE_PHONE >", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_PHONE >=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThan(String value) {
            addCriterion("ENTERPRISE_PHONE <", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_PHONE <=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLike(String value) {
            addCriterion("ENTERPRISE_PHONE like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotLike(String value) {
            addCriterion("ENTERPRISE_PHONE not like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIn(List<String> values) {
            addCriterion("ENTERPRISE_PHONE in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotIn(List<String> values) {
            addCriterion("ENTERPRISE_PHONE not in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_PHONE between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_PHONE not between", value1, value2, "enterprisePhone");
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

        public Criteria andProcreditCodeIsNull() {
            addCriterion("PROCREDIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeIsNotNull() {
            addCriterion("PROCREDIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeEqualTo(String value) {
            addCriterion("PROCREDIT_CODE =", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeNotEqualTo(String value) {
            addCriterion("PROCREDIT_CODE <>", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeGreaterThan(String value) {
            addCriterion("PROCREDIT_CODE >", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCREDIT_CODE >=", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeLessThan(String value) {
            addCriterion("PROCREDIT_CODE <", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeLessThanOrEqualTo(String value) {
            addCriterion("PROCREDIT_CODE <=", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeLike(String value) {
            addCriterion("PROCREDIT_CODE like", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeNotLike(String value) {
            addCriterion("PROCREDIT_CODE not like", value, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeIn(List<String> values) {
            addCriterion("PROCREDIT_CODE in", values, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeNotIn(List<String> values) {
            addCriterion("PROCREDIT_CODE not in", values, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeBetween(String value1, String value2) {
            addCriterion("PROCREDIT_CODE between", value1, value2, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProcreditCodeNotBetween(String value1, String value2) {
            addCriterion("PROCREDIT_CODE not between", value1, value2, "procreditCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeIsNull() {
            addCriterion("PROLICENSE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeIsNotNull() {
            addCriterion("PROLICENSE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeEqualTo(String value) {
            addCriterion("PROLICENSE_CODE =", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeNotEqualTo(String value) {
            addCriterion("PROLICENSE_CODE <>", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeGreaterThan(String value) {
            addCriterion("PROLICENSE_CODE >", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROLICENSE_CODE >=", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeLessThan(String value) {
            addCriterion("PROLICENSE_CODE <", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeLessThanOrEqualTo(String value) {
            addCriterion("PROLICENSE_CODE <=", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeLike(String value) {
            addCriterion("PROLICENSE_CODE like", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeNotLike(String value) {
            addCriterion("PROLICENSE_CODE not like", value, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeIn(List<String> values) {
            addCriterion("PROLICENSE_CODE in", values, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeNotIn(List<String> values) {
            addCriterion("PROLICENSE_CODE not in", values, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeBetween(String value1, String value2) {
            addCriterion("PROLICENSE_CODE between", value1, value2, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProlicenseCodeNotBetween(String value1, String value2) {
            addCriterion("PROLICENSE_CODE not between", value1, value2, "prolicenseCode");
            return (Criteria) this;
        }

        public Criteria andProorganizationIsNull() {
            addCriterion("PROORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andProorganizationIsNotNull() {
            addCriterion("PROORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andProorganizationEqualTo(String value) {
            addCriterion("PROORGANIZATION =", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationNotEqualTo(String value) {
            addCriterion("PROORGANIZATION <>", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationGreaterThan(String value) {
            addCriterion("PROORGANIZATION >", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("PROORGANIZATION >=", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationLessThan(String value) {
            addCriterion("PROORGANIZATION <", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationLessThanOrEqualTo(String value) {
            addCriterion("PROORGANIZATION <=", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationLike(String value) {
            addCriterion("PROORGANIZATION like", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationNotLike(String value) {
            addCriterion("PROORGANIZATION not like", value, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationIn(List<String> values) {
            addCriterion("PROORGANIZATION in", values, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationNotIn(List<String> values) {
            addCriterion("PROORGANIZATION not in", values, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationBetween(String value1, String value2) {
            addCriterion("PROORGANIZATION between", value1, value2, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProorganizationNotBetween(String value1, String value2) {
            addCriterion("PROORGANIZATION not between", value1, value2, "proorganization");
            return (Criteria) this;
        }

        public Criteria andProtaxIsNull() {
            addCriterion("PROTAX is null");
            return (Criteria) this;
        }

        public Criteria andProtaxIsNotNull() {
            addCriterion("PROTAX is not null");
            return (Criteria) this;
        }

        public Criteria andProtaxEqualTo(String value) {
            addCriterion("PROTAX =", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxNotEqualTo(String value) {
            addCriterion("PROTAX <>", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxGreaterThan(String value) {
            addCriterion("PROTAX >", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxGreaterThanOrEqualTo(String value) {
            addCriterion("PROTAX >=", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxLessThan(String value) {
            addCriterion("PROTAX <", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxLessThanOrEqualTo(String value) {
            addCriterion("PROTAX <=", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxLike(String value) {
            addCriterion("PROTAX like", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxNotLike(String value) {
            addCriterion("PROTAX not like", value, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxIn(List<String> values) {
            addCriterion("PROTAX in", values, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxNotIn(List<String> values) {
            addCriterion("PROTAX not in", values, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxBetween(String value1, String value2) {
            addCriterion("PROTAX between", value1, value2, "protax");
            return (Criteria) this;
        }

        public Criteria andProtaxNotBetween(String value1, String value2) {
            addCriterion("PROTAX not between", value1, value2, "protax");
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

        public Criteria andUserDetailIdIsNull() {
            addCriterion("USER_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdIsNotNull() {
            addCriterion("USER_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdEqualTo(Long value) {
            addCriterion("USER_DETAIL_ID =", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdNotEqualTo(Long value) {
            addCriterion("USER_DETAIL_ID <>", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdGreaterThan(Long value) {
            addCriterion("USER_DETAIL_ID >", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_DETAIL_ID >=", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdLessThan(Long value) {
            addCriterion("USER_DETAIL_ID <", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_DETAIL_ID <=", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdIn(List<Long> values) {
            addCriterion("USER_DETAIL_ID in", values, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdNotIn(List<Long> values) {
            addCriterion("USER_DETAIL_ID not in", values, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdBetween(Long value1, Long value2) {
            addCriterion("USER_DETAIL_ID between", value1, value2, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_DETAIL_ID not between", value1, value2, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdIsNull() {
            addCriterion("LAW_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdIsNotNull() {
            addCriterion("LAW_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdEqualTo(Long value) {
            addCriterion("LAW_CASE_ID =", value, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdNotEqualTo(Long value) {
            addCriterion("LAW_CASE_ID <>", value, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdGreaterThan(Long value) {
            addCriterion("LAW_CASE_ID >", value, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_CASE_ID >=", value, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdLessThan(Long value) {
            addCriterion("LAW_CASE_ID <", value, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_CASE_ID <=", value, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdIn(List<Long> values) {
            addCriterion("LAW_CASE_ID in", values, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdNotIn(List<Long> values) {
            addCriterion("LAW_CASE_ID not in", values, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdBetween(Long value1, Long value2) {
            addCriterion("LAW_CASE_ID between", value1, value2, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andLawCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_CASE_ID not between", value1, value2, "lawCaseId");
            return (Criteria) this;
        }

        public Criteria andExtendIsNull() {
            addCriterion("EXTEND is null");
            return (Criteria) this;
        }

        public Criteria andExtendIsNotNull() {
            addCriterion("EXTEND is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEqualTo(String value) {
            addCriterion("EXTEND =", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotEqualTo(String value) {
            addCriterion("EXTEND <>", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThan(String value) {
            addCriterion("EXTEND >", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND >=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThan(String value) {
            addCriterion("EXTEND <", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThanOrEqualTo(String value) {
            addCriterion("EXTEND <=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLike(String value) {
            addCriterion("EXTEND like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotLike(String value) {
            addCriterion("EXTEND not like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendIn(List<String> values) {
            addCriterion("EXTEND in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotIn(List<String> values) {
            addCriterion("EXTEND not in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendBetween(String value1, String value2) {
            addCriterion("EXTEND between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotBetween(String value1, String value2) {
            addCriterion("EXTEND not between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("ORDERS is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("ORDERS is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("ORDERS =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("ORDERS <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("ORDERS >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDERS >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("ORDERS <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("ORDERS <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("ORDERS in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("ORDERS not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("ORDERS between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDERS not between", value1, value2, "orders");
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

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
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

        public Criteria andLawNoDisputeFactIdIsNull() {
            addCriterion("LAW_NO_DISPUTE_FACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdIsNotNull() {
            addCriterion("LAW_NO_DISPUTE_FACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdEqualTo(Long value) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID =", value, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdNotEqualTo(Long value) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID <>", value, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdGreaterThan(Long value) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID >", value, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID >=", value, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdLessThan(Long value) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID <", value, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID <=", value, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdIn(List<Long> values) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID in", values, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdNotIn(List<Long> values) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID not in", values, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdBetween(Long value1, Long value2) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID between", value1, value2, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawNoDisputeFactIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_NO_DISPUTE_FACT_ID not between", value1, value2, "lawNoDisputeFactId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdIsNull() {
            addCriterion("LAW_JUDGLE_BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdIsNotNull() {
            addCriterion("LAW_JUDGLE_BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdEqualTo(Long value) {
            addCriterion("LAW_JUDGLE_BOOK_ID =", value, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdNotEqualTo(Long value) {
            addCriterion("LAW_JUDGLE_BOOK_ID <>", value, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdGreaterThan(Long value) {
            addCriterion("LAW_JUDGLE_BOOK_ID >", value, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_JUDGLE_BOOK_ID >=", value, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdLessThan(Long value) {
            addCriterion("LAW_JUDGLE_BOOK_ID <", value, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_JUDGLE_BOOK_ID <=", value, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdIn(List<Long> values) {
            addCriterion("LAW_JUDGLE_BOOK_ID in", values, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdNotIn(List<Long> values) {
            addCriterion("LAW_JUDGLE_BOOK_ID not in", values, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdBetween(Long value1, Long value2) {
            addCriterion("LAW_JUDGLE_BOOK_ID between", value1, value2, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawJudgleBookIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_JUDGLE_BOOK_ID not between", value1, value2, "lawJudgleBookId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdIsNull() {
            addCriterion("LAW_MSCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdIsNotNull() {
            addCriterion("LAW_MSCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdEqualTo(Long value) {
            addCriterion("LAW_MSCHEME_ID =", value, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdNotEqualTo(Long value) {
            addCriterion("LAW_MSCHEME_ID <>", value, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdGreaterThan(Long value) {
            addCriterion("LAW_MSCHEME_ID >", value, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_MSCHEME_ID >=", value, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdLessThan(Long value) {
            addCriterion("LAW_MSCHEME_ID <", value, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_MSCHEME_ID <=", value, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdIn(List<Long> values) {
            addCriterion("LAW_MSCHEME_ID in", values, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdNotIn(List<Long> values) {
            addCriterion("LAW_MSCHEME_ID not in", values, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdBetween(Long value1, Long value2) {
            addCriterion("LAW_MSCHEME_ID between", value1, value2, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawMschemeIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_MSCHEME_ID not between", value1, value2, "lawMschemeId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdIsNull() {
            addCriterion("LAW_PROMISE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdIsNotNull() {
            addCriterion("LAW_PROMISE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdEqualTo(Long value) {
            addCriterion("LAW_PROMISE_ID =", value, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdNotEqualTo(Long value) {
            addCriterion("LAW_PROMISE_ID <>", value, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdGreaterThan(Long value) {
            addCriterion("LAW_PROMISE_ID >", value, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_PROMISE_ID >=", value, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdLessThan(Long value) {
            addCriterion("LAW_PROMISE_ID <", value, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_PROMISE_ID <=", value, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdIn(List<Long> values) {
            addCriterion("LAW_PROMISE_ID in", values, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdNotIn(List<Long> values) {
            addCriterion("LAW_PROMISE_ID not in", values, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdBetween(Long value1, Long value2) {
            addCriterion("LAW_PROMISE_ID between", value1, value2, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawPromiseIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_PROMISE_ID not between", value1, value2, "lawPromiseId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdIsNull() {
            addCriterion("LAW_DISSENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdIsNotNull() {
            addCriterion("LAW_DISSENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdEqualTo(Long value) {
            addCriterion("LAW_DISSENT_ID =", value, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdNotEqualTo(Long value) {
            addCriterion("LAW_DISSENT_ID <>", value, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdGreaterThan(Long value) {
            addCriterion("LAW_DISSENT_ID >", value, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_DISSENT_ID >=", value, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdLessThan(Long value) {
            addCriterion("LAW_DISSENT_ID <", value, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_DISSENT_ID <=", value, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdIn(List<Long> values) {
            addCriterion("LAW_DISSENT_ID in", values, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdNotIn(List<Long> values) {
            addCriterion("LAW_DISSENT_ID not in", values, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdBetween(Long value1, Long value2) {
            addCriterion("LAW_DISSENT_ID between", value1, value2, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andLawDissentIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_DISSENT_ID not between", value1, value2, "lawDissentId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdIsNull() {
            addCriterion("LAW_ADJUST_BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdIsNotNull() {
            addCriterion("LAW_ADJUST_BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdEqualTo(Long value) {
            addCriterion("LAW_ADJUST_BOOK_ID =", value, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdNotEqualTo(Long value) {
            addCriterion("LAW_ADJUST_BOOK_ID <>", value, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdGreaterThan(Long value) {
            addCriterion("LAW_ADJUST_BOOK_ID >", value, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAW_ADJUST_BOOK_ID >=", value, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdLessThan(Long value) {
            addCriterion("LAW_ADJUST_BOOK_ID <", value, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdLessThanOrEqualTo(Long value) {
            addCriterion("LAW_ADJUST_BOOK_ID <=", value, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdIn(List<Long> values) {
            addCriterion("LAW_ADJUST_BOOK_ID in", values, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdNotIn(List<Long> values) {
            addCriterion("LAW_ADJUST_BOOK_ID not in", values, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdBetween(Long value1, Long value2) {
            addCriterion("LAW_ADJUST_BOOK_ID between", value1, value2, "lawAdjustBookId");
            return (Criteria) this;
        }

        public Criteria andLawAdjustBookIdNotBetween(Long value1, Long value2) {
            addCriterion("LAW_ADJUST_BOOK_ID not between", value1, value2, "lawAdjustBookId");
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