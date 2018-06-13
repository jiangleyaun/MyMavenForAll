package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PsychologicalCounselingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PsychologicalCounselingExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("NUMBER =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("NUMBER <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("NUMBER >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMBER >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("NUMBER <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("NUMBER <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("NUMBER in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("NUMBER not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("NUMBER between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMBER not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andReservationTypeIsNull() {
            addCriterion("RESERVATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReservationTypeIsNotNull() {
            addCriterion("RESERVATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReservationTypeEqualTo(String value) {
            addCriterion("RESERVATION_TYPE =", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeNotEqualTo(String value) {
            addCriterion("RESERVATION_TYPE <>", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeGreaterThan(String value) {
            addCriterion("RESERVATION_TYPE >", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVATION_TYPE >=", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeLessThan(String value) {
            addCriterion("RESERVATION_TYPE <", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeLessThanOrEqualTo(String value) {
            addCriterion("RESERVATION_TYPE <=", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeLike(String value) {
            addCriterion("RESERVATION_TYPE like", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeNotLike(String value) {
            addCriterion("RESERVATION_TYPE not like", value, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeIn(List<String> values) {
            addCriterion("RESERVATION_TYPE in", values, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeNotIn(List<String> values) {
            addCriterion("RESERVATION_TYPE not in", values, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeBetween(String value1, String value2) {
            addCriterion("RESERVATION_TYPE between", value1, value2, "reservationType");
            return (Criteria) this;
        }

        public Criteria andReservationTypeNotBetween(String value1, String value2) {
            addCriterion("RESERVATION_TYPE not between", value1, value2, "reservationType");
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

        public Criteria andCamIdIsNull() {
            addCriterion("CAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCamIdIsNotNull() {
            addCriterion("CAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCamIdEqualTo(Long value) {
            addCriterion("CAM_ID =", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotEqualTo(Long value) {
            addCriterion("CAM_ID <>", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdGreaterThan(Long value) {
            addCriterion("CAM_ID >", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CAM_ID >=", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdLessThan(Long value) {
            addCriterion("CAM_ID <", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdLessThanOrEqualTo(Long value) {
            addCriterion("CAM_ID <=", value, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdIn(List<Long> values) {
            addCriterion("CAM_ID in", values, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotIn(List<Long> values) {
            addCriterion("CAM_ID not in", values, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdBetween(Long value1, Long value2) {
            addCriterion("CAM_ID between", value1, value2, "camId");
            return (Criteria) this;
        }

        public Criteria andCamIdNotBetween(Long value1, Long value2) {
            addCriterion("CAM_ID not between", value1, value2, "camId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdIsNull() {
            addCriterion("RESERVATION_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdIsNotNull() {
            addCriterion("RESERVATION_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdEqualTo(Long value) {
            addCriterion("RESERVATION_ORG_ID =", value, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdNotEqualTo(Long value) {
            addCriterion("RESERVATION_ORG_ID <>", value, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdGreaterThan(Long value) {
            addCriterion("RESERVATION_ORG_ID >", value, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RESERVATION_ORG_ID >=", value, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdLessThan(Long value) {
            addCriterion("RESERVATION_ORG_ID <", value, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("RESERVATION_ORG_ID <=", value, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdIn(List<Long> values) {
            addCriterion("RESERVATION_ORG_ID in", values, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdNotIn(List<Long> values) {
            addCriterion("RESERVATION_ORG_ID not in", values, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdBetween(Long value1, Long value2) {
            addCriterion("RESERVATION_ORG_ID between", value1, value2, "reservationOrgId");
            return (Criteria) this;
        }

        public Criteria andReservationOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("RESERVATION_ORG_ID not between", value1, value2, "reservationOrgId");
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

        public Criteria andAppointmentDateIsNull() {
            addCriterion("APPOINTMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNotNull() {
            addCriterion("APPOINTMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE =", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE <>", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThan(Date value) {
            addCriterion("APPOINTMENT_DATE >", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE >=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThan(Date value) {
            addCriterion("APPOINTMENT_DATE <", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThanOrEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE <=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIn(List<Date> values) {
            addCriterion("APPOINTMENT_DATE in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotIn(List<Date> values) {
            addCriterion("APPOINTMENT_DATE not in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateBetween(Date value1, Date value2) {
            addCriterion("APPOINTMENT_DATE between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotBetween(Date value1, Date value2) {
            addCriterion("APPOINTMENT_DATE not between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andTimeRangeIsNull() {
            addCriterion("TIME_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andTimeRangeIsNotNull() {
            addCriterion("TIME_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRangeEqualTo(String value) {
            addCriterion("TIME_RANGE =", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeNotEqualTo(String value) {
            addCriterion("TIME_RANGE <>", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeGreaterThan(String value) {
            addCriterion("TIME_RANGE >", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_RANGE >=", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeLessThan(String value) {
            addCriterion("TIME_RANGE <", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeLessThanOrEqualTo(String value) {
            addCriterion("TIME_RANGE <=", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeLike(String value) {
            addCriterion("TIME_RANGE like", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeNotLike(String value) {
            addCriterion("TIME_RANGE not like", value, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeIn(List<String> values) {
            addCriterion("TIME_RANGE in", values, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeNotIn(List<String> values) {
            addCriterion("TIME_RANGE not in", values, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeBetween(String value1, String value2) {
            addCriterion("TIME_RANGE between", value1, value2, "timeRange");
            return (Criteria) this;
        }

        public Criteria andTimeRangeNotBetween(String value1, String value2) {
            addCriterion("TIME_RANGE not between", value1, value2, "timeRange");
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