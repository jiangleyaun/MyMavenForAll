package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViolentMeettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolentMeettingExample() {
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

        public Criteria andMeetingContentIsNull() {
            addCriterion("MEETING_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMeetingContentIsNotNull() {
            addCriterion("MEETING_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingContentEqualTo(String value) {
            addCriterion("MEETING_CONTENT =", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotEqualTo(String value) {
            addCriterion("MEETING_CONTENT <>", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentGreaterThan(String value) {
            addCriterion("MEETING_CONTENT >", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentGreaterThanOrEqualTo(String value) {
            addCriterion("MEETING_CONTENT >=", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentLessThan(String value) {
            addCriterion("MEETING_CONTENT <", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentLessThanOrEqualTo(String value) {
            addCriterion("MEETING_CONTENT <=", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentLike(String value) {
            addCriterion("MEETING_CONTENT like", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotLike(String value) {
            addCriterion("MEETING_CONTENT not like", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentIn(List<String> values) {
            addCriterion("MEETING_CONTENT in", values, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotIn(List<String> values) {
            addCriterion("MEETING_CONTENT not in", values, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentBetween(String value1, String value2) {
            addCriterion("MEETING_CONTENT between", value1, value2, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotBetween(String value1, String value2) {
            addCriterion("MEETING_CONTENT not between", value1, value2, "meetingContent");
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

        public Criteria andOrderAddressIsNull() {
            addCriterion("ORDER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNotNull() {
            addCriterion("ORDER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressEqualTo(String value) {
            addCriterion("ORDER_ADDRESS =", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotEqualTo(String value) {
            addCriterion("ORDER_ADDRESS <>", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThan(String value) {
            addCriterion("ORDER_ADDRESS >", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ADDRESS >=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThan(String value) {
            addCriterion("ORDER_ADDRESS <", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ADDRESS <=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLike(String value) {
            addCriterion("ORDER_ADDRESS like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotLike(String value) {
            addCriterion("ORDER_ADDRESS not like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIn(List<String> values) {
            addCriterion("ORDER_ADDRESS in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotIn(List<String> values) {
            addCriterion("ORDER_ADDRESS not in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressBetween(String value1, String value2) {
            addCriterion("ORDER_ADDRESS between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotBetween(String value1, String value2) {
            addCriterion("ORDER_ADDRESS not between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andViewCodeIsNull() {
            addCriterion("VIEW_CODE is null");
            return (Criteria) this;
        }

        public Criteria andViewCodeIsNotNull() {
            addCriterion("VIEW_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andViewCodeEqualTo(String value) {
            addCriterion("VIEW_CODE =", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotEqualTo(String value) {
            addCriterion("VIEW_CODE <>", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeGreaterThan(String value) {
            addCriterion("VIEW_CODE >", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_CODE >=", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeLessThan(String value) {
            addCriterion("VIEW_CODE <", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeLessThanOrEqualTo(String value) {
            addCriterion("VIEW_CODE <=", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeLike(String value) {
            addCriterion("VIEW_CODE like", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotLike(String value) {
            addCriterion("VIEW_CODE not like", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeIn(List<String> values) {
            addCriterion("VIEW_CODE in", values, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotIn(List<String> values) {
            addCriterion("VIEW_CODE not in", values, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeBetween(String value1, String value2) {
            addCriterion("VIEW_CODE between", value1, value2, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotBetween(String value1, String value2) {
            addCriterion("VIEW_CODE not between", value1, value2, "viewCode");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdIsNull() {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdIsNotNull() {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID =", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdNotEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID <>", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdGreaterThan(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID >", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID >=", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdLessThan(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID <", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdLessThanOrEqualTo(Long value) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID <=", value, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdIn(List<Long> values) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID in", values, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdNotIn(List<Long> values) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID not in", values, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdBetween(Long value1, Long value2) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID between", value1, value2, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andPsychologicalCounselingIdNotBetween(Long value1, Long value2) {
            addCriterion("PSYCHOLOGICAL_COUNSELING_ID not between", value1, value2, "psychologicalCounselingId");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportIsNull() {
            addCriterion("ANALYSIS_REPORT is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportIsNotNull() {
            addCriterion("ANALYSIS_REPORT is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportEqualTo(String value) {
            addCriterion("ANALYSIS_REPORT =", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportNotEqualTo(String value) {
            addCriterion("ANALYSIS_REPORT <>", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportGreaterThan(String value) {
            addCriterion("ANALYSIS_REPORT >", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS_REPORT >=", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportLessThan(String value) {
            addCriterion("ANALYSIS_REPORT <", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS_REPORT <=", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportLike(String value) {
            addCriterion("ANALYSIS_REPORT like", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportNotLike(String value) {
            addCriterion("ANALYSIS_REPORT not like", value, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportIn(List<String> values) {
            addCriterion("ANALYSIS_REPORT in", values, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportNotIn(List<String> values) {
            addCriterion("ANALYSIS_REPORT not in", values, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportBetween(String value1, String value2) {
            addCriterion("ANALYSIS_REPORT between", value1, value2, "analysisReport");
            return (Criteria) this;
        }

        public Criteria andAnalysisReportNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS_REPORT not between", value1, value2, "analysisReport");
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