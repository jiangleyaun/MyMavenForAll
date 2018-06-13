package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SanctuaryApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SanctuaryApplicationExample() {
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

        public Criteria andContactHotlineIsNull() {
            addCriterion("CONTACT_HOTLINE is null");
            return (Criteria) this;
        }

        public Criteria andContactHotlineIsNotNull() {
            addCriterion("CONTACT_HOTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andContactHotlineEqualTo(String value) {
            addCriterion("CONTACT_HOTLINE =", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineNotEqualTo(String value) {
            addCriterion("CONTACT_HOTLINE <>", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineGreaterThan(String value) {
            addCriterion("CONTACT_HOTLINE >", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_HOTLINE >=", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineLessThan(String value) {
            addCriterion("CONTACT_HOTLINE <", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_HOTLINE <=", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineLike(String value) {
            addCriterion("CONTACT_HOTLINE like", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineNotLike(String value) {
            addCriterion("CONTACT_HOTLINE not like", value, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineIn(List<String> values) {
            addCriterion("CONTACT_HOTLINE in", values, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineNotIn(List<String> values) {
            addCriterion("CONTACT_HOTLINE not in", values, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineBetween(String value1, String value2) {
            addCriterion("CONTACT_HOTLINE between", value1, value2, "contactHotline");
            return (Criteria) this;
        }

        public Criteria andContactHotlineNotBetween(String value1, String value2) {
            addCriterion("CONTACT_HOTLINE not between", value1, value2, "contactHotline");
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

        public Criteria andModeOfTransportationIsNull() {
            addCriterion("MODE_OF_TRANSPORTATION is null");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationIsNotNull() {
            addCriterion("MODE_OF_TRANSPORTATION is not null");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationEqualTo(String value) {
            addCriterion("MODE_OF_TRANSPORTATION =", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationNotEqualTo(String value) {
            addCriterion("MODE_OF_TRANSPORTATION <>", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationGreaterThan(String value) {
            addCriterion("MODE_OF_TRANSPORTATION >", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationGreaterThanOrEqualTo(String value) {
            addCriterion("MODE_OF_TRANSPORTATION >=", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationLessThan(String value) {
            addCriterion("MODE_OF_TRANSPORTATION <", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationLessThanOrEqualTo(String value) {
            addCriterion("MODE_OF_TRANSPORTATION <=", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationLike(String value) {
            addCriterion("MODE_OF_TRANSPORTATION like", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationNotLike(String value) {
            addCriterion("MODE_OF_TRANSPORTATION not like", value, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationIn(List<String> values) {
            addCriterion("MODE_OF_TRANSPORTATION in", values, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationNotIn(List<String> values) {
            addCriterion("MODE_OF_TRANSPORTATION not in", values, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationBetween(String value1, String value2) {
            addCriterion("MODE_OF_TRANSPORTATION between", value1, value2, "modeOfTransportation");
            return (Criteria) this;
        }

        public Criteria andModeOfTransportationNotBetween(String value1, String value2) {
            addCriterion("MODE_OF_TRANSPORTATION not between", value1, value2, "modeOfTransportation");
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

        public Criteria andSanctuaryIdIsNull() {
            addCriterion("SANCTUARY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdIsNotNull() {
            addCriterion("SANCTUARY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdEqualTo(Long value) {
            addCriterion("SANCTUARY_ID =", value, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdNotEqualTo(Long value) {
            addCriterion("SANCTUARY_ID <>", value, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdGreaterThan(Long value) {
            addCriterion("SANCTUARY_ID >", value, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SANCTUARY_ID >=", value, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdLessThan(Long value) {
            addCriterion("SANCTUARY_ID <", value, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdLessThanOrEqualTo(Long value) {
            addCriterion("SANCTUARY_ID <=", value, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdIn(List<Long> values) {
            addCriterion("SANCTUARY_ID in", values, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdNotIn(List<Long> values) {
            addCriterion("SANCTUARY_ID not in", values, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdBetween(Long value1, Long value2) {
            addCriterion("SANCTUARY_ID between", value1, value2, "sanctuaryId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIdNotBetween(Long value1, Long value2) {
            addCriterion("SANCTUARY_ID not between", value1, value2, "sanctuaryId");
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

        public Criteria andArriveTimeIsNull() {
            addCriterion("ARRIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("ARRIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("ARRIVE_TIME =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("ARRIVE_TIME <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("ARRIVE_TIME >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_TIME >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("ARRIVE_TIME <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_TIME <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("ARRIVE_TIME in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("ARRIVE_TIME not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_TIME between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_TIME not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotIsNull() {
            addCriterion("REMINDED_OR_NOT is null");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotIsNotNull() {
            addCriterion("REMINDED_OR_NOT is not null");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotEqualTo(String value) {
            addCriterion("REMINDED_OR_NOT =", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotNotEqualTo(String value) {
            addCriterion("REMINDED_OR_NOT <>", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotGreaterThan(String value) {
            addCriterion("REMINDED_OR_NOT >", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("REMINDED_OR_NOT >=", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotLessThan(String value) {
            addCriterion("REMINDED_OR_NOT <", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotLessThanOrEqualTo(String value) {
            addCriterion("REMINDED_OR_NOT <=", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotLike(String value) {
            addCriterion("REMINDED_OR_NOT like", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotNotLike(String value) {
            addCriterion("REMINDED_OR_NOT not like", value, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotIn(List<String> values) {
            addCriterion("REMINDED_OR_NOT in", values, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotNotIn(List<String> values) {
            addCriterion("REMINDED_OR_NOT not in", values, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotBetween(String value1, String value2) {
            addCriterion("REMINDED_OR_NOT between", value1, value2, "remindedOrNot");
            return (Criteria) this;
        }

        public Criteria andRemindedOrNotNotBetween(String value1, String value2) {
            addCriterion("REMINDED_OR_NOT not between", value1, value2, "remindedOrNot");
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