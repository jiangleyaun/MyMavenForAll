package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViolentVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolentVideoExample() {
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

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStreamIdIsNull() {
            addCriterion("STREAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andStreamIdIsNotNull() {
            addCriterion("STREAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStreamIdEqualTo(String value) {
            addCriterion("STREAM_ID =", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdNotEqualTo(String value) {
            addCriterion("STREAM_ID <>", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdGreaterThan(String value) {
            addCriterion("STREAM_ID >", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdGreaterThanOrEqualTo(String value) {
            addCriterion("STREAM_ID >=", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdLessThan(String value) {
            addCriterion("STREAM_ID <", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdLessThanOrEqualTo(String value) {
            addCriterion("STREAM_ID <=", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdLike(String value) {
            addCriterion("STREAM_ID like", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdNotLike(String value) {
            addCriterion("STREAM_ID not like", value, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdIn(List<String> values) {
            addCriterion("STREAM_ID in", values, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdNotIn(List<String> values) {
            addCriterion("STREAM_ID not in", values, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdBetween(String value1, String value2) {
            addCriterion("STREAM_ID between", value1, value2, "streamId");
            return (Criteria) this;
        }

        public Criteria andStreamIdNotBetween(String value1, String value2) {
            addCriterion("STREAM_ID not between", value1, value2, "streamId");
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

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdIsNull() {
            addCriterion("VIOLENT_MEETTING_ID is null");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdIsNotNull() {
            addCriterion("VIOLENT_MEETTING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdEqualTo(Long value) {
            addCriterion("VIOLENT_MEETTING_ID =", value, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdNotEqualTo(Long value) {
            addCriterion("VIOLENT_MEETTING_ID <>", value, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdGreaterThan(Long value) {
            addCriterion("VIOLENT_MEETTING_ID >", value, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VIOLENT_MEETTING_ID >=", value, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdLessThan(Long value) {
            addCriterion("VIOLENT_MEETTING_ID <", value, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdLessThanOrEqualTo(Long value) {
            addCriterion("VIOLENT_MEETTING_ID <=", value, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdIn(List<Long> values) {
            addCriterion("VIOLENT_MEETTING_ID in", values, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdNotIn(List<Long> values) {
            addCriterion("VIOLENT_MEETTING_ID not in", values, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdBetween(Long value1, Long value2) {
            addCriterion("VIOLENT_MEETTING_ID between", value1, value2, "violentMeettingId");
            return (Criteria) this;
        }

        public Criteria andViolentMeettingIdNotBetween(Long value1, Long value2) {
            addCriterion("VIOLENT_MEETTING_ID not between", value1, value2, "violentMeettingId");
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

        public Criteria andApplyIsNull() {
            addCriterion("APPLY is null");
            return (Criteria) this;
        }

        public Criteria andApplyIsNotNull() {
            addCriterion("APPLY is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEqualTo(String value) {
            addCriterion("APPLY =", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotEqualTo(String value) {
            addCriterion("APPLY <>", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThan(String value) {
            addCriterion("APPLY >", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY >=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThan(String value) {
            addCriterion("APPLY <", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThanOrEqualTo(String value) {
            addCriterion("APPLY <=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLike(String value) {
            addCriterion("APPLY like", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotLike(String value) {
            addCriterion("APPLY not like", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyIn(List<String> values) {
            addCriterion("APPLY in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotIn(List<String> values) {
            addCriterion("APPLY not in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyBetween(String value1, String value2) {
            addCriterion("APPLY between", value1, value2, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotBetween(String value1, String value2) {
            addCriterion("APPLY not between", value1, value2, "apply");
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