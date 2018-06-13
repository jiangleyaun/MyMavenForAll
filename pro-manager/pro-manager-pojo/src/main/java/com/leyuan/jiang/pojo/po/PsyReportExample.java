package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PsyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PsyReportExample() {
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

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCounselorIsNull() {
            addCriterion("COUNSELOR is null");
            return (Criteria) this;
        }

        public Criteria andCounselorIsNotNull() {
            addCriterion("COUNSELOR is not null");
            return (Criteria) this;
        }

        public Criteria andCounselorEqualTo(String value) {
            addCriterion("COUNSELOR =", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorNotEqualTo(String value) {
            addCriterion("COUNSELOR <>", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorGreaterThan(String value) {
            addCriterion("COUNSELOR >", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorGreaterThanOrEqualTo(String value) {
            addCriterion("COUNSELOR >=", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorLessThan(String value) {
            addCriterion("COUNSELOR <", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorLessThanOrEqualTo(String value) {
            addCriterion("COUNSELOR <=", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorLike(String value) {
            addCriterion("COUNSELOR like", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorNotLike(String value) {
            addCriterion("COUNSELOR not like", value, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorIn(List<String> values) {
            addCriterion("COUNSELOR in", values, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorNotIn(List<String> values) {
            addCriterion("COUNSELOR not in", values, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorBetween(String value1, String value2) {
            addCriterion("COUNSELOR between", value1, value2, "counselor");
            return (Criteria) this;
        }

        public Criteria andCounselorNotBetween(String value1, String value2) {
            addCriterion("COUNSELOR not between", value1, value2, "counselor");
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

        public Criteria andMeetingHourIsNull() {
            addCriterion("MEETING_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andMeetingHourIsNotNull() {
            addCriterion("MEETING_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingHourEqualTo(Integer value) {
            addCriterion("MEETING_HOUR =", value, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourNotEqualTo(Integer value) {
            addCriterion("MEETING_HOUR <>", value, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourGreaterThan(Integer value) {
            addCriterion("MEETING_HOUR >", value, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEETING_HOUR >=", value, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourLessThan(Integer value) {
            addCriterion("MEETING_HOUR <", value, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourLessThanOrEqualTo(Integer value) {
            addCriterion("MEETING_HOUR <=", value, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourIn(List<Integer> values) {
            addCriterion("MEETING_HOUR in", values, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourNotIn(List<Integer> values) {
            addCriterion("MEETING_HOUR not in", values, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourBetween(Integer value1, Integer value2) {
            addCriterion("MEETING_HOUR between", value1, value2, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingHourNotBetween(Integer value1, Integer value2) {
            addCriterion("MEETING_HOUR not between", value1, value2, "meetingHour");
            return (Criteria) this;
        }

        public Criteria andMeetingMinIsNull() {
            addCriterion("MEETING_MIN is null");
            return (Criteria) this;
        }

        public Criteria andMeetingMinIsNotNull() {
            addCriterion("MEETING_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingMinEqualTo(Integer value) {
            addCriterion("MEETING_MIN =", value, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinNotEqualTo(Integer value) {
            addCriterion("MEETING_MIN <>", value, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinGreaterThan(Integer value) {
            addCriterion("MEETING_MIN >", value, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEETING_MIN >=", value, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinLessThan(Integer value) {
            addCriterion("MEETING_MIN <", value, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinLessThanOrEqualTo(Integer value) {
            addCriterion("MEETING_MIN <=", value, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinIn(List<Integer> values) {
            addCriterion("MEETING_MIN in", values, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinNotIn(List<Integer> values) {
            addCriterion("MEETING_MIN not in", values, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinBetween(Integer value1, Integer value2) {
            addCriterion("MEETING_MIN between", value1, value2, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andMeetingMinNotBetween(Integer value1, Integer value2) {
            addCriterion("MEETING_MIN not between", value1, value2, "meetingMin");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdIsNull() {
            addCriterion("SEE_MEETING_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdIsNotNull() {
            addCriterion("SEE_MEETING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdEqualTo(String value) {
            addCriterion("SEE_MEETING_ID =", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdNotEqualTo(String value) {
            addCriterion("SEE_MEETING_ID <>", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdGreaterThan(String value) {
            addCriterion("SEE_MEETING_ID >", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEE_MEETING_ID >=", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdLessThan(String value) {
            addCriterion("SEE_MEETING_ID <", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdLessThanOrEqualTo(String value) {
            addCriterion("SEE_MEETING_ID <=", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdLike(String value) {
            addCriterion("SEE_MEETING_ID like", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdNotLike(String value) {
            addCriterion("SEE_MEETING_ID not like", value, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdIn(List<String> values) {
            addCriterion("SEE_MEETING_ID in", values, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdNotIn(List<String> values) {
            addCriterion("SEE_MEETING_ID not in", values, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdBetween(String value1, String value2) {
            addCriterion("SEE_MEETING_ID between", value1, value2, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andSeeMeetingIdNotBetween(String value1, String value2) {
            addCriterion("SEE_MEETING_ID not between", value1, value2, "seeMeetingId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("TIME not between", value1, value2, "time");
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