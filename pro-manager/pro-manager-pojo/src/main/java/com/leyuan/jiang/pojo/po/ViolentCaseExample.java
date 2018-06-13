package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViolentCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolentCaseExample() {
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

        public Criteria andAlarmNumberIsNull() {
            addCriterion("ALARM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberIsNotNull() {
            addCriterion("ALARM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberEqualTo(Integer value) {
            addCriterion("ALARM_NUMBER =", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotEqualTo(Integer value) {
            addCriterion("ALARM_NUMBER <>", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberGreaterThan(Integer value) {
            addCriterion("ALARM_NUMBER >", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALARM_NUMBER >=", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberLessThan(Integer value) {
            addCriterion("ALARM_NUMBER <", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ALARM_NUMBER <=", value, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberIn(List<Integer> values) {
            addCriterion("ALARM_NUMBER in", values, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotIn(List<Integer> values) {
            addCriterion("ALARM_NUMBER not in", values, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberBetween(Integer value1, Integer value2) {
            addCriterion("ALARM_NUMBER between", value1, value2, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ALARM_NUMBER not between", value1, value2, "alarmNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("ALARM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("ALARM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("ALARM_TIME =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("ALARM_TIME <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("ALARM_TIME >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ALARM_TIME >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("ALARM_TIME <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("ALARM_TIME <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("ALARM_TIME in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("ALARM_TIME not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("ALARM_TIME between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("ALARM_TIME not between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andApplyExpectIsNull() {
            addCriterion("APPLY_EXPECT is null");
            return (Criteria) this;
        }

        public Criteria andApplyExpectIsNotNull() {
            addCriterion("APPLY_EXPECT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyExpectEqualTo(String value) {
            addCriterion("APPLY_EXPECT =", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectNotEqualTo(String value) {
            addCriterion("APPLY_EXPECT <>", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectGreaterThan(String value) {
            addCriterion("APPLY_EXPECT >", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_EXPECT >=", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectLessThan(String value) {
            addCriterion("APPLY_EXPECT <", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectLessThanOrEqualTo(String value) {
            addCriterion("APPLY_EXPECT <=", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectLike(String value) {
            addCriterion("APPLY_EXPECT like", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectNotLike(String value) {
            addCriterion("APPLY_EXPECT not like", value, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectIn(List<String> values) {
            addCriterion("APPLY_EXPECT in", values, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectNotIn(List<String> values) {
            addCriterion("APPLY_EXPECT not in", values, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectBetween(String value1, String value2) {
            addCriterion("APPLY_EXPECT between", value1, value2, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyExpectNotBetween(String value1, String value2) {
            addCriterion("APPLY_EXPECT not between", value1, value2, "applyExpect");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("APPLY_TYPE =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("APPLY_TYPE <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("APPLY_TYPE >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("APPLY_TYPE <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("APPLY_TYPE like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("APPLY_TYPE not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("APPLY_TYPE in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("APPLY_TYPE not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE not between", value1, value2, "applyType");
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

        public Criteria andDesiredPurposeIsNull() {
            addCriterion("DESIRED_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeIsNotNull() {
            addCriterion("DESIRED_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeEqualTo(String value) {
            addCriterion("DESIRED_PURPOSE =", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeNotEqualTo(String value) {
            addCriterion("DESIRED_PURPOSE <>", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeGreaterThan(String value) {
            addCriterion("DESIRED_PURPOSE >", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("DESIRED_PURPOSE >=", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeLessThan(String value) {
            addCriterion("DESIRED_PURPOSE <", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeLessThanOrEqualTo(String value) {
            addCriterion("DESIRED_PURPOSE <=", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeLike(String value) {
            addCriterion("DESIRED_PURPOSE like", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeNotLike(String value) {
            addCriterion("DESIRED_PURPOSE not like", value, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeIn(List<String> values) {
            addCriterion("DESIRED_PURPOSE in", values, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeNotIn(List<String> values) {
            addCriterion("DESIRED_PURPOSE not in", values, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeBetween(String value1, String value2) {
            addCriterion("DESIRED_PURPOSE between", value1, value2, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andDesiredPurposeNotBetween(String value1, String value2) {
            addCriterion("DESIRED_PURPOSE not between", value1, value2, "desiredPurpose");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeIsNull() {
            addCriterion("FIRST_VIOLENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeIsNotNull() {
            addCriterion("FIRST_VIOLENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeEqualTo(Date value) {
            addCriterion("FIRST_VIOLENT_TIME =", value, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeNotEqualTo(Date value) {
            addCriterion("FIRST_VIOLENT_TIME <>", value, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeGreaterThan(Date value) {
            addCriterion("FIRST_VIOLENT_TIME >", value, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_VIOLENT_TIME >=", value, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeLessThan(Date value) {
            addCriterion("FIRST_VIOLENT_TIME <", value, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_VIOLENT_TIME <=", value, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeIn(List<Date> values) {
            addCriterion("FIRST_VIOLENT_TIME in", values, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeNotIn(List<Date> values) {
            addCriterion("FIRST_VIOLENT_TIME not in", values, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeBetween(Date value1, Date value2) {
            addCriterion("FIRST_VIOLENT_TIME between", value1, value2, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andFirstViolentTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_VIOLENT_TIME not between", value1, value2, "firstViolentTime");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceIsNull() {
            addCriterion("INJURY_IDENTIFY_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceIsNotNull() {
            addCriterion("INJURY_IDENTIFY_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceEqualTo(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE =", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceNotEqualTo(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE <>", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceGreaterThan(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE >", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE >=", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceLessThan(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE <", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceLessThanOrEqualTo(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE <=", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceLike(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE like", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceNotLike(String value) {
            addCriterion("INJURY_IDENTIFY_PLACE not like", value, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceIn(List<String> values) {
            addCriterion("INJURY_IDENTIFY_PLACE in", values, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceNotIn(List<String> values) {
            addCriterion("INJURY_IDENTIFY_PLACE not in", values, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceBetween(String value1, String value2) {
            addCriterion("INJURY_IDENTIFY_PLACE between", value1, value2, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andInjuryIdentifyPlaceNotBetween(String value1, String value2) {
            addCriterion("INJURY_IDENTIFY_PLACE not between", value1, value2, "injuryIdentifyPlace");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedIsNull() {
            addCriterion("IS_ALARMED is null");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedIsNotNull() {
            addCriterion("IS_ALARMED is not null");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedEqualTo(Boolean value) {
            addCriterion("IS_ALARMED =", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedNotEqualTo(Boolean value) {
            addCriterion("IS_ALARMED <>", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedGreaterThan(Boolean value) {
            addCriterion("IS_ALARMED >", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_ALARMED >=", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedLessThan(Boolean value) {
            addCriterion("IS_ALARMED <", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_ALARMED <=", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedIn(List<Boolean> values) {
            addCriterion("IS_ALARMED in", values, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedNotIn(List<Boolean> values) {
            addCriterion("IS_ALARMED not in", values, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ALARMED between", value1, value2, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ALARMED not between", value1, value2, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNull() {
            addCriterion("IS_DISABLED is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("IS_DISABLED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Boolean value) {
            addCriterion("IS_DISABLED =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Boolean value) {
            addCriterion("IS_DISABLED <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Boolean value) {
            addCriterion("IS_DISABLED >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DISABLED >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Boolean value) {
            addCriterion("IS_DISABLED <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DISABLED <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Boolean> values) {
            addCriterion("IS_DISABLED in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Boolean> values) {
            addCriterion("IS_DISABLED not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DISABLED between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DISABLED not between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsHurtIsNull() {
            addCriterion("IS_HURT is null");
            return (Criteria) this;
        }

        public Criteria andIsHurtIsNotNull() {
            addCriterion("IS_HURT is not null");
            return (Criteria) this;
        }

        public Criteria andIsHurtEqualTo(Boolean value) {
            addCriterion("IS_HURT =", value, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtNotEqualTo(Boolean value) {
            addCriterion("IS_HURT <>", value, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtGreaterThan(Boolean value) {
            addCriterion("IS_HURT >", value, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_HURT >=", value, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtLessThan(Boolean value) {
            addCriterion("IS_HURT <", value, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_HURT <=", value, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtIn(List<Boolean> values) {
            addCriterion("IS_HURT in", values, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtNotIn(List<Boolean> values) {
            addCriterion("IS_HURT not in", values, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_HURT between", value1, value2, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsHurtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_HURT not between", value1, value2, "isHurt");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyIsNull() {
            addCriterion("IS_PREGNANCY is null");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyIsNotNull() {
            addCriterion("IS_PREGNANCY is not null");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyEqualTo(Boolean value) {
            addCriterion("IS_PREGNANCY =", value, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyNotEqualTo(Boolean value) {
            addCriterion("IS_PREGNANCY <>", value, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyGreaterThan(Boolean value) {
            addCriterion("IS_PREGNANCY >", value, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_PREGNANCY >=", value, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyLessThan(Boolean value) {
            addCriterion("IS_PREGNANCY <", value, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_PREGNANCY <=", value, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyIn(List<Boolean> values) {
            addCriterion("IS_PREGNANCY in", values, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyNotIn(List<Boolean> values) {
            addCriterion("IS_PREGNANCY not in", values, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_PREGNANCY between", value1, value2, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsPregnancyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_PREGNANCY not between", value1, value2, "isPregnancy");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtIsNull() {
            addCriterion("IS_TEST_HURT is null");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtIsNotNull() {
            addCriterion("IS_TEST_HURT is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtEqualTo(Boolean value) {
            addCriterion("IS_TEST_HURT =", value, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtNotEqualTo(Boolean value) {
            addCriterion("IS_TEST_HURT <>", value, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtGreaterThan(Boolean value) {
            addCriterion("IS_TEST_HURT >", value, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_TEST_HURT >=", value, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtLessThan(Boolean value) {
            addCriterion("IS_TEST_HURT <", value, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_TEST_HURT <=", value, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtIn(List<Boolean> values) {
            addCriterion("IS_TEST_HURT in", values, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtNotIn(List<Boolean> values) {
            addCriterion("IS_TEST_HURT not in", values, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_TEST_HURT between", value1, value2, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsTestHurtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_TEST_HURT not between", value1, value2, "isTestHurt");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNull() {
            addCriterion("IS_URGENT is null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNotNull() {
            addCriterion("IS_URGENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentEqualTo(Boolean value) {
            addCriterion("IS_URGENT =", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotEqualTo(Boolean value) {
            addCriterion("IS_URGENT <>", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThan(Boolean value) {
            addCriterion("IS_URGENT >", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_URGENT >=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThan(Boolean value) {
            addCriterion("IS_URGENT <", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_URGENT <=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIn(List<Boolean> values) {
            addCriterion("IS_URGENT in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotIn(List<Boolean> values) {
            addCriterion("IS_URGENT not in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_URGENT between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_URGENT not between", value1, value2, "isUrgent");
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
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

        public Criteria andVictimMentalStatusIsNull() {
            addCriterion("VICTIM_MENTAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusIsNotNull() {
            addCriterion("VICTIM_MENTAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusEqualTo(String value) {
            addCriterion("VICTIM_MENTAL_STATUS =", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusNotEqualTo(String value) {
            addCriterion("VICTIM_MENTAL_STATUS <>", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusGreaterThan(String value) {
            addCriterion("VICTIM_MENTAL_STATUS >", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VICTIM_MENTAL_STATUS >=", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusLessThan(String value) {
            addCriterion("VICTIM_MENTAL_STATUS <", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusLessThanOrEqualTo(String value) {
            addCriterion("VICTIM_MENTAL_STATUS <=", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusLike(String value) {
            addCriterion("VICTIM_MENTAL_STATUS like", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusNotLike(String value) {
            addCriterion("VICTIM_MENTAL_STATUS not like", value, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusIn(List<String> values) {
            addCriterion("VICTIM_MENTAL_STATUS in", values, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusNotIn(List<String> values) {
            addCriterion("VICTIM_MENTAL_STATUS not in", values, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusBetween(String value1, String value2) {
            addCriterion("VICTIM_MENTAL_STATUS between", value1, value2, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andVictimMentalStatusNotBetween(String value1, String value2) {
            addCriterion("VICTIM_MENTAL_STATUS not between", value1, value2, "victimMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeIsNull() {
            addCriterion("VIOLENT_ATTITUDE is null");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeIsNotNull() {
            addCriterion("VIOLENT_ATTITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeEqualTo(String value) {
            addCriterion("VIOLENT_ATTITUDE =", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeNotEqualTo(String value) {
            addCriterion("VIOLENT_ATTITUDE <>", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeGreaterThan(String value) {
            addCriterion("VIOLENT_ATTITUDE >", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeGreaterThanOrEqualTo(String value) {
            addCriterion("VIOLENT_ATTITUDE >=", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeLessThan(String value) {
            addCriterion("VIOLENT_ATTITUDE <", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeLessThanOrEqualTo(String value) {
            addCriterion("VIOLENT_ATTITUDE <=", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeLike(String value) {
            addCriterion("VIOLENT_ATTITUDE like", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeNotLike(String value) {
            addCriterion("VIOLENT_ATTITUDE not like", value, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeIn(List<String> values) {
            addCriterion("VIOLENT_ATTITUDE in", values, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeNotIn(List<String> values) {
            addCriterion("VIOLENT_ATTITUDE not in", values, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeBetween(String value1, String value2) {
            addCriterion("VIOLENT_ATTITUDE between", value1, value2, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentAttitudeNotBetween(String value1, String value2) {
            addCriterion("VIOLENT_ATTITUDE not between", value1, value2, "violentAttitude");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusIsNull() {
            addCriterion("VIOLENT_MENTAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusIsNotNull() {
            addCriterion("VIOLENT_MENTAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusEqualTo(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS =", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusNotEqualTo(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS <>", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusGreaterThan(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS >", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS >=", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusLessThan(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS <", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusLessThanOrEqualTo(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS <=", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusLike(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS like", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusNotLike(String value) {
            addCriterion("VIOLENT_MENTAL_STATUS not like", value, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusIn(List<String> values) {
            addCriterion("VIOLENT_MENTAL_STATUS in", values, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusNotIn(List<String> values) {
            addCriterion("VIOLENT_MENTAL_STATUS not in", values, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusBetween(String value1, String value2) {
            addCriterion("VIOLENT_MENTAL_STATUS between", value1, value2, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentMentalStatusNotBetween(String value1, String value2) {
            addCriterion("VIOLENT_MENTAL_STATUS not between", value1, value2, "violentMentalStatus");
            return (Criteria) this;
        }

        public Criteria andViolentNumberIsNull() {
            addCriterion("VIOLENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andViolentNumberIsNotNull() {
            addCriterion("VIOLENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andViolentNumberEqualTo(Integer value) {
            addCriterion("VIOLENT_NUMBER =", value, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberNotEqualTo(Integer value) {
            addCriterion("VIOLENT_NUMBER <>", value, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberGreaterThan(Integer value) {
            addCriterion("VIOLENT_NUMBER >", value, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIOLENT_NUMBER >=", value, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberLessThan(Integer value) {
            addCriterion("VIOLENT_NUMBER <", value, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("VIOLENT_NUMBER <=", value, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberIn(List<Integer> values) {
            addCriterion("VIOLENT_NUMBER in", values, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberNotIn(List<Integer> values) {
            addCriterion("VIOLENT_NUMBER not in", values, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberBetween(Integer value1, Integer value2) {
            addCriterion("VIOLENT_NUMBER between", value1, value2, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("VIOLENT_NUMBER not between", value1, value2, "violentNumber");
            return (Criteria) this;
        }

        public Criteria andViolentTimeIsNull() {
            addCriterion("VIOLENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andViolentTimeIsNotNull() {
            addCriterion("VIOLENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andViolentTimeEqualTo(String value) {
            addCriterion("VIOLENT_TIME =", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeNotEqualTo(String value) {
            addCriterion("VIOLENT_TIME <>", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeGreaterThan(String value) {
            addCriterion("VIOLENT_TIME >", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VIOLENT_TIME >=", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeLessThan(String value) {
            addCriterion("VIOLENT_TIME <", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeLessThanOrEqualTo(String value) {
            addCriterion("VIOLENT_TIME <=", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeLike(String value) {
            addCriterion("VIOLENT_TIME like", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeNotLike(String value) {
            addCriterion("VIOLENT_TIME not like", value, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeIn(List<String> values) {
            addCriterion("VIOLENT_TIME in", values, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeNotIn(List<String> values) {
            addCriterion("VIOLENT_TIME not in", values, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeBetween(String value1, String value2) {
            addCriterion("VIOLENT_TIME between", value1, value2, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTimeNotBetween(String value1, String value2) {
            addCriterion("VIOLENT_TIME not between", value1, value2, "violentTime");
            return (Criteria) this;
        }

        public Criteria andViolentTypeIsNull() {
            addCriterion("VIOLENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andViolentTypeIsNotNull() {
            addCriterion("VIOLENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andViolentTypeEqualTo(String value) {
            addCriterion("VIOLENT_TYPE =", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeNotEqualTo(String value) {
            addCriterion("VIOLENT_TYPE <>", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeGreaterThan(String value) {
            addCriterion("VIOLENT_TYPE >", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VIOLENT_TYPE >=", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeLessThan(String value) {
            addCriterion("VIOLENT_TYPE <", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeLessThanOrEqualTo(String value) {
            addCriterion("VIOLENT_TYPE <=", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeLike(String value) {
            addCriterion("VIOLENT_TYPE like", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeNotLike(String value) {
            addCriterion("VIOLENT_TYPE not like", value, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeIn(List<String> values) {
            addCriterion("VIOLENT_TYPE in", values, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeNotIn(List<String> values) {
            addCriterion("VIOLENT_TYPE not in", values, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeBetween(String value1, String value2) {
            addCriterion("VIOLENT_TYPE between", value1, value2, "violentType");
            return (Criteria) this;
        }

        public Criteria andViolentTypeNotBetween(String value1, String value2) {
            addCriterion("VIOLENT_TYPE not between", value1, value2, "violentType");
            return (Criteria) this;
        }

        public Criteria andAreasIsNull() {
            addCriterion("AREAS is null");
            return (Criteria) this;
        }

        public Criteria andAreasIsNotNull() {
            addCriterion("AREAS is not null");
            return (Criteria) this;
        }

        public Criteria andAreasEqualTo(String value) {
            addCriterion("AREAS =", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotEqualTo(String value) {
            addCriterion("AREAS <>", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThan(String value) {
            addCriterion("AREAS >", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS >=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThan(String value) {
            addCriterion("AREAS <", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThanOrEqualTo(String value) {
            addCriterion("AREAS <=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLike(String value) {
            addCriterion("AREAS like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotLike(String value) {
            addCriterion("AREAS not like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasIn(List<String> values) {
            addCriterion("AREAS in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotIn(List<String> values) {
            addCriterion("AREAS not in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasBetween(String value1, String value2) {
            addCriterion("AREAS between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotBetween(String value1, String value2) {
            addCriterion("AREAS not between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andViolentDateIsNull() {
            addCriterion("VIOLENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andViolentDateIsNotNull() {
            addCriterion("VIOLENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andViolentDateEqualTo(String value) {
            addCriterion("VIOLENT_DATE =", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateNotEqualTo(String value) {
            addCriterion("VIOLENT_DATE <>", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateGreaterThan(String value) {
            addCriterion("VIOLENT_DATE >", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateGreaterThanOrEqualTo(String value) {
            addCriterion("VIOLENT_DATE >=", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateLessThan(String value) {
            addCriterion("VIOLENT_DATE <", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateLessThanOrEqualTo(String value) {
            addCriterion("VIOLENT_DATE <=", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateLike(String value) {
            addCriterion("VIOLENT_DATE like", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateNotLike(String value) {
            addCriterion("VIOLENT_DATE not like", value, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateIn(List<String> values) {
            addCriterion("VIOLENT_DATE in", values, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateNotIn(List<String> values) {
            addCriterion("VIOLENT_DATE not in", values, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateBetween(String value1, String value2) {
            addCriterion("VIOLENT_DATE between", value1, value2, "violentDate");
            return (Criteria) this;
        }

        public Criteria andViolentDateNotBetween(String value1, String value2) {
            addCriterion("VIOLENT_DATE not between", value1, value2, "violentDate");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansIsNull() {
            addCriterion("VOILENT_MEANS is null");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansIsNotNull() {
            addCriterion("VOILENT_MEANS is not null");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansEqualTo(String value) {
            addCriterion("VOILENT_MEANS =", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansNotEqualTo(String value) {
            addCriterion("VOILENT_MEANS <>", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansGreaterThan(String value) {
            addCriterion("VOILENT_MEANS >", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansGreaterThanOrEqualTo(String value) {
            addCriterion("VOILENT_MEANS >=", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansLessThan(String value) {
            addCriterion("VOILENT_MEANS <", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansLessThanOrEqualTo(String value) {
            addCriterion("VOILENT_MEANS <=", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansLike(String value) {
            addCriterion("VOILENT_MEANS like", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansNotLike(String value) {
            addCriterion("VOILENT_MEANS not like", value, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansIn(List<String> values) {
            addCriterion("VOILENT_MEANS in", values, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansNotIn(List<String> values) {
            addCriterion("VOILENT_MEANS not in", values, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansBetween(String value1, String value2) {
            addCriterion("VOILENT_MEANS between", value1, value2, "voilentMeans");
            return (Criteria) this;
        }

        public Criteria andVoilentMeansNotBetween(String value1, String value2) {
            addCriterion("VOILENT_MEANS not between", value1, value2, "voilentMeans");
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