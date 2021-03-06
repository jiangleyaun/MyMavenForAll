package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LawCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawCaseExample() {
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

        public Criteria andRespondentIdIsNull() {
            addCriterion("RESPONDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRespondentIdIsNotNull() {
            addCriterion("RESPONDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRespondentIdEqualTo(Long value) {
            addCriterion("RESPONDENT_ID =", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdNotEqualTo(Long value) {
            addCriterion("RESPONDENT_ID <>", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdGreaterThan(Long value) {
            addCriterion("RESPONDENT_ID >", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RESPONDENT_ID >=", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdLessThan(Long value) {
            addCriterion("RESPONDENT_ID <", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdLessThanOrEqualTo(Long value) {
            addCriterion("RESPONDENT_ID <=", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdIn(List<Long> values) {
            addCriterion("RESPONDENT_ID in", values, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdNotIn(List<Long> values) {
            addCriterion("RESPONDENT_ID not in", values, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdBetween(Long value1, Long value2) {
            addCriterion("RESPONDENT_ID between", value1, value2, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdNotBetween(Long value1, Long value2) {
            addCriterion("RESPONDENT_ID not between", value1, value2, "respondentId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("APPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("APPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Long value) {
            addCriterion("APPLY_ID =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Long value) {
            addCriterion("APPLY_ID <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Long value) {
            addCriterion("APPLY_ID >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLY_ID >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Long value) {
            addCriterion("APPLY_ID <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Long value) {
            addCriterion("APPLY_ID <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Long> values) {
            addCriterion("APPLY_ID in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Long> values) {
            addCriterion("APPLY_ID not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Long value1, Long value2) {
            addCriterion("APPLY_ID between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Long value1, Long value2) {
            addCriterion("APPLY_ID not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdIsNull() {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdIsNotNull() {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID =", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdNotEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID <>", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdGreaterThan(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID >", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID >=", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdLessThan(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID <", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdLessThanOrEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID <=", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdIn(List<Long> values) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID in", values, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdNotIn(List<Long> values) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID not in", values, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdBetween(Long value1, Long value2) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID between", value1, value2, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdNotBetween(Long value1, Long value2) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID not between", value1, value2, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdIsNull() {
            addCriterion("SUIT_PERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdIsNotNull() {
            addCriterion("SUIT_PERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdEqualTo(String value) {
            addCriterion("SUIT_PERSON_ID =", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdNotEqualTo(String value) {
            addCriterion("SUIT_PERSON_ID <>", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdGreaterThan(String value) {
            addCriterion("SUIT_PERSON_ID >", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUIT_PERSON_ID >=", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdLessThan(String value) {
            addCriterion("SUIT_PERSON_ID <", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdLessThanOrEqualTo(String value) {
            addCriterion("SUIT_PERSON_ID <=", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdLike(String value) {
            addCriterion("SUIT_PERSON_ID like", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdNotLike(String value) {
            addCriterion("SUIT_PERSON_ID not like", value, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdIn(List<String> values) {
            addCriterion("SUIT_PERSON_ID in", values, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdNotIn(List<String> values) {
            addCriterion("SUIT_PERSON_ID not in", values, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdBetween(String value1, String value2) {
            addCriterion("SUIT_PERSON_ID between", value1, value2, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andSuitPersonIdNotBetween(String value1, String value2) {
            addCriterion("SUIT_PERSON_ID not between", value1, value2, "suitPersonId");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdIsNull() {
            addCriterion("AGREEMENT_BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdIsNotNull() {
            addCriterion("AGREEMENT_BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdEqualTo(Long value) {
            addCriterion("AGREEMENT_BOOK_ID =", value, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdNotEqualTo(Long value) {
            addCriterion("AGREEMENT_BOOK_ID <>", value, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdGreaterThan(Long value) {
            addCriterion("AGREEMENT_BOOK_ID >", value, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AGREEMENT_BOOK_ID >=", value, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdLessThan(Long value) {
            addCriterion("AGREEMENT_BOOK_ID <", value, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdLessThanOrEqualTo(Long value) {
            addCriterion("AGREEMENT_BOOK_ID <=", value, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdIn(List<Long> values) {
            addCriterion("AGREEMENT_BOOK_ID in", values, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdNotIn(List<Long> values) {
            addCriterion("AGREEMENT_BOOK_ID not in", values, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdBetween(Long value1, Long value2) {
            addCriterion("AGREEMENT_BOOK_ID between", value1, value2, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andAgreementBookIdNotBetween(Long value1, Long value2) {
            addCriterion("AGREEMENT_BOOK_ID not between", value1, value2, "agreementBookId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("VIDEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("VIDEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("VIDEO_ID =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("VIDEO_ID <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("VIDEO_ID >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VIDEO_ID >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("VIDEO_ID <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("VIDEO_ID <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("VIDEO_ID in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("VIDEO_ID not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("VIDEO_ID between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("VIDEO_ID not between", value1, value2, "videoId");
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

        public Criteria andCaseCompleteTimeIsNull() {
            addCriterion("CASE_COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeIsNotNull() {
            addCriterion("CASE_COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeEqualTo(Date value) {
            addCriterion("CASE_COMPLETE_TIME =", value, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeNotEqualTo(Date value) {
            addCriterion("CASE_COMPLETE_TIME <>", value, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeGreaterThan(Date value) {
            addCriterion("CASE_COMPLETE_TIME >", value, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CASE_COMPLETE_TIME >=", value, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeLessThan(Date value) {
            addCriterion("CASE_COMPLETE_TIME <", value, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("CASE_COMPLETE_TIME <=", value, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeIn(List<Date> values) {
            addCriterion("CASE_COMPLETE_TIME in", values, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeNotIn(List<Date> values) {
            addCriterion("CASE_COMPLETE_TIME not in", values, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("CASE_COMPLETE_TIME between", value1, value2, "caseCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCaseCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("CASE_COMPLETE_TIME not between", value1, value2, "caseCompleteTime");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReserveDateIsNull() {
            addCriterion("RESERVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReserveDateIsNotNull() {
            addCriterion("RESERVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReserveDateEqualTo(Date value) {
            addCriterion("RESERVE_DATE =", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateNotEqualTo(Date value) {
            addCriterion("RESERVE_DATE <>", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateGreaterThan(Date value) {
            addCriterion("RESERVE_DATE >", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RESERVE_DATE >=", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateLessThan(Date value) {
            addCriterion("RESERVE_DATE <", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateLessThanOrEqualTo(Date value) {
            addCriterion("RESERVE_DATE <=", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateIn(List<Date> values) {
            addCriterion("RESERVE_DATE in", values, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateNotIn(List<Date> values) {
            addCriterion("RESERVE_DATE not in", values, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateBetween(Date value1, Date value2) {
            addCriterion("RESERVE_DATE between", value1, value2, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateNotBetween(Date value1, Date value2) {
            addCriterion("RESERVE_DATE not between", value1, value2, "reserveDate");
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

        public Criteria andDisputeDictIdIsNull() {
            addCriterion("DISPUTE_DICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdIsNotNull() {
            addCriterion("DISPUTE_DICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdEqualTo(Long value) {
            addCriterion("DISPUTE_DICT_ID =", value, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdNotEqualTo(Long value) {
            addCriterion("DISPUTE_DICT_ID <>", value, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdGreaterThan(Long value) {
            addCriterion("DISPUTE_DICT_ID >", value, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DISPUTE_DICT_ID >=", value, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdLessThan(Long value) {
            addCriterion("DISPUTE_DICT_ID <", value, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdLessThanOrEqualTo(Long value) {
            addCriterion("DISPUTE_DICT_ID <=", value, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdIn(List<Long> values) {
            addCriterion("DISPUTE_DICT_ID in", values, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdNotIn(List<Long> values) {
            addCriterion("DISPUTE_DICT_ID not in", values, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdBetween(Long value1, Long value2) {
            addCriterion("DISPUTE_DICT_ID between", value1, value2, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDisputeDictIdNotBetween(Long value1, Long value2) {
            addCriterion("DISPUTE_DICT_ID not between", value1, value2, "disputeDictId");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNull() {
            addCriterion("DICT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNotNull() {
            addCriterion("DICT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictCodeEqualTo(String value) {
            addCriterion("DICT_CODE =", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotEqualTo(String value) {
            addCriterion("DICT_CODE <>", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThan(String value) {
            addCriterion("DICT_CODE >", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_CODE >=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThan(String value) {
            addCriterion("DICT_CODE <", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThanOrEqualTo(String value) {
            addCriterion("DICT_CODE <=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLike(String value) {
            addCriterion("DICT_CODE like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotLike(String value) {
            addCriterion("DICT_CODE not like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeIn(List<String> values) {
            addCriterion("DICT_CODE in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotIn(List<String> values) {
            addCriterion("DICT_CODE not in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeBetween(String value1, String value2) {
            addCriterion("DICT_CODE between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotBetween(String value1, String value2) {
            addCriterion("DICT_CODE not between", value1, value2, "dictCode");
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

        public Criteria andIsSendIsNull() {
            addCriterion("IS_SEND is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("IS_SEND is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(String value) {
            addCriterion("IS_SEND =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(String value) {
            addCriterion("IS_SEND <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(String value) {
            addCriterion("IS_SEND >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(String value) {
            addCriterion("IS_SEND <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLike(String value) {
            addCriterion("IS_SEND like", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotLike(String value) {
            addCriterion("IS_SEND not like", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<String> values) {
            addCriterion("IS_SEND in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<String> values) {
            addCriterion("IS_SEND not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(String value1, String value2) {
            addCriterion("IS_SEND between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(String value1, String value2) {
            addCriterion("IS_SEND not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbIsNull() {
            addCriterion("ISCONFIRMMB is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbIsNotNull() {
            addCriterion("ISCONFIRMMB is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbEqualTo(Boolean value) {
            addCriterion("ISCONFIRMMB =", value, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbNotEqualTo(Boolean value) {
            addCriterion("ISCONFIRMMB <>", value, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbGreaterThan(Boolean value) {
            addCriterion("ISCONFIRMMB >", value, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISCONFIRMMB >=", value, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbLessThan(Boolean value) {
            addCriterion("ISCONFIRMMB <", value, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbLessThanOrEqualTo(Boolean value) {
            addCriterion("ISCONFIRMMB <=", value, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbIn(List<Boolean> values) {
            addCriterion("ISCONFIRMMB in", values, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbNotIn(List<Boolean> values) {
            addCriterion("ISCONFIRMMB not in", values, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbBetween(Boolean value1, Boolean value2) {
            addCriterion("ISCONFIRMMB between", value1, value2, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmmbNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISCONFIRMMB not between", value1, value2, "isconfirmmb");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproIsNull() {
            addCriterion("ISCONFIRMPRO is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproIsNotNull() {
            addCriterion("ISCONFIRMPRO is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproEqualTo(Boolean value) {
            addCriterion("ISCONFIRMPRO =", value, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproNotEqualTo(Boolean value) {
            addCriterion("ISCONFIRMPRO <>", value, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproGreaterThan(Boolean value) {
            addCriterion("ISCONFIRMPRO >", value, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISCONFIRMPRO >=", value, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproLessThan(Boolean value) {
            addCriterion("ISCONFIRMPRO <", value, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproLessThanOrEqualTo(Boolean value) {
            addCriterion("ISCONFIRMPRO <=", value, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproIn(List<Boolean> values) {
            addCriterion("ISCONFIRMPRO in", values, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproNotIn(List<Boolean> values) {
            addCriterion("ISCONFIRMPRO not in", values, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproBetween(Boolean value1, Boolean value2) {
            addCriterion("ISCONFIRMPRO between", value1, value2, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmproNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISCONFIRMPRO not between", value1, value2, "isconfirmpro");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepIsNull() {
            addCriterion("ISCONFIRMREP is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepIsNotNull() {
            addCriterion("ISCONFIRMREP is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepEqualTo(Boolean value) {
            addCriterion("ISCONFIRMREP =", value, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepNotEqualTo(Boolean value) {
            addCriterion("ISCONFIRMREP <>", value, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepGreaterThan(Boolean value) {
            addCriterion("ISCONFIRMREP >", value, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISCONFIRMREP >=", value, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepLessThan(Boolean value) {
            addCriterion("ISCONFIRMREP <", value, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepLessThanOrEqualTo(Boolean value) {
            addCriterion("ISCONFIRMREP <=", value, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepIn(List<Boolean> values) {
            addCriterion("ISCONFIRMREP in", values, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepNotIn(List<Boolean> values) {
            addCriterion("ISCONFIRMREP not in", values, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepBetween(Boolean value1, Boolean value2) {
            addCriterion("ISCONFIRMREP between", value1, value2, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andIsconfirmrepNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISCONFIRMREP not between", value1, value2, "isconfirmrep");
            return (Criteria) this;
        }

        public Criteria andTabIsNull() {
            addCriterion("TAB is null");
            return (Criteria) this;
        }

        public Criteria andTabIsNotNull() {
            addCriterion("TAB is not null");
            return (Criteria) this;
        }

        public Criteria andTabEqualTo(String value) {
            addCriterion("TAB =", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotEqualTo(String value) {
            addCriterion("TAB <>", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabGreaterThan(String value) {
            addCriterion("TAB >", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabGreaterThanOrEqualTo(String value) {
            addCriterion("TAB >=", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLessThan(String value) {
            addCriterion("TAB <", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLessThanOrEqualTo(String value) {
            addCriterion("TAB <=", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLike(String value) {
            addCriterion("TAB like", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotLike(String value) {
            addCriterion("TAB not like", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabIn(List<String> values) {
            addCriterion("TAB in", values, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotIn(List<String> values) {
            addCriterion("TAB not in", values, "tab");
            return (Criteria) this;
        }

        public Criteria andTabBetween(String value1, String value2) {
            addCriterion("TAB between", value1, value2, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotBetween(String value1, String value2) {
            addCriterion("TAB not between", value1, value2, "tab");
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

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAreasNameIsNull() {
            addCriterion("AREAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreasNameIsNotNull() {
            addCriterion("AREAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreasNameEqualTo(String value) {
            addCriterion("AREAS_NAME =", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotEqualTo(String value) {
            addCriterion("AREAS_NAME <>", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameGreaterThan(String value) {
            addCriterion("AREAS_NAME >", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS_NAME >=", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameLessThan(String value) {
            addCriterion("AREAS_NAME <", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameLessThanOrEqualTo(String value) {
            addCriterion("AREAS_NAME <=", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameLike(String value) {
            addCriterion("AREAS_NAME like", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotLike(String value) {
            addCriterion("AREAS_NAME not like", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameIn(List<String> values) {
            addCriterion("AREAS_NAME in", values, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotIn(List<String> values) {
            addCriterion("AREAS_NAME not in", values, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameBetween(String value1, String value2) {
            addCriterion("AREAS_NAME between", value1, value2, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotBetween(String value1, String value2) {
            addCriterion("AREAS_NAME not between", value1, value2, "areasName");
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

        public Criteria andOriginIsNull() {
            addCriterion("ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("ORIGIN =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("ORIGIN <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("ORIGIN >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("ORIGIN <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("ORIGIN like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("ORIGIN not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("ORIGIN in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("ORIGIN not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("ORIGIN between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("ORIGIN not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmIsNull() {
            addCriterion("ORG_COFIRM is null");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmIsNotNull() {
            addCriterion("ORG_COFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmEqualTo(Integer value) {
            addCriterion("ORG_COFIRM =", value, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmNotEqualTo(Integer value) {
            addCriterion("ORG_COFIRM <>", value, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmGreaterThan(Integer value) {
            addCriterion("ORG_COFIRM >", value, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_COFIRM >=", value, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmLessThan(Integer value) {
            addCriterion("ORG_COFIRM <", value, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_COFIRM <=", value, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmIn(List<Integer> values) {
            addCriterion("ORG_COFIRM in", values, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmNotIn(List<Integer> values) {
            addCriterion("ORG_COFIRM not in", values, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmBetween(Integer value1, Integer value2) {
            addCriterion("ORG_COFIRM between", value1, value2, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andOrgCofirmNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_COFIRM not between", value1, value2, "orgCofirm");
            return (Criteria) this;
        }

        public Criteria andDisputesIdIsNull() {
            addCriterion("DISPUTES_ID is null");
            return (Criteria) this;
        }

        public Criteria andDisputesIdIsNotNull() {
            addCriterion("DISPUTES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDisputesIdEqualTo(Long value) {
            addCriterion("DISPUTES_ID =", value, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdNotEqualTo(Long value) {
            addCriterion("DISPUTES_ID <>", value, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdGreaterThan(Long value) {
            addCriterion("DISPUTES_ID >", value, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DISPUTES_ID >=", value, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdLessThan(Long value) {
            addCriterion("DISPUTES_ID <", value, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdLessThanOrEqualTo(Long value) {
            addCriterion("DISPUTES_ID <=", value, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdIn(List<Long> values) {
            addCriterion("DISPUTES_ID in", values, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdNotIn(List<Long> values) {
            addCriterion("DISPUTES_ID not in", values, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdBetween(Long value1, Long value2) {
            addCriterion("DISPUTES_ID between", value1, value2, "disputesId");
            return (Criteria) this;
        }

        public Criteria andDisputesIdNotBetween(Long value1, Long value2) {
            addCriterion("DISPUTES_ID not between", value1, value2, "disputesId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdIsNull() {
            addCriterion("ADJUST_BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdIsNotNull() {
            addCriterion("ADJUST_BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdEqualTo(Long value) {
            addCriterion("ADJUST_BOOK_ID =", value, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdNotEqualTo(Long value) {
            addCriterion("ADJUST_BOOK_ID <>", value, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdGreaterThan(Long value) {
            addCriterion("ADJUST_BOOK_ID >", value, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ADJUST_BOOK_ID >=", value, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdLessThan(Long value) {
            addCriterion("ADJUST_BOOK_ID <", value, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdLessThanOrEqualTo(Long value) {
            addCriterion("ADJUST_BOOK_ID <=", value, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdIn(List<Long> values) {
            addCriterion("ADJUST_BOOK_ID in", values, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdNotIn(List<Long> values) {
            addCriterion("ADJUST_BOOK_ID not in", values, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdBetween(Long value1, Long value2) {
            addCriterion("ADJUST_BOOK_ID between", value1, value2, "adjustBookId");
            return (Criteria) this;
        }

        public Criteria andAdjustBookIdNotBetween(Long value1, Long value2) {
            addCriterion("ADJUST_BOOK_ID not between", value1, value2, "adjustBookId");
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

        public Criteria andIsSendNoDfIsNull() {
            addCriterion("IS_SEND_NO_DF is null");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfIsNotNull() {
            addCriterion("IS_SEND_NO_DF is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfEqualTo(String value) {
            addCriterion("IS_SEND_NO_DF =", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfNotEqualTo(String value) {
            addCriterion("IS_SEND_NO_DF <>", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfGreaterThan(String value) {
            addCriterion("IS_SEND_NO_DF >", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_NO_DF >=", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfLessThan(String value) {
            addCriterion("IS_SEND_NO_DF <", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_NO_DF <=", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfLike(String value) {
            addCriterion("IS_SEND_NO_DF like", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfNotLike(String value) {
            addCriterion("IS_SEND_NO_DF not like", value, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfIn(List<String> values) {
            addCriterion("IS_SEND_NO_DF in", values, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfNotIn(List<String> values) {
            addCriterion("IS_SEND_NO_DF not in", values, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfBetween(String value1, String value2) {
            addCriterion("IS_SEND_NO_DF between", value1, value2, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendNoDfNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_NO_DF not between", value1, value2, "isSendNoDf");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleIsNull() {
            addCriterion("IS_SEND_JUDGLE is null");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleIsNotNull() {
            addCriterion("IS_SEND_JUDGLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleEqualTo(String value) {
            addCriterion("IS_SEND_JUDGLE =", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleNotEqualTo(String value) {
            addCriterion("IS_SEND_JUDGLE <>", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleGreaterThan(String value) {
            addCriterion("IS_SEND_JUDGLE >", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_JUDGLE >=", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleLessThan(String value) {
            addCriterion("IS_SEND_JUDGLE <", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_JUDGLE <=", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleLike(String value) {
            addCriterion("IS_SEND_JUDGLE like", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleNotLike(String value) {
            addCriterion("IS_SEND_JUDGLE not like", value, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleIn(List<String> values) {
            addCriterion("IS_SEND_JUDGLE in", values, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleNotIn(List<String> values) {
            addCriterion("IS_SEND_JUDGLE not in", values, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleBetween(String value1, String value2) {
            addCriterion("IS_SEND_JUDGLE between", value1, value2, "isSendJudgle");
            return (Criteria) this;
        }

        public Criteria andIsSendJudgleNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_JUDGLE not between", value1, value2, "isSendJudgle");
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

        public Criteria andIsSendLawPromiseIsNull() {
            addCriterion("IS_SEND_LAW_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseIsNotNull() {
            addCriterion("IS_SEND_LAW_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseEqualTo(String value) {
            addCriterion("IS_SEND_LAW_PROMISE =", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseNotEqualTo(String value) {
            addCriterion("IS_SEND_LAW_PROMISE <>", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseGreaterThan(String value) {
            addCriterion("IS_SEND_LAW_PROMISE >", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_LAW_PROMISE >=", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseLessThan(String value) {
            addCriterion("IS_SEND_LAW_PROMISE <", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_LAW_PROMISE <=", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseLike(String value) {
            addCriterion("IS_SEND_LAW_PROMISE like", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseNotLike(String value) {
            addCriterion("IS_SEND_LAW_PROMISE not like", value, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseIn(List<String> values) {
            addCriterion("IS_SEND_LAW_PROMISE in", values, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseNotIn(List<String> values) {
            addCriterion("IS_SEND_LAW_PROMISE not in", values, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseBetween(String value1, String value2) {
            addCriterion("IS_SEND_LAW_PROMISE between", value1, value2, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawPromiseNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_LAW_PROMISE not between", value1, value2, "isSendLawPromise");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschIsNull() {
            addCriterion("IS_SEND_LAW_MSCH is null");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschIsNotNull() {
            addCriterion("IS_SEND_LAW_MSCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschEqualTo(String value) {
            addCriterion("IS_SEND_LAW_MSCH =", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschNotEqualTo(String value) {
            addCriterion("IS_SEND_LAW_MSCH <>", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschGreaterThan(String value) {
            addCriterion("IS_SEND_LAW_MSCH >", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_LAW_MSCH >=", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschLessThan(String value) {
            addCriterion("IS_SEND_LAW_MSCH <", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_LAW_MSCH <=", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschLike(String value) {
            addCriterion("IS_SEND_LAW_MSCH like", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschNotLike(String value) {
            addCriterion("IS_SEND_LAW_MSCH not like", value, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschIn(List<String> values) {
            addCriterion("IS_SEND_LAW_MSCH in", values, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschNotIn(List<String> values) {
            addCriterion("IS_SEND_LAW_MSCH not in", values, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschBetween(String value1, String value2) {
            addCriterion("IS_SEND_LAW_MSCH between", value1, value2, "isSendLawMsch");
            return (Criteria) this;
        }

        public Criteria andIsSendLawMschNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_LAW_MSCH not between", value1, value2, "isSendLawMsch");
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

        public Criteria andSuitCountIsNull() {
            addCriterion("SUIT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuitCountIsNotNull() {
            addCriterion("SUIT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuitCountEqualTo(Integer value) {
            addCriterion("SUIT_COUNT =", value, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountNotEqualTo(Integer value) {
            addCriterion("SUIT_COUNT <>", value, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountGreaterThan(Integer value) {
            addCriterion("SUIT_COUNT >", value, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUIT_COUNT >=", value, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountLessThan(Integer value) {
            addCriterion("SUIT_COUNT <", value, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountLessThanOrEqualTo(Integer value) {
            addCriterion("SUIT_COUNT <=", value, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountIn(List<Integer> values) {
            addCriterion("SUIT_COUNT in", values, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountNotIn(List<Integer> values) {
            addCriterion("SUIT_COUNT not in", values, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountBetween(Integer value1, Integer value2) {
            addCriterion("SUIT_COUNT between", value1, value2, "suitCount");
            return (Criteria) this;
        }

        public Criteria andSuitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SUIT_COUNT not between", value1, value2, "suitCount");
            return (Criteria) this;
        }

        public Criteria andMediateTypesIsNull() {
            addCriterion("MEDIATE_TYPES is null");
            return (Criteria) this;
        }

        public Criteria andMediateTypesIsNotNull() {
            addCriterion("MEDIATE_TYPES is not null");
            return (Criteria) this;
        }

        public Criteria andMediateTypesEqualTo(String value) {
            addCriterion("MEDIATE_TYPES =", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesNotEqualTo(String value) {
            addCriterion("MEDIATE_TYPES <>", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesGreaterThan(String value) {
            addCriterion("MEDIATE_TYPES >", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIATE_TYPES >=", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesLessThan(String value) {
            addCriterion("MEDIATE_TYPES <", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesLessThanOrEqualTo(String value) {
            addCriterion("MEDIATE_TYPES <=", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesLike(String value) {
            addCriterion("MEDIATE_TYPES like", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesNotLike(String value) {
            addCriterion("MEDIATE_TYPES not like", value, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesIn(List<String> values) {
            addCriterion("MEDIATE_TYPES in", values, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesNotIn(List<String> values) {
            addCriterion("MEDIATE_TYPES not in", values, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesBetween(String value1, String value2) {
            addCriterion("MEDIATE_TYPES between", value1, value2, "mediateTypes");
            return (Criteria) this;
        }

        public Criteria andMediateTypesNotBetween(String value1, String value2) {
            addCriterion("MEDIATE_TYPES not between", value1, value2, "mediateTypes");
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