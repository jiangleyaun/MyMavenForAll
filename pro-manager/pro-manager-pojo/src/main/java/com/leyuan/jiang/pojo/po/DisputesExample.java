package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisputesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisputesExample() {
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

        public Criteria andCaseNumberIsNull() {
            addCriterion("CASE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCaseNumberIsNotNull() {
            addCriterion("CASE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNumberEqualTo(String value) {
            addCriterion("CASE_NUMBER =", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberNotEqualTo(String value) {
            addCriterion("CASE_NUMBER <>", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberGreaterThan(String value) {
            addCriterion("CASE_NUMBER >", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NUMBER >=", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberLessThan(String value) {
            addCriterion("CASE_NUMBER <", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberLessThanOrEqualTo(String value) {
            addCriterion("CASE_NUMBER <=", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberLike(String value) {
            addCriterion("CASE_NUMBER like", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberNotLike(String value) {
            addCriterion("CASE_NUMBER not like", value, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberIn(List<String> values) {
            addCriterion("CASE_NUMBER in", values, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberNotIn(List<String> values) {
            addCriterion("CASE_NUMBER not in", values, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberBetween(String value1, String value2) {
            addCriterion("CASE_NUMBER between", value1, value2, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andCaseNumberNotBetween(String value1, String value2) {
            addCriterion("CASE_NUMBER not between", value1, value2, "caseNumber");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("DEL_FLAG like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("DEL_FLAG not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIsNull() {
            addCriterion("EVALUATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIsNotNull() {
            addCriterion("EVALUATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoEqualTo(String value) {
            addCriterion("EVALUATE_NO =", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotEqualTo(String value) {
            addCriterion("EVALUATE_NO <>", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoGreaterThan(String value) {
            addCriterion("EVALUATE_NO >", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATE_NO >=", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLessThan(String value) {
            addCriterion("EVALUATE_NO <", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLessThanOrEqualTo(String value) {
            addCriterion("EVALUATE_NO <=", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLike(String value) {
            addCriterion("EVALUATE_NO like", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotLike(String value) {
            addCriterion("EVALUATE_NO not like", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIn(List<String> values) {
            addCriterion("EVALUATE_NO in", values, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotIn(List<String> values) {
            addCriterion("EVALUATE_NO not in", values, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoBetween(String value1, String value2) {
            addCriterion("EVALUATE_NO between", value1, value2, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotBetween(String value1, String value2) {
            addCriterion("EVALUATE_NO not between", value1, value2, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeIsNull() {
            addCriterion("MEDIATOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeIsNotNull() {
            addCriterion("MEDIATOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeEqualTo(String value) {
            addCriterion("MEDIATOR_CODE =", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeNotEqualTo(String value) {
            addCriterion("MEDIATOR_CODE <>", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeGreaterThan(String value) {
            addCriterion("MEDIATOR_CODE >", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIATOR_CODE >=", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeLessThan(String value) {
            addCriterion("MEDIATOR_CODE <", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeLessThanOrEqualTo(String value) {
            addCriterion("MEDIATOR_CODE <=", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeLike(String value) {
            addCriterion("MEDIATOR_CODE like", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeNotLike(String value) {
            addCriterion("MEDIATOR_CODE not like", value, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeIn(List<String> values) {
            addCriterion("MEDIATOR_CODE in", values, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeNotIn(List<String> values) {
            addCriterion("MEDIATOR_CODE not in", values, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeBetween(String value1, String value2) {
            addCriterion("MEDIATOR_CODE between", value1, value2, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorCodeNotBetween(String value1, String value2) {
            addCriterion("MEDIATOR_CODE not between", value1, value2, "mediatorCode");
            return (Criteria) this;
        }

        public Criteria andMediatorIdIsNull() {
            addCriterion("MEDIATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMediatorIdIsNotNull() {
            addCriterion("MEDIATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMediatorIdEqualTo(Long value) {
            addCriterion("MEDIATOR_ID =", value, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdNotEqualTo(Long value) {
            addCriterion("MEDIATOR_ID <>", value, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdGreaterThan(Long value) {
            addCriterion("MEDIATOR_ID >", value, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MEDIATOR_ID >=", value, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdLessThan(Long value) {
            addCriterion("MEDIATOR_ID <", value, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdLessThanOrEqualTo(Long value) {
            addCriterion("MEDIATOR_ID <=", value, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdIn(List<Long> values) {
            addCriterion("MEDIATOR_ID in", values, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdNotIn(List<Long> values) {
            addCriterion("MEDIATOR_ID not in", values, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdBetween(Long value1, Long value2) {
            addCriterion("MEDIATOR_ID between", value1, value2, "mediatorId");
            return (Criteria) this;
        }

        public Criteria andMediatorIdNotBetween(Long value1, Long value2) {
            addCriterion("MEDIATOR_ID not between", value1, value2, "mediatorId");
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

        public Criteria andVisibleIsNull() {
            addCriterion("VISIBLE is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("VISIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(String value) {
            addCriterion("VISIBLE =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(String value) {
            addCriterion("VISIBLE <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(String value) {
            addCriterion("VISIBLE >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("VISIBLE >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(String value) {
            addCriterion("VISIBLE <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(String value) {
            addCriterion("VISIBLE <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLike(String value) {
            addCriterion("VISIBLE like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotLike(String value) {
            addCriterion("VISIBLE not like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<String> values) {
            addCriterion("VISIBLE in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<String> values) {
            addCriterion("VISIBLE not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(String value1, String value2) {
            addCriterion("VISIBLE between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(String value1, String value2) {
            addCriterion("VISIBLE not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNull() {
            addCriterion("EVALUATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("EVALUATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(Long value) {
            addCriterion("EVALUATE_ID =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(Long value) {
            addCriterion("EVALUATE_ID <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(Long value) {
            addCriterion("EVALUATE_ID >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EVALUATE_ID >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(Long value) {
            addCriterion("EVALUATE_ID <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(Long value) {
            addCriterion("EVALUATE_ID <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<Long> values) {
            addCriterion("EVALUATE_ID in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<Long> values) {
            addCriterion("EVALUATE_ID not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(Long value1, Long value2) {
            addCriterion("EVALUATE_ID between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(Long value1, Long value2) {
            addCriterion("EVALUATE_ID not between", value1, value2, "evaluateId");
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

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAppealIsNull() {
            addCriterion("APPEAL is null");
            return (Criteria) this;
        }

        public Criteria andAppealIsNotNull() {
            addCriterion("APPEAL is not null");
            return (Criteria) this;
        }

        public Criteria andAppealEqualTo(String value) {
            addCriterion("APPEAL =", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotEqualTo(String value) {
            addCriterion("APPEAL <>", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealGreaterThan(String value) {
            addCriterion("APPEAL >", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealGreaterThanOrEqualTo(String value) {
            addCriterion("APPEAL >=", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealLessThan(String value) {
            addCriterion("APPEAL <", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealLessThanOrEqualTo(String value) {
            addCriterion("APPEAL <=", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealLike(String value) {
            addCriterion("APPEAL like", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotLike(String value) {
            addCriterion("APPEAL not like", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealIn(List<String> values) {
            addCriterion("APPEAL in", values, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotIn(List<String> values) {
            addCriterion("APPEAL not in", values, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealBetween(String value1, String value2) {
            addCriterion("APPEAL between", value1, value2, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotBetween(String value1, String value2) {
            addCriterion("APPEAL not between", value1, value2, "appeal");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
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