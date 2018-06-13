package com.leyuan.jiang.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LawCaseAttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawCaseAttachmentExample() {
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

        public Criteria andCategorybIsNull() {
            addCriterion("CATEGORYB is null");
            return (Criteria) this;
        }

        public Criteria andCategorybIsNotNull() {
            addCriterion("CATEGORYB is not null");
            return (Criteria) this;
        }

        public Criteria andCategorybEqualTo(String value) {
            addCriterion("CATEGORYB =", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybNotEqualTo(String value) {
            addCriterion("CATEGORYB <>", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybGreaterThan(String value) {
            addCriterion("CATEGORYB >", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYB >=", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybLessThan(String value) {
            addCriterion("CATEGORYB <", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYB <=", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybLike(String value) {
            addCriterion("CATEGORYB like", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybNotLike(String value) {
            addCriterion("CATEGORYB not like", value, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybIn(List<String> values) {
            addCriterion("CATEGORYB in", values, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybNotIn(List<String> values) {
            addCriterion("CATEGORYB not in", values, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybBetween(String value1, String value2) {
            addCriterion("CATEGORYB between", value1, value2, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorybNotBetween(String value1, String value2) {
            addCriterion("CATEGORYB not between", value1, value2, "categoryb");
            return (Criteria) this;
        }

        public Criteria andCategorymIsNull() {
            addCriterion("CATEGORYM is null");
            return (Criteria) this;
        }

        public Criteria andCategorymIsNotNull() {
            addCriterion("CATEGORYM is not null");
            return (Criteria) this;
        }

        public Criteria andCategorymEqualTo(String value) {
            addCriterion("CATEGORYM =", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymNotEqualTo(String value) {
            addCriterion("CATEGORYM <>", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymGreaterThan(String value) {
            addCriterion("CATEGORYM >", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYM >=", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymLessThan(String value) {
            addCriterion("CATEGORYM <", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYM <=", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymLike(String value) {
            addCriterion("CATEGORYM like", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymNotLike(String value) {
            addCriterion("CATEGORYM not like", value, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymIn(List<String> values) {
            addCriterion("CATEGORYM in", values, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymNotIn(List<String> values) {
            addCriterion("CATEGORYM not in", values, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymBetween(String value1, String value2) {
            addCriterion("CATEGORYM between", value1, value2, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorymNotBetween(String value1, String value2) {
            addCriterion("CATEGORYM not between", value1, value2, "categorym");
            return (Criteria) this;
        }

        public Criteria andCategorysIsNull() {
            addCriterion("CATEGORYS is null");
            return (Criteria) this;
        }

        public Criteria andCategorysIsNotNull() {
            addCriterion("CATEGORYS is not null");
            return (Criteria) this;
        }

        public Criteria andCategorysEqualTo(String value) {
            addCriterion("CATEGORYS =", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysNotEqualTo(String value) {
            addCriterion("CATEGORYS <>", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysGreaterThan(String value) {
            addCriterion("CATEGORYS >", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYS >=", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysLessThan(String value) {
            addCriterion("CATEGORYS <", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYS <=", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysLike(String value) {
            addCriterion("CATEGORYS like", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysNotLike(String value) {
            addCriterion("CATEGORYS not like", value, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysIn(List<String> values) {
            addCriterion("CATEGORYS in", values, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysNotIn(List<String> values) {
            addCriterion("CATEGORYS not in", values, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysBetween(String value1, String value2) {
            addCriterion("CATEGORYS between", value1, value2, "categorys");
            return (Criteria) this;
        }

        public Criteria andCategorysNotBetween(String value1, String value2) {
            addCriterion("CATEGORYS not between", value1, value2, "categorys");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("DEL_FLAG like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("DEL_FLAG not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
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

        public Criteria andCaseIdIsNull() {
            addCriterion("CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Long value) {
            addCriterion("CASE_ID =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Long value) {
            addCriterion("CASE_ID <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Long value) {
            addCriterion("CASE_ID >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CASE_ID >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Long value) {
            addCriterion("CASE_ID <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("CASE_ID <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Long> values) {
            addCriterion("CASE_ID in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Long> values) {
            addCriterion("CASE_ID not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Long value1, Long value2) {
            addCriterion("CASE_ID between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("CASE_ID not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
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

        public Criteria andCounselorAndMediatorsIdIsNull() {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdIsNotNull() {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID =", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdNotEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID <>", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdGreaterThan(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID >", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID >=", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdLessThan(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID <", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdLessThanOrEqualTo(Long value) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID <=", value, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdIn(List<Long> values) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID in", values, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdNotIn(List<Long> values) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID not in", values, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdBetween(Long value1, Long value2) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID between", value1, value2, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andCounselorAndMediatorsIdNotBetween(Long value1, Long value2) {
            addCriterion("COUNSELOR_AND_MEDIATORS_ID not between", value1, value2, "counselorAndMediatorsId");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("ROLE is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("ROLE =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("ROLE <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("ROLE >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("ROLE <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("ROLE <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("ROLE like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("ROLE not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("ROLE in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("ROLE not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("ROLE between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("ROLE not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsIsNull() {
            addCriterion("PERSONNEL_IDS is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsIsNotNull() {
            addCriterion("PERSONNEL_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsEqualTo(String value) {
            addCriterion("PERSONNEL_IDS =", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsNotEqualTo(String value) {
            addCriterion("PERSONNEL_IDS <>", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsGreaterThan(String value) {
            addCriterion("PERSONNEL_IDS >", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONNEL_IDS >=", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsLessThan(String value) {
            addCriterion("PERSONNEL_IDS <", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsLessThanOrEqualTo(String value) {
            addCriterion("PERSONNEL_IDS <=", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsLike(String value) {
            addCriterion("PERSONNEL_IDS like", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsNotLike(String value) {
            addCriterion("PERSONNEL_IDS not like", value, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsIn(List<String> values) {
            addCriterion("PERSONNEL_IDS in", values, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsNotIn(List<String> values) {
            addCriterion("PERSONNEL_IDS not in", values, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsBetween(String value1, String value2) {
            addCriterion("PERSONNEL_IDS between", value1, value2, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdsNotBetween(String value1, String value2) {
            addCriterion("PERSONNEL_IDS not between", value1, value2, "personnelIds");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(Integer value) {
            addCriterion("SIGN =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(Integer value) {
            addCriterion("SIGN <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(Integer value) {
            addCriterion("SIGN >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(Integer value) {
            addCriterion("SIGN <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<Integer> values) {
            addCriterion("SIGN in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<Integer> values) {
            addCriterion("SIGN not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(Integer value1, Integer value2) {
            addCriterion("SIGN between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andMeettingIdIsNull() {
            addCriterion("MEETTING_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeettingIdIsNotNull() {
            addCriterion("MEETTING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeettingIdEqualTo(String value) {
            addCriterion("MEETTING_ID =", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdNotEqualTo(String value) {
            addCriterion("MEETTING_ID <>", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdGreaterThan(String value) {
            addCriterion("MEETTING_ID >", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEETTING_ID >=", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdLessThan(String value) {
            addCriterion("MEETTING_ID <", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdLessThanOrEqualTo(String value) {
            addCriterion("MEETTING_ID <=", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdLike(String value) {
            addCriterion("MEETTING_ID like", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdNotLike(String value) {
            addCriterion("MEETTING_ID not like", value, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdIn(List<String> values) {
            addCriterion("MEETTING_ID in", values, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdNotIn(List<String> values) {
            addCriterion("MEETTING_ID not in", values, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdBetween(String value1, String value2) {
            addCriterion("MEETTING_ID between", value1, value2, "meettingId");
            return (Criteria) this;
        }

        public Criteria andMeettingIdNotBetween(String value1, String value2) {
            addCriterion("MEETTING_ID not between", value1, value2, "meettingId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdIsNull() {
            addCriterion("PERSONNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdIsNotNull() {
            addCriterion("PERSONNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdEqualTo(Long value) {
            addCriterion("PERSONNEL_ID =", value, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdNotEqualTo(Long value) {
            addCriterion("PERSONNEL_ID <>", value, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdGreaterThan(Long value) {
            addCriterion("PERSONNEL_ID >", value, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PERSONNEL_ID >=", value, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdLessThan(Long value) {
            addCriterion("PERSONNEL_ID <", value, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdLessThanOrEqualTo(Long value) {
            addCriterion("PERSONNEL_ID <=", value, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdIn(List<Long> values) {
            addCriterion("PERSONNEL_ID in", values, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdNotIn(List<Long> values) {
            addCriterion("PERSONNEL_ID not in", values, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdBetween(Long value1, Long value2) {
            addCriterion("PERSONNEL_ID between", value1, value2, "personnelId");
            return (Criteria) this;
        }

        public Criteria andPersonnelIdNotBetween(Long value1, Long value2) {
            addCriterion("PERSONNEL_ID not between", value1, value2, "personnelId");
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