package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LawCaseTransferHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawCaseTransferHistoryExample() {
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

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdIsNull() {
            addCriterion("FROM_ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdIsNotNull() {
            addCriterion("FROM_ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdEqualTo(Long value) {
            addCriterion("FROM_ORD_ID =", value, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdNotEqualTo(Long value) {
            addCriterion("FROM_ORD_ID <>", value, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdGreaterThan(Long value) {
            addCriterion("FROM_ORD_ID >", value, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FROM_ORD_ID >=", value, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdLessThan(Long value) {
            addCriterion("FROM_ORD_ID <", value, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdLessThanOrEqualTo(Long value) {
            addCriterion("FROM_ORD_ID <=", value, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdIn(List<Long> values) {
            addCriterion("FROM_ORD_ID in", values, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdNotIn(List<Long> values) {
            addCriterion("FROM_ORD_ID not in", values, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdBetween(Long value1, Long value2) {
            addCriterion("FROM_ORD_ID between", value1, value2, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdIdNotBetween(Long value1, Long value2) {
            addCriterion("FROM_ORD_ID not between", value1, value2, "fromOrdId");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameIsNull() {
            addCriterion("FROM_ORD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameIsNotNull() {
            addCriterion("FROM_ORD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameEqualTo(String value) {
            addCriterion("FROM_ORD_NAME =", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameNotEqualTo(String value) {
            addCriterion("FROM_ORD_NAME <>", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameGreaterThan(String value) {
            addCriterion("FROM_ORD_NAME >", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_ORD_NAME >=", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameLessThan(String value) {
            addCriterion("FROM_ORD_NAME <", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameLessThanOrEqualTo(String value) {
            addCriterion("FROM_ORD_NAME <=", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameLike(String value) {
            addCriterion("FROM_ORD_NAME like", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameNotLike(String value) {
            addCriterion("FROM_ORD_NAME not like", value, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameIn(List<String> values) {
            addCriterion("FROM_ORD_NAME in", values, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameNotIn(List<String> values) {
            addCriterion("FROM_ORD_NAME not in", values, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameBetween(String value1, String value2) {
            addCriterion("FROM_ORD_NAME between", value1, value2, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andFromOrdNameNotBetween(String value1, String value2) {
            addCriterion("FROM_ORD_NAME not between", value1, value2, "fromOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdIdIsNull() {
            addCriterion("TO_ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andToOrdIdIsNotNull() {
            addCriterion("TO_ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToOrdIdEqualTo(Long value) {
            addCriterion("TO_ORD_ID =", value, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdNotEqualTo(Long value) {
            addCriterion("TO_ORD_ID <>", value, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdGreaterThan(Long value) {
            addCriterion("TO_ORD_ID >", value, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TO_ORD_ID >=", value, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdLessThan(Long value) {
            addCriterion("TO_ORD_ID <", value, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdLessThanOrEqualTo(Long value) {
            addCriterion("TO_ORD_ID <=", value, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdIn(List<Long> values) {
            addCriterion("TO_ORD_ID in", values, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdNotIn(List<Long> values) {
            addCriterion("TO_ORD_ID not in", values, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdBetween(Long value1, Long value2) {
            addCriterion("TO_ORD_ID between", value1, value2, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdIdNotBetween(Long value1, Long value2) {
            addCriterion("TO_ORD_ID not between", value1, value2, "toOrdId");
            return (Criteria) this;
        }

        public Criteria andToOrdNameIsNull() {
            addCriterion("TO_ORD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andToOrdNameIsNotNull() {
            addCriterion("TO_ORD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andToOrdNameEqualTo(String value) {
            addCriterion("TO_ORD_NAME =", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameNotEqualTo(String value) {
            addCriterion("TO_ORD_NAME <>", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameGreaterThan(String value) {
            addCriterion("TO_ORD_NAME >", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameGreaterThanOrEqualTo(String value) {
            addCriterion("TO_ORD_NAME >=", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameLessThan(String value) {
            addCriterion("TO_ORD_NAME <", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameLessThanOrEqualTo(String value) {
            addCriterion("TO_ORD_NAME <=", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameLike(String value) {
            addCriterion("TO_ORD_NAME like", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameNotLike(String value) {
            addCriterion("TO_ORD_NAME not like", value, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameIn(List<String> values) {
            addCriterion("TO_ORD_NAME in", values, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameNotIn(List<String> values) {
            addCriterion("TO_ORD_NAME not in", values, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameBetween(String value1, String value2) {
            addCriterion("TO_ORD_NAME between", value1, value2, "toOrdName");
            return (Criteria) this;
        }

        public Criteria andToOrdNameNotBetween(String value1, String value2) {
            addCriterion("TO_ORD_NAME not between", value1, value2, "toOrdName");
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