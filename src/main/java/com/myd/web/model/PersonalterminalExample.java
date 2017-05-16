package com.myd.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalterminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalterminalExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Long value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Long value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Long value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Long value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Long value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Long> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Long> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Long value1, Long value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Long value1, Long value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andPtnameIsNull() {
            addCriterion("ptName is null");
            return (Criteria) this;
        }

        public Criteria andPtnameIsNotNull() {
            addCriterion("ptName is not null");
            return (Criteria) this;
        }

        public Criteria andPtnameEqualTo(String value) {
            addCriterion("ptName =", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameNotEqualTo(String value) {
            addCriterion("ptName <>", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameGreaterThan(String value) {
            addCriterion("ptName >", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameGreaterThanOrEqualTo(String value) {
            addCriterion("ptName >=", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameLessThan(String value) {
            addCriterion("ptName <", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameLessThanOrEqualTo(String value) {
            addCriterion("ptName <=", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameLike(String value) {
            addCriterion("ptName like", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameNotLike(String value) {
            addCriterion("ptName not like", value, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameIn(List<String> values) {
            addCriterion("ptName in", values, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameNotIn(List<String> values) {
            addCriterion("ptName not in", values, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameBetween(String value1, String value2) {
            addCriterion("ptName between", value1, value2, "ptname");
            return (Criteria) this;
        }

        public Criteria andPtnameNotBetween(String value1, String value2) {
            addCriterion("ptName not between", value1, value2, "ptname");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andImageidIsNull() {
            addCriterion("imageId is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageId is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(Long value) {
            addCriterion("imageId =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(Long value) {
            addCriterion("imageId <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(Long value) {
            addCriterion("imageId >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(Long value) {
            addCriterion("imageId >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(Long value) {
            addCriterion("imageId <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(Long value) {
            addCriterion("imageId <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<Long> values) {
            addCriterion("imageId in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<Long> values) {
            addCriterion("imageId not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(Long value1, Long value2) {
            addCriterion("imageId between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(Long value1, Long value2) {
            addCriterion("imageId not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNull() {
            addCriterion("registTime is null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNotNull() {
            addCriterion("registTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeEqualTo(Date value) {
            addCriterion("registTime =", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotEqualTo(Date value) {
            addCriterion("registTime <>", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThan(Date value) {
            addCriterion("registTime >", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registTime >=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThan(Date value) {
            addCriterion("registTime <", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThanOrEqualTo(Date value) {
            addCriterion("registTime <=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIn(List<Date> values) {
            addCriterion("registTime in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotIn(List<Date> values) {
            addCriterion("registTime not in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeBetween(Date value1, Date value2) {
            addCriterion("registTime between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotBetween(Date value1, Date value2) {
            addCriterion("registTime not between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andActivetimeIsNull() {
            addCriterion("activeTime is null");
            return (Criteria) this;
        }

        public Criteria andActivetimeIsNotNull() {
            addCriterion("activeTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivetimeEqualTo(Date value) {
            addCriterion("activeTime =", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotEqualTo(Date value) {
            addCriterion("activeTime <>", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeGreaterThan(Date value) {
            addCriterion("activeTime >", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activeTime >=", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeLessThan(Date value) {
            addCriterion("activeTime <", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeLessThanOrEqualTo(Date value) {
            addCriterion("activeTime <=", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeIn(List<Date> values) {
            addCriterion("activeTime in", values, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotIn(List<Date> values) {
            addCriterion("activeTime not in", values, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeBetween(Date value1, Date value2) {
            addCriterion("activeTime between", value1, value2, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotBetween(Date value1, Date value2) {
            addCriterion("activeTime not between", value1, value2, "activetime");
            return (Criteria) this;
        }

        public Criteria andGpstimeIsNull() {
            addCriterion("gpsTime is null");
            return (Criteria) this;
        }

        public Criteria andGpstimeIsNotNull() {
            addCriterion("gpsTime is not null");
            return (Criteria) this;
        }

        public Criteria andGpstimeEqualTo(Date value) {
            addCriterion("gpsTime =", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotEqualTo(Date value) {
            addCriterion("gpsTime <>", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeGreaterThan(Date value) {
            addCriterion("gpsTime >", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gpsTime >=", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeLessThan(Date value) {
            addCriterion("gpsTime <", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeLessThanOrEqualTo(Date value) {
            addCriterion("gpsTime <=", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeIn(List<Date> values) {
            addCriterion("gpsTime in", values, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotIn(List<Date> values) {
            addCriterion("gpsTime not in", values, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeBetween(Date value1, Date value2) {
            addCriterion("gpsTime between", value1, value2, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotBetween(Date value1, Date value2) {
            addCriterion("gpsTime not between", value1, value2, "gpstime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeIsNull() {
            addCriterion("lastNotifyTime is null");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeIsNotNull() {
            addCriterion("lastNotifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeEqualTo(Date value) {
            addCriterion("lastNotifyTime =", value, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeNotEqualTo(Date value) {
            addCriterion("lastNotifyTime <>", value, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeGreaterThan(Date value) {
            addCriterion("lastNotifyTime >", value, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastNotifyTime >=", value, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeLessThan(Date value) {
            addCriterion("lastNotifyTime <", value, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeLessThanOrEqualTo(Date value) {
            addCriterion("lastNotifyTime <=", value, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeIn(List<Date> values) {
            addCriterion("lastNotifyTime in", values, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeNotIn(List<Date> values) {
            addCriterion("lastNotifyTime not in", values, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeBetween(Date value1, Date value2) {
            addCriterion("lastNotifyTime between", value1, value2, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andLastnotifytimeNotBetween(Date value1, Date value2) {
            addCriterion("lastNotifyTime not between", value1, value2, "lastnotifytime");
            return (Criteria) this;
        }

        public Criteria andOrglatIsNull() {
            addCriterion("orglat is null");
            return (Criteria) this;
        }

        public Criteria andOrglatIsNotNull() {
            addCriterion("orglat is not null");
            return (Criteria) this;
        }

        public Criteria andOrglatEqualTo(String value) {
            addCriterion("orglat =", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatNotEqualTo(String value) {
            addCriterion("orglat <>", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatGreaterThan(String value) {
            addCriterion("orglat >", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatGreaterThanOrEqualTo(String value) {
            addCriterion("orglat >=", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatLessThan(String value) {
            addCriterion("orglat <", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatLessThanOrEqualTo(String value) {
            addCriterion("orglat <=", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatLike(String value) {
            addCriterion("orglat like", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatNotLike(String value) {
            addCriterion("orglat not like", value, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatIn(List<String> values) {
            addCriterion("orglat in", values, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatNotIn(List<String> values) {
            addCriterion("orglat not in", values, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatBetween(String value1, String value2) {
            addCriterion("orglat between", value1, value2, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglatNotBetween(String value1, String value2) {
            addCriterion("orglat not between", value1, value2, "orglat");
            return (Criteria) this;
        }

        public Criteria andOrglonIsNull() {
            addCriterion("orglon is null");
            return (Criteria) this;
        }

        public Criteria andOrglonIsNotNull() {
            addCriterion("orglon is not null");
            return (Criteria) this;
        }

        public Criteria andOrglonEqualTo(String value) {
            addCriterion("orglon =", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonNotEqualTo(String value) {
            addCriterion("orglon <>", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonGreaterThan(String value) {
            addCriterion("orglon >", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonGreaterThanOrEqualTo(String value) {
            addCriterion("orglon >=", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonLessThan(String value) {
            addCriterion("orglon <", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonLessThanOrEqualTo(String value) {
            addCriterion("orglon <=", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonLike(String value) {
            addCriterion("orglon like", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonNotLike(String value) {
            addCriterion("orglon not like", value, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonIn(List<String> values) {
            addCriterion("orglon in", values, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonNotIn(List<String> values) {
            addCriterion("orglon not in", values, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonBetween(String value1, String value2) {
            addCriterion("orglon between", value1, value2, "orglon");
            return (Criteria) this;
        }

        public Criteria andOrglonNotBetween(String value1, String value2) {
            addCriterion("orglon not between", value1, value2, "orglon");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Integer value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Integer value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Integer value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Integer value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Integer> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Integer> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Integer value1, Integer value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andAltitudeIsNull() {
            addCriterion("altitude is null");
            return (Criteria) this;
        }

        public Criteria andAltitudeIsNotNull() {
            addCriterion("altitude is not null");
            return (Criteria) this;
        }

        public Criteria andAltitudeEqualTo(Integer value) {
            addCriterion("altitude =", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeNotEqualTo(Integer value) {
            addCriterion("altitude <>", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeGreaterThan(Integer value) {
            addCriterion("altitude >", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("altitude >=", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeLessThan(Integer value) {
            addCriterion("altitude <", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeLessThanOrEqualTo(Integer value) {
            addCriterion("altitude <=", value, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeIn(List<Integer> values) {
            addCriterion("altitude in", values, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeNotIn(List<Integer> values) {
            addCriterion("altitude not in", values, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeBetween(Integer value1, Integer value2) {
            addCriterion("altitude between", value1, value2, "altitude");
            return (Criteria) this;
        }

        public Criteria andAltitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("altitude not between", value1, value2, "altitude");
            return (Criteria) this;
        }

        public Criteria andDirectoryIsNull() {
            addCriterion("directory is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryIsNotNull() {
            addCriterion("directory is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryEqualTo(Integer value) {
            addCriterion("directory =", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotEqualTo(Integer value) {
            addCriterion("directory <>", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryGreaterThan(Integer value) {
            addCriterion("directory >", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("directory >=", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryLessThan(Integer value) {
            addCriterion("directory <", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryLessThanOrEqualTo(Integer value) {
            addCriterion("directory <=", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryIn(List<Integer> values) {
            addCriterion("directory in", values, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotIn(List<Integer> values) {
            addCriterion("directory not in", values, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryBetween(Integer value1, Integer value2) {
            addCriterion("directory between", value1, value2, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotBetween(Integer value1, Integer value2) {
            addCriterion("directory not between", value1, value2, "directory");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Integer value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Integer value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Integer value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Integer value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Integer> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Integer> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Integer value1, Integer value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andProtocalIsNull() {
            addCriterion("protocal is null");
            return (Criteria) this;
        }

        public Criteria andProtocalIsNotNull() {
            addCriterion("protocal is not null");
            return (Criteria) this;
        }

        public Criteria andProtocalEqualTo(Integer value) {
            addCriterion("protocal =", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotEqualTo(Integer value) {
            addCriterion("protocal <>", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalGreaterThan(Integer value) {
            addCriterion("protocal >", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocal >=", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalLessThan(Integer value) {
            addCriterion("protocal <", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalLessThanOrEqualTo(Integer value) {
            addCriterion("protocal <=", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalIn(List<Integer> values) {
            addCriterion("protocal in", values, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotIn(List<Integer> values) {
            addCriterion("protocal not in", values, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalBetween(Integer value1, Integer value2) {
            addCriterion("protocal between", value1, value2, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotBetween(Integer value1, Integer value2) {
            addCriterion("protocal not between", value1, value2, "protocal");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
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