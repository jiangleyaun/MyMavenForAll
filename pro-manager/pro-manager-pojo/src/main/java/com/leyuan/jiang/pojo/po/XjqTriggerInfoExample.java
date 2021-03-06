package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XjqTriggerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjqTriggerInfoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("job_group is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("job_group is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(Integer value) {
            addCriterion("job_group =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(Integer value) {
            addCriterion("job_group <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(Integer value) {
            addCriterion("job_group >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_group >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(Integer value) {
            addCriterion("job_group <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(Integer value) {
            addCriterion("job_group <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<Integer> values) {
            addCriterion("job_group in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<Integer> values) {
            addCriterion("job_group not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(Integer value1, Integer value2) {
            addCriterion("job_group between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("job_group not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobCronIsNull() {
            addCriterion("job_cron is null");
            return (Criteria) this;
        }

        public Criteria andJobCronIsNotNull() {
            addCriterion("job_cron is not null");
            return (Criteria) this;
        }

        public Criteria andJobCronEqualTo(String value) {
            addCriterion("job_cron =", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronNotEqualTo(String value) {
            addCriterion("job_cron <>", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronGreaterThan(String value) {
            addCriterion("job_cron >", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronGreaterThanOrEqualTo(String value) {
            addCriterion("job_cron >=", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronLessThan(String value) {
            addCriterion("job_cron <", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronLessThanOrEqualTo(String value) {
            addCriterion("job_cron <=", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronLike(String value) {
            addCriterion("job_cron like", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronNotLike(String value) {
            addCriterion("job_cron not like", value, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronIn(List<String> values) {
            addCriterion("job_cron in", values, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronNotIn(List<String> values) {
            addCriterion("job_cron not in", values, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronBetween(String value1, String value2) {
            addCriterion("job_cron between", value1, value2, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobCronNotBetween(String value1, String value2) {
            addCriterion("job_cron not between", value1, value2, "jobCron");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNull() {
            addCriterion("job_desc is null");
            return (Criteria) this;
        }

        public Criteria andJobDescIsNotNull() {
            addCriterion("job_desc is not null");
            return (Criteria) this;
        }

        public Criteria andJobDescEqualTo(String value) {
            addCriterion("job_desc =", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotEqualTo(String value) {
            addCriterion("job_desc <>", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThan(String value) {
            addCriterion("job_desc >", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescGreaterThanOrEqualTo(String value) {
            addCriterion("job_desc >=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThan(String value) {
            addCriterion("job_desc <", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLessThanOrEqualTo(String value) {
            addCriterion("job_desc <=", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescLike(String value) {
            addCriterion("job_desc like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotLike(String value) {
            addCriterion("job_desc not like", value, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescIn(List<String> values) {
            addCriterion("job_desc in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotIn(List<String> values) {
            addCriterion("job_desc not in", values, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescBetween(String value1, String value2) {
            addCriterion("job_desc between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andJobDescNotBetween(String value1, String value2) {
            addCriterion("job_desc not between", value1, value2, "jobDesc");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailIsNull() {
            addCriterion("alarm_email is null");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailIsNotNull() {
            addCriterion("alarm_email is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailEqualTo(String value) {
            addCriterion("alarm_email =", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotEqualTo(String value) {
            addCriterion("alarm_email <>", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailGreaterThan(String value) {
            addCriterion("alarm_email >", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_email >=", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailLessThan(String value) {
            addCriterion("alarm_email <", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailLessThanOrEqualTo(String value) {
            addCriterion("alarm_email <=", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailLike(String value) {
            addCriterion("alarm_email like", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotLike(String value) {
            addCriterion("alarm_email not like", value, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailIn(List<String> values) {
            addCriterion("alarm_email in", values, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotIn(List<String> values) {
            addCriterion("alarm_email not in", values, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailBetween(String value1, String value2) {
            addCriterion("alarm_email between", value1, value2, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andAlarmEmailNotBetween(String value1, String value2) {
            addCriterion("alarm_email not between", value1, value2, "alarmEmail");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyIsNull() {
            addCriterion("executor_route_strategy is null");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyIsNotNull() {
            addCriterion("executor_route_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyEqualTo(String value) {
            addCriterion("executor_route_strategy =", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotEqualTo(String value) {
            addCriterion("executor_route_strategy <>", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyGreaterThan(String value) {
            addCriterion("executor_route_strategy >", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("executor_route_strategy >=", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyLessThan(String value) {
            addCriterion("executor_route_strategy <", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyLessThanOrEqualTo(String value) {
            addCriterion("executor_route_strategy <=", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyLike(String value) {
            addCriterion("executor_route_strategy like", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotLike(String value) {
            addCriterion("executor_route_strategy not like", value, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyIn(List<String> values) {
            addCriterion("executor_route_strategy in", values, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotIn(List<String> values) {
            addCriterion("executor_route_strategy not in", values, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyBetween(String value1, String value2) {
            addCriterion("executor_route_strategy between", value1, value2, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorRouteStrategyNotBetween(String value1, String value2) {
            addCriterion("executor_route_strategy not between", value1, value2, "executorRouteStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerIsNull() {
            addCriterion("executor_handler is null");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerIsNotNull() {
            addCriterion("executor_handler is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerEqualTo(String value) {
            addCriterion("executor_handler =", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotEqualTo(String value) {
            addCriterion("executor_handler <>", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerGreaterThan(String value) {
            addCriterion("executor_handler >", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("executor_handler >=", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerLessThan(String value) {
            addCriterion("executor_handler <", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerLessThanOrEqualTo(String value) {
            addCriterion("executor_handler <=", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerLike(String value) {
            addCriterion("executor_handler like", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotLike(String value) {
            addCriterion("executor_handler not like", value, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerIn(List<String> values) {
            addCriterion("executor_handler in", values, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotIn(List<String> values) {
            addCriterion("executor_handler not in", values, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerBetween(String value1, String value2) {
            addCriterion("executor_handler between", value1, value2, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorHandlerNotBetween(String value1, String value2) {
            addCriterion("executor_handler not between", value1, value2, "executorHandler");
            return (Criteria) this;
        }

        public Criteria andExecutorParamIsNull() {
            addCriterion("executor_param is null");
            return (Criteria) this;
        }

        public Criteria andExecutorParamIsNotNull() {
            addCriterion("executor_param is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorParamEqualTo(String value) {
            addCriterion("executor_param =", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotEqualTo(String value) {
            addCriterion("executor_param <>", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamGreaterThan(String value) {
            addCriterion("executor_param >", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamGreaterThanOrEqualTo(String value) {
            addCriterion("executor_param >=", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamLessThan(String value) {
            addCriterion("executor_param <", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamLessThanOrEqualTo(String value) {
            addCriterion("executor_param <=", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamLike(String value) {
            addCriterion("executor_param like", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotLike(String value) {
            addCriterion("executor_param not like", value, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamIn(List<String> values) {
            addCriterion("executor_param in", values, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotIn(List<String> values) {
            addCriterion("executor_param not in", values, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamBetween(String value1, String value2) {
            addCriterion("executor_param between", value1, value2, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorParamNotBetween(String value1, String value2) {
            addCriterion("executor_param not between", value1, value2, "executorParam");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyIsNull() {
            addCriterion("executor_block_strategy is null");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyIsNotNull() {
            addCriterion("executor_block_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyEqualTo(String value) {
            addCriterion("executor_block_strategy =", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotEqualTo(String value) {
            addCriterion("executor_block_strategy <>", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyGreaterThan(String value) {
            addCriterion("executor_block_strategy >", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("executor_block_strategy >=", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyLessThan(String value) {
            addCriterion("executor_block_strategy <", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyLessThanOrEqualTo(String value) {
            addCriterion("executor_block_strategy <=", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyLike(String value) {
            addCriterion("executor_block_strategy like", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotLike(String value) {
            addCriterion("executor_block_strategy not like", value, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyIn(List<String> values) {
            addCriterion("executor_block_strategy in", values, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotIn(List<String> values) {
            addCriterion("executor_block_strategy not in", values, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyBetween(String value1, String value2) {
            addCriterion("executor_block_strategy between", value1, value2, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorBlockStrategyNotBetween(String value1, String value2) {
            addCriterion("executor_block_strategy not between", value1, value2, "executorBlockStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyIsNull() {
            addCriterion("executor_fail_strategy is null");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyIsNotNull() {
            addCriterion("executor_fail_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyEqualTo(String value) {
            addCriterion("executor_fail_strategy =", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyNotEqualTo(String value) {
            addCriterion("executor_fail_strategy <>", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyGreaterThan(String value) {
            addCriterion("executor_fail_strategy >", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("executor_fail_strategy >=", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyLessThan(String value) {
            addCriterion("executor_fail_strategy <", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyLessThanOrEqualTo(String value) {
            addCriterion("executor_fail_strategy <=", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyLike(String value) {
            addCriterion("executor_fail_strategy like", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyNotLike(String value) {
            addCriterion("executor_fail_strategy not like", value, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyIn(List<String> values) {
            addCriterion("executor_fail_strategy in", values, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyNotIn(List<String> values) {
            addCriterion("executor_fail_strategy not in", values, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyBetween(String value1, String value2) {
            addCriterion("executor_fail_strategy between", value1, value2, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andExecutorFailStrategyNotBetween(String value1, String value2) {
            addCriterion("executor_fail_strategy not between", value1, value2, "executorFailStrategy");
            return (Criteria) this;
        }

        public Criteria andGlueTypeIsNull() {
            addCriterion("glue_type is null");
            return (Criteria) this;
        }

        public Criteria andGlueTypeIsNotNull() {
            addCriterion("glue_type is not null");
            return (Criteria) this;
        }

        public Criteria andGlueTypeEqualTo(String value) {
            addCriterion("glue_type =", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotEqualTo(String value) {
            addCriterion("glue_type <>", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeGreaterThan(String value) {
            addCriterion("glue_type >", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("glue_type >=", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeLessThan(String value) {
            addCriterion("glue_type <", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeLessThanOrEqualTo(String value) {
            addCriterion("glue_type <=", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeLike(String value) {
            addCriterion("glue_type like", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotLike(String value) {
            addCriterion("glue_type not like", value, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeIn(List<String> values) {
            addCriterion("glue_type in", values, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotIn(List<String> values) {
            addCriterion("glue_type not in", values, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeBetween(String value1, String value2) {
            addCriterion("glue_type between", value1, value2, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueTypeNotBetween(String value1, String value2) {
            addCriterion("glue_type not between", value1, value2, "glueType");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkIsNull() {
            addCriterion("glue_remark is null");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkIsNotNull() {
            addCriterion("glue_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkEqualTo(String value) {
            addCriterion("glue_remark =", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotEqualTo(String value) {
            addCriterion("glue_remark <>", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkGreaterThan(String value) {
            addCriterion("glue_remark >", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("glue_remark >=", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkLessThan(String value) {
            addCriterion("glue_remark <", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkLessThanOrEqualTo(String value) {
            addCriterion("glue_remark <=", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkLike(String value) {
            addCriterion("glue_remark like", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotLike(String value) {
            addCriterion("glue_remark not like", value, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkIn(List<String> values) {
            addCriterion("glue_remark in", values, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotIn(List<String> values) {
            addCriterion("glue_remark not in", values, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkBetween(String value1, String value2) {
            addCriterion("glue_remark between", value1, value2, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueRemarkNotBetween(String value1, String value2) {
            addCriterion("glue_remark not between", value1, value2, "glueRemark");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeIsNull() {
            addCriterion("glue_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeIsNotNull() {
            addCriterion("glue_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeEqualTo(Date value) {
            addCriterion("glue_updatetime =", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeNotEqualTo(Date value) {
            addCriterion("glue_updatetime <>", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeGreaterThan(Date value) {
            addCriterion("glue_updatetime >", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("glue_updatetime >=", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeLessThan(Date value) {
            addCriterion("glue_updatetime <", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("glue_updatetime <=", value, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeIn(List<Date> values) {
            addCriterion("glue_updatetime in", values, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeNotIn(List<Date> values) {
            addCriterion("glue_updatetime not in", values, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("glue_updatetime between", value1, value2, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andGlueUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("glue_updatetime not between", value1, value2, "glueUpdatetime");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyIsNull() {
            addCriterion("child_jobkey is null");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyIsNotNull() {
            addCriterion("child_jobkey is not null");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyEqualTo(String value) {
            addCriterion("child_jobkey =", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyNotEqualTo(String value) {
            addCriterion("child_jobkey <>", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyGreaterThan(String value) {
            addCriterion("child_jobkey >", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyGreaterThanOrEqualTo(String value) {
            addCriterion("child_jobkey >=", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyLessThan(String value) {
            addCriterion("child_jobkey <", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyLessThanOrEqualTo(String value) {
            addCriterion("child_jobkey <=", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyLike(String value) {
            addCriterion("child_jobkey like", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyNotLike(String value) {
            addCriterion("child_jobkey not like", value, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyIn(List<String> values) {
            addCriterion("child_jobkey in", values, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyNotIn(List<String> values) {
            addCriterion("child_jobkey not in", values, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyBetween(String value1, String value2) {
            addCriterion("child_jobkey between", value1, value2, "childJobkey");
            return (Criteria) this;
        }

        public Criteria andChildJobkeyNotBetween(String value1, String value2) {
            addCriterion("child_jobkey not between", value1, value2, "childJobkey");
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