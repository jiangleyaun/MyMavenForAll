package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ViolentPersonnelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolentPersonnelExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEmergencyPhoneIsNull() {
            addCriterion("EMERGENCY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIsNotNull() {
            addCriterion("EMERGENCY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE =", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE <>", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneGreaterThan(String value) {
            addCriterion("EMERGENCY_PHONE >", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE >=", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLessThan(String value) {
            addCriterion("EMERGENCY_PHONE <", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLessThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE <=", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLike(String value) {
            addCriterion("EMERGENCY_PHONE like", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotLike(String value) {
            addCriterion("EMERGENCY_PHONE not like", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIn(List<String> values) {
            addCriterion("EMERGENCY_PHONE in", values, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotIn(List<String> values) {
            addCriterion("EMERGENCY_PHONE not in", values, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneBetween(String value1, String value2) {
            addCriterion("EMERGENCY_PHONE between", value1, value2, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotBetween(String value1, String value2) {
            addCriterion("EMERGENCY_PHONE not between", value1, value2, "emergencyPhone");
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

        public Criteria andHasChildrenIsNull() {
            addCriterion("HAS_CHILDREN is null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIsNotNull() {
            addCriterion("HAS_CHILDREN is not null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenEqualTo(Boolean value) {
            addCriterion("HAS_CHILDREN =", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotEqualTo(Boolean value) {
            addCriterion("HAS_CHILDREN <>", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThan(Boolean value) {
            addCriterion("HAS_CHILDREN >", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HAS_CHILDREN >=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThan(Boolean value) {
            addCriterion("HAS_CHILDREN <", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThanOrEqualTo(Boolean value) {
            addCriterion("HAS_CHILDREN <=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIn(List<Boolean> values) {
            addCriterion("HAS_CHILDREN in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotIn(List<Boolean> values) {
            addCriterion("HAS_CHILDREN not in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenBetween(Boolean value1, Boolean value2) {
            addCriterion("HAS_CHILDREN between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HAS_CHILDREN not between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("HOBBY is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("HOBBY is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("HOBBY =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("HOBBY <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("HOBBY >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("HOBBY >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("HOBBY <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("HOBBY <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("HOBBY like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("HOBBY not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("HOBBY in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("HOBBY not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("HOBBY between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("HOBBY not between", value1, value2, "hobby");
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

        public Criteria andIncomeIsNull() {
            addCriterion("INCOME is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("INCOME =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("INCOME <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("INCOME >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("INCOME >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("INCOME <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("INCOME <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("INCOME like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("INCOME not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("INCOME in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("INCOME not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("INCOME between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("INCOME not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIsCooperateIsNull() {
            addCriterion("IS_COOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andIsCooperateIsNotNull() {
            addCriterion("IS_COOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsCooperateEqualTo(Boolean value) {
            addCriterion("IS_COOPERATE =", value, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateNotEqualTo(Boolean value) {
            addCriterion("IS_COOPERATE <>", value, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateGreaterThan(Boolean value) {
            addCriterion("IS_COOPERATE >", value, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_COOPERATE >=", value, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateLessThan(Boolean value) {
            addCriterion("IS_COOPERATE <", value, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_COOPERATE <=", value, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateIn(List<Boolean> values) {
            addCriterion("IS_COOPERATE in", values, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateNotIn(List<Boolean> values) {
            addCriterion("IS_COOPERATE not in", values, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_COOPERATE between", value1, value2, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andIsCooperateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_COOPERATE not between", value1, value2, "isCooperate");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeIsNull() {
            addCriterion("MARRIAGE_AGE is null");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeIsNotNull() {
            addCriterion("MARRIAGE_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeEqualTo(Integer value) {
            addCriterion("MARRIAGE_AGE =", value, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeNotEqualTo(Integer value) {
            addCriterion("MARRIAGE_AGE <>", value, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeGreaterThan(Integer value) {
            addCriterion("MARRIAGE_AGE >", value, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MARRIAGE_AGE >=", value, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeLessThan(Integer value) {
            addCriterion("MARRIAGE_AGE <", value, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeLessThanOrEqualTo(Integer value) {
            addCriterion("MARRIAGE_AGE <=", value, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeIn(List<Integer> values) {
            addCriterion("MARRIAGE_AGE in", values, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeNotIn(List<Integer> values) {
            addCriterion("MARRIAGE_AGE not in", values, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeBetween(Integer value1, Integer value2) {
            addCriterion("MARRIAGE_AGE between", value1, value2, "marriageAge");
            return (Criteria) this;
        }

        public Criteria andMarriageAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("MARRIAGE_AGE not between", value1, value2, "marriageAge");
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

        public Criteria andOccupationIsNull() {
            addCriterion("OCCUPATION is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("OCCUPATION is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("OCCUPATION =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("OCCUPATION <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("OCCUPATION >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("OCCUPATION >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("OCCUPATION <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("OCCUPATION <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("OCCUPATION like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("OCCUPATION not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("OCCUPATION in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("OCCUPATION not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("OCCUPATION between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("OCCUPATION not between", value1, value2, "occupation");
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

        public Criteria andRegistrationDetailIsNull() {
            addCriterion("REGISTRATION_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailIsNotNull() {
            addCriterion("REGISTRATION_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailEqualTo(String value) {
            addCriterion("REGISTRATION_DETAIL =", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailNotEqualTo(String value) {
            addCriterion("REGISTRATION_DETAIL <>", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailGreaterThan(String value) {
            addCriterion("REGISTRATION_DETAIL >", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_DETAIL >=", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailLessThan(String value) {
            addCriterion("REGISTRATION_DETAIL <", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_DETAIL <=", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailLike(String value) {
            addCriterion("REGISTRATION_DETAIL like", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailNotLike(String value) {
            addCriterion("REGISTRATION_DETAIL not like", value, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailIn(List<String> values) {
            addCriterion("REGISTRATION_DETAIL in", values, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailNotIn(List<String> values) {
            addCriterion("REGISTRATION_DETAIL not in", values, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailBetween(String value1, String value2) {
            addCriterion("REGISTRATION_DETAIL between", value1, value2, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRegistrationDetailNotBetween(String value1, String value2) {
            addCriterion("REGISTRATION_DETAIL not between", value1, value2, "registrationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyIsNull() {
            addCriterion("RELATION_TO_APPLY is null");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyIsNotNull() {
            addCriterion("RELATION_TO_APPLY is not null");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyEqualTo(String value) {
            addCriterion("RELATION_TO_APPLY =", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyNotEqualTo(String value) {
            addCriterion("RELATION_TO_APPLY <>", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyGreaterThan(String value) {
            addCriterion("RELATION_TO_APPLY >", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION_TO_APPLY >=", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyLessThan(String value) {
            addCriterion("RELATION_TO_APPLY <", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyLessThanOrEqualTo(String value) {
            addCriterion("RELATION_TO_APPLY <=", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyLike(String value) {
            addCriterion("RELATION_TO_APPLY like", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyNotLike(String value) {
            addCriterion("RELATION_TO_APPLY not like", value, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyIn(List<String> values) {
            addCriterion("RELATION_TO_APPLY in", values, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyNotIn(List<String> values) {
            addCriterion("RELATION_TO_APPLY not in", values, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyBetween(String value1, String value2) {
            addCriterion("RELATION_TO_APPLY between", value1, value2, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToApplyNotBetween(String value1, String value2) {
            addCriterion("RELATION_TO_APPLY not between", value1, value2, "relationToApply");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentIsNull() {
            addCriterion("RELATION_TO_RESPONDENT is null");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentIsNotNull() {
            addCriterion("RELATION_TO_RESPONDENT is not null");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentEqualTo(String value) {
            addCriterion("RELATION_TO_RESPONDENT =", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentNotEqualTo(String value) {
            addCriterion("RELATION_TO_RESPONDENT <>", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentGreaterThan(String value) {
            addCriterion("RELATION_TO_RESPONDENT >", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION_TO_RESPONDENT >=", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentLessThan(String value) {
            addCriterion("RELATION_TO_RESPONDENT <", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentLessThanOrEqualTo(String value) {
            addCriterion("RELATION_TO_RESPONDENT <=", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentLike(String value) {
            addCriterion("RELATION_TO_RESPONDENT like", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentNotLike(String value) {
            addCriterion("RELATION_TO_RESPONDENT not like", value, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentIn(List<String> values) {
            addCriterion("RELATION_TO_RESPONDENT in", values, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentNotIn(List<String> values) {
            addCriterion("RELATION_TO_RESPONDENT not in", values, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentBetween(String value1, String value2) {
            addCriterion("RELATION_TO_RESPONDENT between", value1, value2, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andRelationToRespondentNotBetween(String value1, String value2) {
            addCriterion("RELATION_TO_RESPONDENT not between", value1, value2, "relationToRespondent");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeIsNull() {
            addCriterion("RESIDENCE_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeIsNotNull() {
            addCriterion("RESIDENCE_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeEqualTo(String value) {
            addCriterion("RESIDENCE_AREA_CODE =", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeNotEqualTo(String value) {
            addCriterion("RESIDENCE_AREA_CODE <>", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeGreaterThan(String value) {
            addCriterion("RESIDENCE_AREA_CODE >", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_AREA_CODE >=", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeLessThan(String value) {
            addCriterion("RESIDENCE_AREA_CODE <", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_AREA_CODE <=", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeLike(String value) {
            addCriterion("RESIDENCE_AREA_CODE like", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeNotLike(String value) {
            addCriterion("RESIDENCE_AREA_CODE not like", value, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeIn(List<String> values) {
            addCriterion("RESIDENCE_AREA_CODE in", values, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeNotIn(List<String> values) {
            addCriterion("RESIDENCE_AREA_CODE not in", values, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeBetween(String value1, String value2) {
            addCriterion("RESIDENCE_AREA_CODE between", value1, value2, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceAreaCodeNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_AREA_CODE not between", value1, value2, "residenceAreaCode");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailIsNull() {
            addCriterion("RESIDENCE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailIsNotNull() {
            addCriterion("RESIDENCE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailEqualTo(String value) {
            addCriterion("RESIDENCE_DETAIL =", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailNotEqualTo(String value) {
            addCriterion("RESIDENCE_DETAIL <>", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailGreaterThan(String value) {
            addCriterion("RESIDENCE_DETAIL >", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_DETAIL >=", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailLessThan(String value) {
            addCriterion("RESIDENCE_DETAIL <", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_DETAIL <=", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailLike(String value) {
            addCriterion("RESIDENCE_DETAIL like", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailNotLike(String value) {
            addCriterion("RESIDENCE_DETAIL not like", value, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailIn(List<String> values) {
            addCriterion("RESIDENCE_DETAIL in", values, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailNotIn(List<String> values) {
            addCriterion("RESIDENCE_DETAIL not in", values, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailBetween(String value1, String value2) {
            addCriterion("RESIDENCE_DETAIL between", value1, value2, "residenceDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceDetailNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_DETAIL not between", value1, value2, "residenceDetail");
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

        public Criteria andViolenceYearsIsNull() {
            addCriterion("VIOLENCE_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsIsNotNull() {
            addCriterion("VIOLENCE_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsEqualTo(Integer value) {
            addCriterion("VIOLENCE_YEARS =", value, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsNotEqualTo(Integer value) {
            addCriterion("VIOLENCE_YEARS <>", value, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsGreaterThan(Integer value) {
            addCriterion("VIOLENCE_YEARS >", value, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIOLENCE_YEARS >=", value, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsLessThan(Integer value) {
            addCriterion("VIOLENCE_YEARS <", value, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsLessThanOrEqualTo(Integer value) {
            addCriterion("VIOLENCE_YEARS <=", value, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsIn(List<Integer> values) {
            addCriterion("VIOLENCE_YEARS in", values, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsNotIn(List<Integer> values) {
            addCriterion("VIOLENCE_YEARS not in", values, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsBetween(Integer value1, Integer value2) {
            addCriterion("VIOLENCE_YEARS between", value1, value2, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolenceYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("VIOLENCE_YEARS not between", value1, value2, "violenceYears");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdIsNull() {
            addCriterion("VIOLENT_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdIsNotNull() {
            addCriterion("VIOLENT_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdEqualTo(Long value) {
            addCriterion("VIOLENT_CASE_ID =", value, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdNotEqualTo(Long value) {
            addCriterion("VIOLENT_CASE_ID <>", value, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdGreaterThan(Long value) {
            addCriterion("VIOLENT_CASE_ID >", value, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VIOLENT_CASE_ID >=", value, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdLessThan(Long value) {
            addCriterion("VIOLENT_CASE_ID <", value, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("VIOLENT_CASE_ID <=", value, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdIn(List<Long> values) {
            addCriterion("VIOLENT_CASE_ID in", values, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdNotIn(List<Long> values) {
            addCriterion("VIOLENT_CASE_ID not in", values, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdBetween(Long value1, Long value2) {
            addCriterion("VIOLENT_CASE_ID between", value1, value2, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andViolentCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("VIOLENT_CASE_ID not between", value1, value2, "violentCaseId");
            return (Criteria) this;
        }

        public Criteria andSigTimeIsNull() {
            addCriterion("SIG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSigTimeIsNotNull() {
            addCriterion("SIG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSigTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SIG_TIME =", value, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SIG_TIME <>", value, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SIG_TIME >", value, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIG_TIME >=", value, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeLessThan(Date value) {
            addCriterionForJDBCDate("SIG_TIME <", value, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SIG_TIME <=", value, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SIG_TIME in", values, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SIG_TIME not in", values, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIG_TIME between", value1, value2, "sigTime");
            return (Criteria) this;
        }

        public Criteria andSigTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SIG_TIME not between", value1, value2, "sigTime");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdIsNull() {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdIsNotNull() {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID =", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdNotEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID <>", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdGreaterThan(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID >", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID >=", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdLessThan(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID <", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdLessThanOrEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID <=", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdIn(List<Long> values) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID in", values, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdNotIn(List<Long> values) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID not in", values, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdBetween(Long value1, Long value2) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID between", value1, value2, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdNotBetween(Long value1, Long value2) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID not between", value1, value2, "psychologicalCounselingId");
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