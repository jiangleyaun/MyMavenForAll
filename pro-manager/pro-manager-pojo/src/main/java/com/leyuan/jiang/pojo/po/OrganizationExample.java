package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
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

        public Criteria andOrganizationNameIsNull() {
            addCriterion("ORGANIZATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNotNull() {
            addCriterion("ORGANIZATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME =", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME <>", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThan(String value) {
            addCriterion("ORGANIZATION_NAME >", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME >=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThan(String value) {
            addCriterion("ORGANIZATION_NAME <", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NAME <=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLike(String value) {
            addCriterion("ORGANIZATION_NAME like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotLike(String value) {
            addCriterion("ORGANIZATION_NAME not like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIn(List<String> values) {
            addCriterion("ORGANIZATION_NAME in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotIn(List<String> values) {
            addCriterion("ORGANIZATION_NAME not in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NAME between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NAME not between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaIsNull() {
            addCriterion("ORGANIZATION_AREA is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaIsNotNull() {
            addCriterion("ORGANIZATION_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaEqualTo(String value) {
            addCriterion("ORGANIZATION_AREA =", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaNotEqualTo(String value) {
            addCriterion("ORGANIZATION_AREA <>", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaGreaterThan(String value) {
            addCriterion("ORGANIZATION_AREA >", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_AREA >=", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaLessThan(String value) {
            addCriterion("ORGANIZATION_AREA <", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_AREA <=", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaLike(String value) {
            addCriterion("ORGANIZATION_AREA like", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaNotLike(String value) {
            addCriterion("ORGANIZATION_AREA not like", value, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaIn(List<String> values) {
            addCriterion("ORGANIZATION_AREA in", values, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaNotIn(List<String> values) {
            addCriterion("ORGANIZATION_AREA not in", values, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_AREA between", value1, value2, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAreaNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_AREA not between", value1, value2, "organizationArea");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressIsNull() {
            addCriterion("ORGANIZATION_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressIsNotNull() {
            addCriterion("ORGANIZATION_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressEqualTo(String value) {
            addCriterion("ORGANIZATION_ADDRESS =", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressNotEqualTo(String value) {
            addCriterion("ORGANIZATION_ADDRESS <>", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressGreaterThan(String value) {
            addCriterion("ORGANIZATION_ADDRESS >", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ADDRESS >=", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressLessThan(String value) {
            addCriterion("ORGANIZATION_ADDRESS <", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ADDRESS <=", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressLike(String value) {
            addCriterion("ORGANIZATION_ADDRESS like", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressNotLike(String value) {
            addCriterion("ORGANIZATION_ADDRESS not like", value, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressIn(List<String> values) {
            addCriterion("ORGANIZATION_ADDRESS in", values, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressNotIn(List<String> values) {
            addCriterion("ORGANIZATION_ADDRESS not in", values, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ADDRESS between", value1, value2, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationAddressNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ADDRESS not between", value1, value2, "organizationAddress");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("ORGANIZATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("ORGANIZATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("ORGANIZATION_CODE >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("ORGANIZATION_CODE <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("ORGANIZATION_CODE like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("ORGANIZATION_CODE not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgIsNull() {
            addCriterion("ORGANIZATION_IMG is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgIsNotNull() {
            addCriterion("ORGANIZATION_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgEqualTo(String value) {
            addCriterion("ORGANIZATION_IMG =", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgNotEqualTo(String value) {
            addCriterion("ORGANIZATION_IMG <>", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgGreaterThan(String value) {
            addCriterion("ORGANIZATION_IMG >", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_IMG >=", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgLessThan(String value) {
            addCriterion("ORGANIZATION_IMG <", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_IMG <=", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgLike(String value) {
            addCriterion("ORGANIZATION_IMG like", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgNotLike(String value) {
            addCriterion("ORGANIZATION_IMG not like", value, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgIn(List<String> values) {
            addCriterion("ORGANIZATION_IMG in", values, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgNotIn(List<String> values) {
            addCriterion("ORGANIZATION_IMG not in", values, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_IMG between", value1, value2, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationImgNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_IMG not between", value1, value2, "organizationImg");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNull() {
            addCriterion("DETAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("DETAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("DETAIL_ADDRESS =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("DETAIL_ADDRESS <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("DETAIL_ADDRESS >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_ADDRESS >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("DETAIL_ADDRESS <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_ADDRESS <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("DETAIL_ADDRESS like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("DETAIL_ADDRESS not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("DETAIL_ADDRESS in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("DETAIL_ADDRESS not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("DETAIL_ADDRESS between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("DETAIL_ADDRESS not between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneIsNull() {
            addCriterion("LANDLINE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneIsNotNull() {
            addCriterion("LANDLINE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneEqualTo(String value) {
            addCriterion("LANDLINE_PHONE =", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneNotEqualTo(String value) {
            addCriterion("LANDLINE_PHONE <>", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneGreaterThan(String value) {
            addCriterion("LANDLINE_PHONE >", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LANDLINE_PHONE >=", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneLessThan(String value) {
            addCriterion("LANDLINE_PHONE <", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneLessThanOrEqualTo(String value) {
            addCriterion("LANDLINE_PHONE <=", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneLike(String value) {
            addCriterion("LANDLINE_PHONE like", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneNotLike(String value) {
            addCriterion("LANDLINE_PHONE not like", value, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneIn(List<String> values) {
            addCriterion("LANDLINE_PHONE in", values, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneNotIn(List<String> values) {
            addCriterion("LANDLINE_PHONE not in", values, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneBetween(String value1, String value2) {
            addCriterion("LANDLINE_PHONE between", value1, value2, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLandlinePhoneNotBetween(String value1, String value2) {
            addCriterion("LANDLINE_PHONE not between", value1, value2, "landlinePhone");
            return (Criteria) this;
        }

        public Criteria andLogoImgIsNull() {
            addCriterion("LOGO_IMG is null");
            return (Criteria) this;
        }

        public Criteria andLogoImgIsNotNull() {
            addCriterion("LOGO_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andLogoImgEqualTo(String value) {
            addCriterion("LOGO_IMG =", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotEqualTo(String value) {
            addCriterion("LOGO_IMG <>", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgGreaterThan(String value) {
            addCriterion("LOGO_IMG >", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO_IMG >=", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgLessThan(String value) {
            addCriterion("LOGO_IMG <", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgLessThanOrEqualTo(String value) {
            addCriterion("LOGO_IMG <=", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgLike(String value) {
            addCriterion("LOGO_IMG like", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotLike(String value) {
            addCriterion("LOGO_IMG not like", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgIn(List<String> values) {
            addCriterion("LOGO_IMG in", values, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotIn(List<String> values) {
            addCriterion("LOGO_IMG not in", values, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgBetween(String value1, String value2) {
            addCriterion("LOGO_IMG between", value1, value2, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotBetween(String value1, String value2) {
            addCriterion("LOGO_IMG not between", value1, value2, "logoImg");
            return (Criteria) this;
        }

        public Criteria andSuperNameIsNull() {
            addCriterion("SUPER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSuperNameIsNotNull() {
            addCriterion("SUPER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSuperNameEqualTo(String value) {
            addCriterion("SUPER_NAME =", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameNotEqualTo(String value) {
            addCriterion("SUPER_NAME <>", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameGreaterThan(String value) {
            addCriterion("SUPER_NAME >", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPER_NAME >=", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameLessThan(String value) {
            addCriterion("SUPER_NAME <", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameLessThanOrEqualTo(String value) {
            addCriterion("SUPER_NAME <=", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameLike(String value) {
            addCriterion("SUPER_NAME like", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameNotLike(String value) {
            addCriterion("SUPER_NAME not like", value, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameIn(List<String> values) {
            addCriterion("SUPER_NAME in", values, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameNotIn(List<String> values) {
            addCriterion("SUPER_NAME not in", values, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameBetween(String value1, String value2) {
            addCriterion("SUPER_NAME between", value1, value2, "superName");
            return (Criteria) this;
        }

        public Criteria andSuperNameNotBetween(String value1, String value2) {
            addCriterion("SUPER_NAME not between", value1, value2, "superName");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("CONTACT_NAME =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("CONTACT_NAME <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("CONTACT_NAME >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("CONTACT_NAME <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("CONTACT_NAME like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("CONTACT_NAME not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("CONTACT_NAME in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("CONTACT_NAME not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNull() {
            addCriterion("CONTACT_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNotNull() {
            addCriterion("CONTACT_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andContactMailEqualTo(String value) {
            addCriterion("CONTACT_MAIL =", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotEqualTo(String value) {
            addCriterion("CONTACT_MAIL <>", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThan(String value) {
            addCriterion("CONTACT_MAIL >", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_MAIL >=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThan(String value) {
            addCriterion("CONTACT_MAIL <", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_MAIL <=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLike(String value) {
            addCriterion("CONTACT_MAIL like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotLike(String value) {
            addCriterion("CONTACT_MAIL not like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailIn(List<String> values) {
            addCriterion("CONTACT_MAIL in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotIn(List<String> values) {
            addCriterion("CONTACT_MAIL not in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailBetween(String value1, String value2) {
            addCriterion("CONTACT_MAIL between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotBetween(String value1, String value2) {
            addCriterion("CONTACT_MAIL not between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andUrlImgIsNull() {
            addCriterion("URL_IMG is null");
            return (Criteria) this;
        }

        public Criteria andUrlImgIsNotNull() {
            addCriterion("URL_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andUrlImgEqualTo(String value) {
            addCriterion("URL_IMG =", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgNotEqualTo(String value) {
            addCriterion("URL_IMG <>", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgGreaterThan(String value) {
            addCriterion("URL_IMG >", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgGreaterThanOrEqualTo(String value) {
            addCriterion("URL_IMG >=", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgLessThan(String value) {
            addCriterion("URL_IMG <", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgLessThanOrEqualTo(String value) {
            addCriterion("URL_IMG <=", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgLike(String value) {
            addCriterion("URL_IMG like", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgNotLike(String value) {
            addCriterion("URL_IMG not like", value, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgIn(List<String> values) {
            addCriterion("URL_IMG in", values, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgNotIn(List<String> values) {
            addCriterion("URL_IMG not in", values, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgBetween(String value1, String value2) {
            addCriterion("URL_IMG between", value1, value2, "urlImg");
            return (Criteria) this;
        }

        public Criteria andUrlImgNotBetween(String value1, String value2) {
            addCriterion("URL_IMG not between", value1, value2, "urlImg");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNull() {
            addCriterion("GRADE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNotNull() {
            addCriterion("GRADE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelEqualTo(Integer value) {
            addCriterion("GRADE_LEVEL =", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotEqualTo(Integer value) {
            addCriterion("GRADE_LEVEL <>", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThan(Integer value) {
            addCriterion("GRADE_LEVEL >", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_LEVEL >=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThan(Integer value) {
            addCriterion("GRADE_LEVEL <", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_LEVEL <=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIn(List<Integer> values) {
            addCriterion("GRADE_LEVEL in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotIn(List<Integer> values) {
            addCriterion("GRADE_LEVEL not in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_LEVEL between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_LEVEL not between", value1, value2, "gradeLevel");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAreasScopeIsNull() {
            addCriterion("AREAS_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andAreasScopeIsNotNull() {
            addCriterion("AREAS_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andAreasScopeEqualTo(String value) {
            addCriterion("AREAS_SCOPE =", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeNotEqualTo(String value) {
            addCriterion("AREAS_SCOPE <>", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeGreaterThan(String value) {
            addCriterion("AREAS_SCOPE >", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS_SCOPE >=", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeLessThan(String value) {
            addCriterion("AREAS_SCOPE <", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeLessThanOrEqualTo(String value) {
            addCriterion("AREAS_SCOPE <=", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeLike(String value) {
            addCriterion("AREAS_SCOPE like", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeNotLike(String value) {
            addCriterion("AREAS_SCOPE not like", value, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeIn(List<String> values) {
            addCriterion("AREAS_SCOPE in", values, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeNotIn(List<String> values) {
            addCriterion("AREAS_SCOPE not in", values, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeBetween(String value1, String value2) {
            addCriterion("AREAS_SCOPE between", value1, value2, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasScopeNotBetween(String value1, String value2) {
            addCriterion("AREAS_SCOPE not between", value1, value2, "areasScope");
            return (Criteria) this;
        }

        public Criteria andAreasLevelIsNull() {
            addCriterion("AREAS_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAreasLevelIsNotNull() {
            addCriterion("AREAS_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAreasLevelEqualTo(String value) {
            addCriterion("AREAS_LEVEL =", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelNotEqualTo(String value) {
            addCriterion("AREAS_LEVEL <>", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelGreaterThan(String value) {
            addCriterion("AREAS_LEVEL >", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelGreaterThanOrEqualTo(String value) {
            addCriterion("AREAS_LEVEL >=", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelLessThan(String value) {
            addCriterion("AREAS_LEVEL <", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelLessThanOrEqualTo(String value) {
            addCriterion("AREAS_LEVEL <=", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelLike(String value) {
            addCriterion("AREAS_LEVEL like", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelNotLike(String value) {
            addCriterion("AREAS_LEVEL not like", value, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelIn(List<String> values) {
            addCriterion("AREAS_LEVEL in", values, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelNotIn(List<String> values) {
            addCriterion("AREAS_LEVEL not in", values, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelBetween(String value1, String value2) {
            addCriterion("AREAS_LEVEL between", value1, value2, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andAreasLevelNotBetween(String value1, String value2) {
            addCriterion("AREAS_LEVEL not between", value1, value2, "areasLevel");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdIsNull() {
            addCriterion("MEDIATION_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdIsNotNull() {
            addCriterion("MEDIATION_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdEqualTo(String value) {
            addCriterion("MEDIATION_TYPE_ID =", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdNotEqualTo(String value) {
            addCriterion("MEDIATION_TYPE_ID <>", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdGreaterThan(String value) {
            addCriterion("MEDIATION_TYPE_ID >", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIATION_TYPE_ID >=", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdLessThan(String value) {
            addCriterion("MEDIATION_TYPE_ID <", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdLessThanOrEqualTo(String value) {
            addCriterion("MEDIATION_TYPE_ID <=", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdLike(String value) {
            addCriterion("MEDIATION_TYPE_ID like", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdNotLike(String value) {
            addCriterion("MEDIATION_TYPE_ID not like", value, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdIn(List<String> values) {
            addCriterion("MEDIATION_TYPE_ID in", values, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdNotIn(List<String> values) {
            addCriterion("MEDIATION_TYPE_ID not in", values, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdBetween(String value1, String value2) {
            addCriterion("MEDIATION_TYPE_ID between", value1, value2, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andMediationTypeIdNotBetween(String value1, String value2) {
            addCriterion("MEDIATION_TYPE_ID not between", value1, value2, "mediationTypeId");
            return (Criteria) this;
        }

        public Criteria andSiteUrlIsNull() {
            addCriterion("SITE_URL is null");
            return (Criteria) this;
        }

        public Criteria andSiteUrlIsNotNull() {
            addCriterion("SITE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSiteUrlEqualTo(String value) {
            addCriterion("SITE_URL =", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlNotEqualTo(String value) {
            addCriterion("SITE_URL <>", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlGreaterThan(String value) {
            addCriterion("SITE_URL >", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_URL >=", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlLessThan(String value) {
            addCriterion("SITE_URL <", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlLessThanOrEqualTo(String value) {
            addCriterion("SITE_URL <=", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlLike(String value) {
            addCriterion("SITE_URL like", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlNotLike(String value) {
            addCriterion("SITE_URL not like", value, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlIn(List<String> values) {
            addCriterion("SITE_URL in", values, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlNotIn(List<String> values) {
            addCriterion("SITE_URL not in", values, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlBetween(String value1, String value2) {
            addCriterion("SITE_URL between", value1, value2, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andSiteUrlNotBetween(String value1, String value2) {
            addCriterion("SITE_URL not between", value1, value2, "siteUrl");
            return (Criteria) this;
        }

        public Criteria andShuntLargeIsNull() {
            addCriterion("SHUNT_LARGE is null");
            return (Criteria) this;
        }

        public Criteria andShuntLargeIsNotNull() {
            addCriterion("SHUNT_LARGE is not null");
            return (Criteria) this;
        }

        public Criteria andShuntLargeEqualTo(String value) {
            addCriterion("SHUNT_LARGE =", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeNotEqualTo(String value) {
            addCriterion("SHUNT_LARGE <>", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeGreaterThan(String value) {
            addCriterion("SHUNT_LARGE >", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeGreaterThanOrEqualTo(String value) {
            addCriterion("SHUNT_LARGE >=", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeLessThan(String value) {
            addCriterion("SHUNT_LARGE <", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeLessThanOrEqualTo(String value) {
            addCriterion("SHUNT_LARGE <=", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeLike(String value) {
            addCriterion("SHUNT_LARGE like", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeNotLike(String value) {
            addCriterion("SHUNT_LARGE not like", value, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeIn(List<String> values) {
            addCriterion("SHUNT_LARGE in", values, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeNotIn(List<String> values) {
            addCriterion("SHUNT_LARGE not in", values, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeBetween(String value1, String value2) {
            addCriterion("SHUNT_LARGE between", value1, value2, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntLargeNotBetween(String value1, String value2) {
            addCriterion("SHUNT_LARGE not between", value1, value2, "shuntLarge");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleIsNull() {
            addCriterion("SHUNT_MIDDLE is null");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleIsNotNull() {
            addCriterion("SHUNT_MIDDLE is not null");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleEqualTo(String value) {
            addCriterion("SHUNT_MIDDLE =", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleNotEqualTo(String value) {
            addCriterion("SHUNT_MIDDLE <>", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleGreaterThan(String value) {
            addCriterion("SHUNT_MIDDLE >", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("SHUNT_MIDDLE >=", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleLessThan(String value) {
            addCriterion("SHUNT_MIDDLE <", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleLessThanOrEqualTo(String value) {
            addCriterion("SHUNT_MIDDLE <=", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleLike(String value) {
            addCriterion("SHUNT_MIDDLE like", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleNotLike(String value) {
            addCriterion("SHUNT_MIDDLE not like", value, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleIn(List<String> values) {
            addCriterion("SHUNT_MIDDLE in", values, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleNotIn(List<String> values) {
            addCriterion("SHUNT_MIDDLE not in", values, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleBetween(String value1, String value2) {
            addCriterion("SHUNT_MIDDLE between", value1, value2, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntMiddleNotBetween(String value1, String value2) {
            addCriterion("SHUNT_MIDDLE not between", value1, value2, "shuntMiddle");
            return (Criteria) this;
        }

        public Criteria andShuntSmallIsNull() {
            addCriterion("SHUNT_SMALL is null");
            return (Criteria) this;
        }

        public Criteria andShuntSmallIsNotNull() {
            addCriterion("SHUNT_SMALL is not null");
            return (Criteria) this;
        }

        public Criteria andShuntSmallEqualTo(String value) {
            addCriterion("SHUNT_SMALL =", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallNotEqualTo(String value) {
            addCriterion("SHUNT_SMALL <>", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallGreaterThan(String value) {
            addCriterion("SHUNT_SMALL >", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallGreaterThanOrEqualTo(String value) {
            addCriterion("SHUNT_SMALL >=", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallLessThan(String value) {
            addCriterion("SHUNT_SMALL <", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallLessThanOrEqualTo(String value) {
            addCriterion("SHUNT_SMALL <=", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallLike(String value) {
            addCriterion("SHUNT_SMALL like", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallNotLike(String value) {
            addCriterion("SHUNT_SMALL not like", value, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallIn(List<String> values) {
            addCriterion("SHUNT_SMALL in", values, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallNotIn(List<String> values) {
            addCriterion("SHUNT_SMALL not in", values, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallBetween(String value1, String value2) {
            addCriterion("SHUNT_SMALL between", value1, value2, "shuntSmall");
            return (Criteria) this;
        }

        public Criteria andShuntSmallNotBetween(String value1, String value2) {
            addCriterion("SHUNT_SMALL not between", value1, value2, "shuntSmall");
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