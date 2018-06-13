package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProtectOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProtectOrderExample() {
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

        public Criteria andIsSubmitIsNull() {
            addCriterion("IS_SUBMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsSubmitIsNotNull() {
            addCriterion("IS_SUBMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubmitEqualTo(Boolean value) {
            addCriterion("IS_SUBMIT =", value, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitNotEqualTo(Boolean value) {
            addCriterion("IS_SUBMIT <>", value, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitGreaterThan(Boolean value) {
            addCriterion("IS_SUBMIT >", value, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_SUBMIT >=", value, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitLessThan(Boolean value) {
            addCriterion("IS_SUBMIT <", value, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_SUBMIT <=", value, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitIn(List<Boolean> values) {
            addCriterion("IS_SUBMIT in", values, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitNotIn(List<Boolean> values) {
            addCriterion("IS_SUBMIT not in", values, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SUBMIT between", value1, value2, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andIsSubmitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SUBMIT not between", value1, value2, "isSubmit");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNull() {
            addCriterion("SERVICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNotNull() {
            addCriterion("SERVICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNoEqualTo(String value) {
            addCriterion("SERVICE_NO =", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotEqualTo(String value) {
            addCriterion("SERVICE_NO <>", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThan(String value) {
            addCriterion("SERVICE_NO >", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NO >=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThan(String value) {
            addCriterion("SERVICE_NO <", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NO <=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLike(String value) {
            addCriterion("SERVICE_NO like", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotLike(String value) {
            addCriterion("SERVICE_NO not like", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoIn(List<String> values) {
            addCriterion("SERVICE_NO in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotIn(List<String> values) {
            addCriterion("SERVICE_NO not in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoBetween(String value1, String value2) {
            addCriterion("SERVICE_NO between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NO not between", value1, value2, "serviceNo");
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

        public Criteria andOrgByAddressTypeIsNull() {
            addCriterion("ORG_BY_ADDRESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeIsNotNull() {
            addCriterion("ORG_BY_ADDRESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeEqualTo(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE =", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeNotEqualTo(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE <>", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeGreaterThan(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE >", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE >=", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeLessThan(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE <", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeLessThanOrEqualTo(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE <=", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeLike(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE like", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeNotLike(String value) {
            addCriterion("ORG_BY_ADDRESS_TYPE not like", value, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeIn(List<String> values) {
            addCriterion("ORG_BY_ADDRESS_TYPE in", values, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeNotIn(List<String> values) {
            addCriterion("ORG_BY_ADDRESS_TYPE not in", values, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeBetween(String value1, String value2) {
            addCriterion("ORG_BY_ADDRESS_TYPE between", value1, value2, "orgByAddressType");
            return (Criteria) this;
        }

        public Criteria andOrgByAddressTypeNotBetween(String value1, String value2) {
            addCriterion("ORG_BY_ADDRESS_TYPE not between", value1, value2, "orgByAddressType");
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