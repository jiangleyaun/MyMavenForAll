package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViolentPrivacyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolentPrivacyExample() {
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

        public Criteria andCrimeHistoryIsNull() {
            addCriterion("CRIME_HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryIsNotNull() {
            addCriterion("CRIME_HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryEqualTo(String value) {
            addCriterion("CRIME_HISTORY =", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryNotEqualTo(String value) {
            addCriterion("CRIME_HISTORY <>", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryGreaterThan(String value) {
            addCriterion("CRIME_HISTORY >", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("CRIME_HISTORY >=", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryLessThan(String value) {
            addCriterion("CRIME_HISTORY <", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryLessThanOrEqualTo(String value) {
            addCriterion("CRIME_HISTORY <=", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryLike(String value) {
            addCriterion("CRIME_HISTORY like", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryNotLike(String value) {
            addCriterion("CRIME_HISTORY not like", value, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryIn(List<String> values) {
            addCriterion("CRIME_HISTORY in", values, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryNotIn(List<String> values) {
            addCriterion("CRIME_HISTORY not in", values, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryBetween(String value1, String value2) {
            addCriterion("CRIME_HISTORY between", value1, value2, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andCrimeHistoryNotBetween(String value1, String value2) {
            addCriterion("CRIME_HISTORY not between", value1, value2, "crimeHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseIsNull() {
            addCriterion("DISEASE is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIsNotNull() {
            addCriterion("DISEASE is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseEqualTo(String value) {
            addCriterion("DISEASE =", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotEqualTo(String value) {
            addCriterion("DISEASE <>", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseGreaterThan(String value) {
            addCriterion("DISEASE >", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("DISEASE >=", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseLessThan(String value) {
            addCriterion("DISEASE <", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseLessThanOrEqualTo(String value) {
            addCriterion("DISEASE <=", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseLike(String value) {
            addCriterion("DISEASE like", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotLike(String value) {
            addCriterion("DISEASE not like", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseIn(List<String> values) {
            addCriterion("DISEASE in", values, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotIn(List<String> values) {
            addCriterion("DISEASE not in", values, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseBetween(String value1, String value2) {
            addCriterion("DISEASE between", value1, value2, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotBetween(String value1, String value2) {
            addCriterion("DISEASE not between", value1, value2, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryIsNull() {
            addCriterion("DISEASE_HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryIsNotNull() {
            addCriterion("DISEASE_HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryEqualTo(String value) {
            addCriterion("DISEASE_HISTORY =", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotEqualTo(String value) {
            addCriterion("DISEASE_HISTORY <>", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryGreaterThan(String value) {
            addCriterion("DISEASE_HISTORY >", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("DISEASE_HISTORY >=", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryLessThan(String value) {
            addCriterion("DISEASE_HISTORY <", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryLessThanOrEqualTo(String value) {
            addCriterion("DISEASE_HISTORY <=", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryLike(String value) {
            addCriterion("DISEASE_HISTORY like", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotLike(String value) {
            addCriterion("DISEASE_HISTORY not like", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryIn(List<String> values) {
            addCriterion("DISEASE_HISTORY in", values, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotIn(List<String> values) {
            addCriterion("DISEASE_HISTORY not in", values, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryBetween(String value1, String value2) {
            addCriterion("DISEASE_HISTORY between", value1, value2, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotBetween(String value1, String value2) {
            addCriterion("DISEASE_HISTORY not between", value1, value2, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryIsNull() {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryIsNotNull() {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryEqualTo(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY =", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryNotEqualTo(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY <>", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryGreaterThan(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY >", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY >=", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryLessThan(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY <", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryLessThanOrEqualTo(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY <=", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryLike(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY like", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryNotLike(String value) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY not like", value, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryIn(List<String> values) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY in", values, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryNotIn(List<String> values) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY not in", values, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryBetween(String value1, String value2) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY between", value1, value2, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andDomesticViolenceHistoryNotBetween(String value1, String value2) {
            addCriterion("DOMESTIC_VIOLENCE_HISTORY not between", value1, value2, "domesticViolenceHistory");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessIsNull() {
            addCriterion("MENTAL_ILLNESS is null");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessIsNotNull() {
            addCriterion("MENTAL_ILLNESS is not null");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessEqualTo(Boolean value) {
            addCriterion("MENTAL_ILLNESS =", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessNotEqualTo(Boolean value) {
            addCriterion("MENTAL_ILLNESS <>", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessGreaterThan(Boolean value) {
            addCriterion("MENTAL_ILLNESS >", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MENTAL_ILLNESS >=", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessLessThan(Boolean value) {
            addCriterion("MENTAL_ILLNESS <", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessLessThanOrEqualTo(Boolean value) {
            addCriterion("MENTAL_ILLNESS <=", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessIn(List<Boolean> values) {
            addCriterion("MENTAL_ILLNESS in", values, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessNotIn(List<Boolean> values) {
            addCriterion("MENTAL_ILLNESS not in", values, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessBetween(Boolean value1, Boolean value2) {
            addCriterion("MENTAL_ILLNESS between", value1, value2, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MENTAL_ILLNESS not between", value1, value2, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andPrivacyIsNull() {
            addCriterion("PRIVACY is null");
            return (Criteria) this;
        }

        public Criteria andPrivacyIsNotNull() {
            addCriterion("PRIVACY is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacyEqualTo(Boolean value) {
            addCriterion("PRIVACY =", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyNotEqualTo(Boolean value) {
            addCriterion("PRIVACY <>", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyGreaterThan(Boolean value) {
            addCriterion("PRIVACY >", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PRIVACY >=", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyLessThan(Boolean value) {
            addCriterion("PRIVACY <", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyLessThanOrEqualTo(Boolean value) {
            addCriterion("PRIVACY <=", value, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyIn(List<Boolean> values) {
            addCriterion("PRIVACY in", values, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyNotIn(List<Boolean> values) {
            addCriterion("PRIVACY not in", values, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyBetween(Boolean value1, Boolean value2) {
            addCriterion("PRIVACY between", value1, value2, "privacy");
            return (Criteria) this;
        }

        public Criteria andPrivacyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PRIVACY not between", value1, value2, "privacy");
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

        public Criteria andViolentPersonnelIdIsNull() {
            addCriterion("VIOLENT_PERSONNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdIsNotNull() {
            addCriterion("VIOLENT_PERSONNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdEqualTo(Long value) {
            addCriterion("VIOLENT_PERSONNEL_ID =", value, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdNotEqualTo(Long value) {
            addCriterion("VIOLENT_PERSONNEL_ID <>", value, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdGreaterThan(Long value) {
            addCriterion("VIOLENT_PERSONNEL_ID >", value, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VIOLENT_PERSONNEL_ID >=", value, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdLessThan(Long value) {
            addCriterion("VIOLENT_PERSONNEL_ID <", value, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdLessThanOrEqualTo(Long value) {
            addCriterion("VIOLENT_PERSONNEL_ID <=", value, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdIn(List<Long> values) {
            addCriterion("VIOLENT_PERSONNEL_ID in", values, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdNotIn(List<Long> values) {
            addCriterion("VIOLENT_PERSONNEL_ID not in", values, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdBetween(Long value1, Long value2) {
            addCriterion("VIOLENT_PERSONNEL_ID between", value1, value2, "violentPersonnelId");
            return (Criteria) this;
        }

        public Criteria andViolentPersonnelIdNotBetween(Long value1, Long value2) {
            addCriterion("VIOLENT_PERSONNEL_ID not between", value1, value2, "violentPersonnelId");
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