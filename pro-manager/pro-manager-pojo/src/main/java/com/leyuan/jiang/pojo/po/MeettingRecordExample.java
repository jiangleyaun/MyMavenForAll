package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeettingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeettingRecordExample() {
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

        public Criteria andImportantPartsIsNull() {
            addCriterion("IMPORTANT_PARTS is null");
            return (Criteria) this;
        }

        public Criteria andImportantPartsIsNotNull() {
            addCriterion("IMPORTANT_PARTS is not null");
            return (Criteria) this;
        }

        public Criteria andImportantPartsEqualTo(String value) {
            addCriterion("IMPORTANT_PARTS =", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsNotEqualTo(String value) {
            addCriterion("IMPORTANT_PARTS <>", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsGreaterThan(String value) {
            addCriterion("IMPORTANT_PARTS >", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_PARTS >=", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsLessThan(String value) {
            addCriterion("IMPORTANT_PARTS <", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_PARTS <=", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsLike(String value) {
            addCriterion("IMPORTANT_PARTS like", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsNotLike(String value) {
            addCriterion("IMPORTANT_PARTS not like", value, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsIn(List<String> values) {
            addCriterion("IMPORTANT_PARTS in", values, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsNotIn(List<String> values) {
            addCriterion("IMPORTANT_PARTS not in", values, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsBetween(String value1, String value2) {
            addCriterion("IMPORTANT_PARTS between", value1, value2, "importantParts");
            return (Criteria) this;
        }

        public Criteria andImportantPartsNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_PARTS not between", value1, value2, "importantParts");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorIsNull() {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR is null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorIsNotNull() {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR is not null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR =", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorNotEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR <>", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorGreaterThan(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR >", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorGreaterThanOrEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR >=", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorLessThan(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR <", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorLessThanOrEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR <=", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorLike(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR like", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorNotLike(String value) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR not like", value, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorIn(List<String> values) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR in", values, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorNotIn(List<String> values) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR not in", values, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorBetween(String value1, String value2) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR between", value1, value2, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalBehaviorNotBetween(String value1, String value2) {
            addCriterion("PSYCHOLOGICAL_BEHAVIOR not between", value1, value2, "psychologicalBehavior");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantIsNull() {
            addCriterion("PSYCHOLOGICAL_CONSULTANT is null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantIsNotNull() {
            addCriterion("PSYCHOLOGICAL_CONSULTANT is not null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT =", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantNotEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT <>", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantGreaterThan(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT >", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantGreaterThanOrEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT >=", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantLessThan(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT <", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantLessThanOrEqualTo(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT <=", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantLike(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT like", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantNotLike(String value) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT not like", value, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantIn(List<String> values) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT in", values, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantNotIn(List<String> values) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT not in", values, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantBetween(String value1, String value2) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT between", value1, value2, "psychologicalConsultant");
            return (Criteria) this;
        }

        public Criteria andPsychologicalConsultantNotBetween(String value1, String value2) {
            addCriterion("PSYCHOLOGICAL_CONSULTANT not between", value1, value2, "psychologicalConsultant");
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