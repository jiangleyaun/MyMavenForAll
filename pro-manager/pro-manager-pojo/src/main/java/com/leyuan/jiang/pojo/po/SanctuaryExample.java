package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SanctuaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SanctuaryExample() {
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

        public Criteria andSanctuaryNoIsNull() {
            addCriterion("SANCTUARY_NO is null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoIsNotNull() {
            addCriterion("SANCTUARY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoEqualTo(String value) {
            addCriterion("SANCTUARY_NO =", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoNotEqualTo(String value) {
            addCriterion("SANCTUARY_NO <>", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoGreaterThan(String value) {
            addCriterion("SANCTUARY_NO >", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoGreaterThanOrEqualTo(String value) {
            addCriterion("SANCTUARY_NO >=", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoLessThan(String value) {
            addCriterion("SANCTUARY_NO <", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoLessThanOrEqualTo(String value) {
            addCriterion("SANCTUARY_NO <=", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoLike(String value) {
            addCriterion("SANCTUARY_NO like", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoNotLike(String value) {
            addCriterion("SANCTUARY_NO not like", value, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoIn(List<String> values) {
            addCriterion("SANCTUARY_NO in", values, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoNotIn(List<String> values) {
            addCriterion("SANCTUARY_NO not in", values, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoBetween(String value1, String value2) {
            addCriterion("SANCTUARY_NO between", value1, value2, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryNoNotBetween(String value1, String value2) {
            addCriterion("SANCTUARY_NO not between", value1, value2, "sanctuaryNo");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageIsNull() {
            addCriterion("SANCTUARY_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageIsNotNull() {
            addCriterion("SANCTUARY_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageEqualTo(String value) {
            addCriterion("SANCTUARY_IMAGE =", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageNotEqualTo(String value) {
            addCriterion("SANCTUARY_IMAGE <>", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageGreaterThan(String value) {
            addCriterion("SANCTUARY_IMAGE >", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageGreaterThanOrEqualTo(String value) {
            addCriterion("SANCTUARY_IMAGE >=", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageLessThan(String value) {
            addCriterion("SANCTUARY_IMAGE <", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageLessThanOrEqualTo(String value) {
            addCriterion("SANCTUARY_IMAGE <=", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageLike(String value) {
            addCriterion("SANCTUARY_IMAGE like", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageNotLike(String value) {
            addCriterion("SANCTUARY_IMAGE not like", value, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageIn(List<String> values) {
            addCriterion("SANCTUARY_IMAGE in", values, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageNotIn(List<String> values) {
            addCriterion("SANCTUARY_IMAGE not in", values, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageBetween(String value1, String value2) {
            addCriterion("SANCTUARY_IMAGE between", value1, value2, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryImageNotBetween(String value1, String value2) {
            addCriterion("SANCTUARY_IMAGE not between", value1, value2, "sanctuaryImage");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoIsNull() {
            addCriterion("SANCTUARY_ICO is null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoIsNotNull() {
            addCriterion("SANCTUARY_ICO is not null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoEqualTo(String value) {
            addCriterion("SANCTUARY_ICO =", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoNotEqualTo(String value) {
            addCriterion("SANCTUARY_ICO <>", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoGreaterThan(String value) {
            addCriterion("SANCTUARY_ICO >", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoGreaterThanOrEqualTo(String value) {
            addCriterion("SANCTUARY_ICO >=", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoLessThan(String value) {
            addCriterion("SANCTUARY_ICO <", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoLessThanOrEqualTo(String value) {
            addCriterion("SANCTUARY_ICO <=", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoLike(String value) {
            addCriterion("SANCTUARY_ICO like", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoNotLike(String value) {
            addCriterion("SANCTUARY_ICO not like", value, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoIn(List<String> values) {
            addCriterion("SANCTUARY_ICO in", values, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoNotIn(List<String> values) {
            addCriterion("SANCTUARY_ICO not in", values, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoBetween(String value1, String value2) {
            addCriterion("SANCTUARY_ICO between", value1, value2, "sanctuaryIco");
            return (Criteria) this;
        }

        public Criteria andSanctuaryIcoNotBetween(String value1, String value2) {
            addCriterion("SANCTUARY_ICO not between", value1, value2, "sanctuaryIco");
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

        public Criteria andBusInfoIsNull() {
            addCriterion("BUS_INFO is null");
            return (Criteria) this;
        }

        public Criteria andBusInfoIsNotNull() {
            addCriterion("BUS_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andBusInfoEqualTo(String value) {
            addCriterion("BUS_INFO =", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoNotEqualTo(String value) {
            addCriterion("BUS_INFO <>", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoGreaterThan(String value) {
            addCriterion("BUS_INFO >", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_INFO >=", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoLessThan(String value) {
            addCriterion("BUS_INFO <", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoLessThanOrEqualTo(String value) {
            addCriterion("BUS_INFO <=", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoLike(String value) {
            addCriterion("BUS_INFO like", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoNotLike(String value) {
            addCriterion("BUS_INFO not like", value, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoIn(List<String> values) {
            addCriterion("BUS_INFO in", values, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoNotIn(List<String> values) {
            addCriterion("BUS_INFO not in", values, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoBetween(String value1, String value2) {
            addCriterion("BUS_INFO between", value1, value2, "busInfo");
            return (Criteria) this;
        }

        public Criteria andBusInfoNotBetween(String value1, String value2) {
            addCriterion("BUS_INFO not between", value1, value2, "busInfo");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNull() {
            addCriterion("CONTRACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNotNull() {
            addCriterion("CONTRACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumberEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER =", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER <>", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThan(String value) {
            addCriterion("CONTRACT_NUMBER >", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER >=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThan(String value) {
            addCriterion("CONTRACT_NUMBER <", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NUMBER <=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLike(String value) {
            addCriterion("CONTRACT_NUMBER like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotLike(String value) {
            addCriterion("CONTRACT_NUMBER not like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberIn(List<String> values) {
            addCriterion("CONTRACT_NUMBER in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotIn(List<String> values) {
            addCriterion("CONTRACT_NUMBER not in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberBetween(String value1, String value2) {
            addCriterion("CONTRACT_NUMBER between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NUMBER not between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("LEADER is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("LEADER =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("LEADER <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("LEADER >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("LEADER <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("LEADER <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("LEADER like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("LEADER not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("LEADER in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("LEADER not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("LEADER between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("LEADER not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdIsNull() {
            addCriterion("SANCTUARY_ADMIN_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdIsNotNull() {
            addCriterion("SANCTUARY_ADMIN_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdEqualTo(Long value) {
            addCriterion("SANCTUARY_ADMIN_USER_ID =", value, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdNotEqualTo(Long value) {
            addCriterion("SANCTUARY_ADMIN_USER_ID <>", value, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdGreaterThan(Long value) {
            addCriterion("SANCTUARY_ADMIN_USER_ID >", value, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SANCTUARY_ADMIN_USER_ID >=", value, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdLessThan(Long value) {
            addCriterion("SANCTUARY_ADMIN_USER_ID <", value, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdLessThanOrEqualTo(Long value) {
            addCriterion("SANCTUARY_ADMIN_USER_ID <=", value, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdIn(List<Long> values) {
            addCriterion("SANCTUARY_ADMIN_USER_ID in", values, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdNotIn(List<Long> values) {
            addCriterion("SANCTUARY_ADMIN_USER_ID not in", values, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdBetween(Long value1, Long value2) {
            addCriterion("SANCTUARY_ADMIN_USER_ID between", value1, value2, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andSanctuaryAdminUserIdNotBetween(Long value1, Long value2) {
            addCriterion("SANCTUARY_ADMIN_USER_ID not between", value1, value2, "sanctuaryAdminUserId");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("PASS_WORD is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("PASS_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("PASS_WORD =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("PASS_WORD <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("PASS_WORD >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_WORD >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("PASS_WORD <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("PASS_WORD <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("PASS_WORD like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("PASS_WORD not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("PASS_WORD in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("PASS_WORD not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("PASS_WORD between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("PASS_WORD not between", value1, value2, "passWord");
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