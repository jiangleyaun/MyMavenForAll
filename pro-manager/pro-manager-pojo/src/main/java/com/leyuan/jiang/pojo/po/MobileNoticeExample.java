package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MobileNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobileNoticeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
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

        public Criteria andUserDetailIdEqualTo(Integer value) {
            addCriterion("USER_DETAIL_ID =", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdNotEqualTo(Integer value) {
            addCriterion("USER_DETAIL_ID <>", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdGreaterThan(Integer value) {
            addCriterion("USER_DETAIL_ID >", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_DETAIL_ID >=", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdLessThan(Integer value) {
            addCriterion("USER_DETAIL_ID <", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_DETAIL_ID <=", value, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdIn(List<Integer> values) {
            addCriterion("USER_DETAIL_ID in", values, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdNotIn(List<Integer> values) {
            addCriterion("USER_DETAIL_ID not in", values, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_DETAIL_ID between", value1, value2, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andUserDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_DETAIL_ID not between", value1, value2, "userDetailId");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIsNull() {
            addCriterion("IS_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIsNotNull() {
            addCriterion("IS_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessEqualTo(String value) {
            addCriterion("IS_SUCCESS =", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotEqualTo(String value) {
            addCriterion("IS_SUCCESS <>", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessGreaterThan(String value) {
            addCriterion("IS_SUCCESS >", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SUCCESS >=", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLessThan(String value) {
            addCriterion("IS_SUCCESS <", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLessThanOrEqualTo(String value) {
            addCriterion("IS_SUCCESS <=", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLike(String value) {
            addCriterion("IS_SUCCESS like", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotLike(String value) {
            addCriterion("IS_SUCCESS not like", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIn(List<String> values) {
            addCriterion("IS_SUCCESS in", values, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotIn(List<String> values) {
            addCriterion("IS_SUCCESS not in", values, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessBetween(String value1, String value2) {
            addCriterion("IS_SUCCESS between", value1, value2, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotBetween(String value1, String value2) {
            addCriterion("IS_SUCCESS not between", value1, value2, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andExtraParamIsNull() {
            addCriterion("EXTRA_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andExtraParamIsNotNull() {
            addCriterion("EXTRA_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andExtraParamEqualTo(String value) {
            addCriterion("EXTRA_PARAM =", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamNotEqualTo(String value) {
            addCriterion("EXTRA_PARAM <>", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamGreaterThan(String value) {
            addCriterion("EXTRA_PARAM >", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamGreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA_PARAM >=", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamLessThan(String value) {
            addCriterion("EXTRA_PARAM <", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamLessThanOrEqualTo(String value) {
            addCriterion("EXTRA_PARAM <=", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamLike(String value) {
            addCriterion("EXTRA_PARAM like", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamNotLike(String value) {
            addCriterion("EXTRA_PARAM not like", value, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamIn(List<String> values) {
            addCriterion("EXTRA_PARAM in", values, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamNotIn(List<String> values) {
            addCriterion("EXTRA_PARAM not in", values, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamBetween(String value1, String value2) {
            addCriterion("EXTRA_PARAM between", value1, value2, "extraParam");
            return (Criteria) this;
        }

        public Criteria andExtraParamNotBetween(String value1, String value2) {
            addCriterion("EXTRA_PARAM not between", value1, value2, "extraParam");
            return (Criteria) this;
        }

        public Criteria andResultMessageIsNull() {
            addCriterion("RESULT_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andResultMessageIsNotNull() {
            addCriterion("RESULT_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andResultMessageEqualTo(String value) {
            addCriterion("RESULT_MESSAGE =", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageNotEqualTo(String value) {
            addCriterion("RESULT_MESSAGE <>", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageGreaterThan(String value) {
            addCriterion("RESULT_MESSAGE >", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_MESSAGE >=", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageLessThan(String value) {
            addCriterion("RESULT_MESSAGE <", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageLessThanOrEqualTo(String value) {
            addCriterion("RESULT_MESSAGE <=", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageLike(String value) {
            addCriterion("RESULT_MESSAGE like", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageNotLike(String value) {
            addCriterion("RESULT_MESSAGE not like", value, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageIn(List<String> values) {
            addCriterion("RESULT_MESSAGE in", values, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageNotIn(List<String> values) {
            addCriterion("RESULT_MESSAGE not in", values, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageBetween(String value1, String value2) {
            addCriterion("RESULT_MESSAGE between", value1, value2, "resultMessage");
            return (Criteria) this;
        }

        public Criteria andResultMessageNotBetween(String value1, String value2) {
            addCriterion("RESULT_MESSAGE not between", value1, value2, "resultMessage");
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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