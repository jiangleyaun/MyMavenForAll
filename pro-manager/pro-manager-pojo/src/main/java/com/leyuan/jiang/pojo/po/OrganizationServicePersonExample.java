package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationServicePersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationServicePersonExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
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

        public Criteria andCamNameIsNull() {
            addCriterion("CAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCamNameIsNotNull() {
            addCriterion("CAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCamNameEqualTo(String value) {
            addCriterion("CAM_NAME =", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotEqualTo(String value) {
            addCriterion("CAM_NAME <>", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameGreaterThan(String value) {
            addCriterion("CAM_NAME >", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameGreaterThanOrEqualTo(String value) {
            addCriterion("CAM_NAME >=", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameLessThan(String value) {
            addCriterion("CAM_NAME <", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameLessThanOrEqualTo(String value) {
            addCriterion("CAM_NAME <=", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameLike(String value) {
            addCriterion("CAM_NAME like", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotLike(String value) {
            addCriterion("CAM_NAME not like", value, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameIn(List<String> values) {
            addCriterion("CAM_NAME in", values, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotIn(List<String> values) {
            addCriterion("CAM_NAME not in", values, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameBetween(String value1, String value2) {
            addCriterion("CAM_NAME between", value1, value2, "camName");
            return (Criteria) this;
        }

        public Criteria andCamNameNotBetween(String value1, String value2) {
            addCriterion("CAM_NAME not between", value1, value2, "camName");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("SERVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("SERVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("SERVICE_CODE =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("SERVICE_CODE <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("SERVICE_CODE >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("SERVICE_CODE <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("SERVICE_CODE like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("SERVICE_CODE not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("SERVICE_CODE in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("SERVICE_CODE not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("SERVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("SERVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("SERVICE_TYPE =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("SERVICE_TYPE <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("SERVICE_TYPE >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("SERVICE_TYPE <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("SERVICE_TYPE like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("SERVICE_TYPE not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("SERVICE_TYPE in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("SERVICE_TYPE not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andAreasCodeIsNull() {
            addCriterion("AREAS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreasCodeIsNotNull() {
            addCriterion("AREAS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreasCodeEqualTo(String value) {
            addCriterion("AREAS_CODE =", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotEqualTo(String value) {
            addCriterion("AREAS_CODE <>", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeGreaterThan(String value) {
            addCriterion("AREAS_CODE >", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS_CODE >=", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeLessThan(String value) {
            addCriterion("AREAS_CODE <", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeLessThanOrEqualTo(String value) {
            addCriterion("AREAS_CODE <=", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeLike(String value) {
            addCriterion("AREAS_CODE like", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotLike(String value) {
            addCriterion("AREAS_CODE not like", value, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeIn(List<String> values) {
            addCriterion("AREAS_CODE in", values, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotIn(List<String> values) {
            addCriterion("AREAS_CODE not in", values, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeBetween(String value1, String value2) {
            addCriterion("AREAS_CODE between", value1, value2, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasCodeNotBetween(String value1, String value2) {
            addCriterion("AREAS_CODE not between", value1, value2, "areasCode");
            return (Criteria) this;
        }

        public Criteria andAreasNameIsNull() {
            addCriterion("AREAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreasNameIsNotNull() {
            addCriterion("AREAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreasNameEqualTo(String value) {
            addCriterion("AREAS_NAME =", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotEqualTo(String value) {
            addCriterion("AREAS_NAME <>", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameGreaterThan(String value) {
            addCriterion("AREAS_NAME >", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS_NAME >=", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameLessThan(String value) {
            addCriterion("AREAS_NAME <", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameLessThanOrEqualTo(String value) {
            addCriterion("AREAS_NAME <=", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameLike(String value) {
            addCriterion("AREAS_NAME like", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotLike(String value) {
            addCriterion("AREAS_NAME not like", value, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameIn(List<String> values) {
            addCriterion("AREAS_NAME in", values, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotIn(List<String> values) {
            addCriterion("AREAS_NAME not in", values, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameBetween(String value1, String value2) {
            addCriterion("AREAS_NAME between", value1, value2, "areasName");
            return (Criteria) this;
        }

        public Criteria andAreasNameNotBetween(String value1, String value2) {
            addCriterion("AREAS_NAME not between", value1, value2, "areasName");
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