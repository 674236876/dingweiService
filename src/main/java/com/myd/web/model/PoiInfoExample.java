package com.myd.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PoiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoiInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEntidIsNull() {
            addCriterion("ENTID is null");
            return (Criteria) this;
        }

        public Criteria andEntidIsNotNull() {
            addCriterion("ENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEntidEqualTo(String value) {
            addCriterion("ENTID =", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotEqualTo(String value) {
            addCriterion("ENTID <>", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThan(String value) {
            addCriterion("ENTID >", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidGreaterThanOrEqualTo(String value) {
            addCriterion("ENTID >=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThan(String value) {
            addCriterion("ENTID <", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLessThanOrEqualTo(String value) {
            addCriterion("ENTID <=", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidLike(String value) {
            addCriterion("ENTID like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotLike(String value) {
            addCriterion("ENTID not like", value, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidIn(List<String> values) {
            addCriterion("ENTID in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotIn(List<String> values) {
            addCriterion("ENTID not in", values, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidBetween(String value1, String value2) {
            addCriterion("ENTID between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andEntidNotBetween(String value1, String value2) {
            addCriterion("ENTID not between", value1, value2, "entid");
            return (Criteria) this;
        }

        public Criteria andOptidIsNull() {
            addCriterion("OPTID is null");
            return (Criteria) this;
        }

        public Criteria andOptidIsNotNull() {
            addCriterion("OPTID is not null");
            return (Criteria) this;
        }

        public Criteria andOptidEqualTo(String value) {
            addCriterion("OPTID =", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotEqualTo(String value) {
            addCriterion("OPTID <>", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidGreaterThan(String value) {
            addCriterion("OPTID >", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidGreaterThanOrEqualTo(String value) {
            addCriterion("OPTID >=", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidLessThan(String value) {
            addCriterion("OPTID <", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidLessThanOrEqualTo(String value) {
            addCriterion("OPTID <=", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidLike(String value) {
            addCriterion("OPTID like", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotLike(String value) {
            addCriterion("OPTID not like", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidIn(List<String> values) {
            addCriterion("OPTID in", values, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotIn(List<String> values) {
            addCriterion("OPTID not in", values, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidBetween(String value1, String value2) {
            addCriterion("OPTID between", value1, value2, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotBetween(String value1, String value2) {
            addCriterion("OPTID not between", value1, value2, "optid");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("LAT like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("LAT not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("LON is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("LON is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("LON =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("LON <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("LON >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("LON >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("LON <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("LON <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("LON like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("LON not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("LON in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("LON not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("LON between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("LON not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andZoomIsNull() {
            addCriterion("ZOOM is null");
            return (Criteria) this;
        }

        public Criteria andZoomIsNotNull() {
            addCriterion("ZOOM is not null");
            return (Criteria) this;
        }

        public Criteria andZoomEqualTo(Integer value) {
            addCriterion("ZOOM =", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotEqualTo(Integer value) {
            addCriterion("ZOOM <>", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThan(Integer value) {
            addCriterion("ZOOM >", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZOOM >=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThan(Integer value) {
            addCriterion("ZOOM <", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThanOrEqualTo(Integer value) {
            addCriterion("ZOOM <=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomIn(List<Integer> values) {
            addCriterion("ZOOM in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotIn(List<Integer> values) {
            addCriterion("ZOOM not in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomBetween(Integer value1, Integer value2) {
            addCriterion("ZOOM between", value1, value2, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotBetween(Integer value1, Integer value2) {
            addCriterion("ZOOM not between", value1, value2, "zoom");
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

        public Criteria andLabelIsNull() {
            addCriterion("LABEL is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("LABEL =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("LABEL <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("LABEL >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("LABEL <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("LABEL <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("LABEL like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("LABEL not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("LABEL in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("LABEL not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("LABEL between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("LABEL not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andUsealarmIsNull() {
            addCriterion("USEALARM is null");
            return (Criteria) this;
        }

        public Criteria andUsealarmIsNotNull() {
            addCriterion("USEALARM is not null");
            return (Criteria) this;
        }

        public Criteria andUsealarmEqualTo(Integer value) {
            addCriterion("USEALARM =", value, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmNotEqualTo(Integer value) {
            addCriterion("USEALARM <>", value, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmGreaterThan(Integer value) {
            addCriterion("USEALARM >", value, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("USEALARM >=", value, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmLessThan(Integer value) {
            addCriterion("USEALARM <", value, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmLessThanOrEqualTo(Integer value) {
            addCriterion("USEALARM <=", value, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmIn(List<Integer> values) {
            addCriterion("USEALARM in", values, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmNotIn(List<Integer> values) {
            addCriterion("USEALARM not in", values, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmBetween(Integer value1, Integer value2) {
            addCriterion("USEALARM between", value1, value2, "usealarm");
            return (Criteria) this;
        }

        public Criteria andUsealarmNotBetween(Integer value1, Integer value2) {
            addCriterion("USEALARM not between", value1, value2, "usealarm");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Integer value) {
            addCriterion("RADIUS =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Integer value) {
            addCriterion("RADIUS <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Integer value) {
            addCriterion("RADIUS >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RADIUS >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Integer value) {
            addCriterion("RADIUS <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Integer value) {
            addCriterion("RADIUS <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Integer> values) {
            addCriterion("RADIUS in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Integer> values) {
            addCriterion("RADIUS not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("ZIPCODE =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("ZIPCODE <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("ZIPCODE >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIPCODE >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("ZIPCODE <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ZIPCODE <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("ZIPCODE like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("ZIPCODE not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("ZIPCODE in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("ZIPCODE not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("ZIPCODE between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("ZIPCODE not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIssharedIsNull() {
            addCriterion("ISSHARED is null");
            return (Criteria) this;
        }

        public Criteria andIssharedIsNotNull() {
            addCriterion("ISSHARED is not null");
            return (Criteria) this;
        }

        public Criteria andIssharedEqualTo(Integer value) {
            addCriterion("ISSHARED =", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedNotEqualTo(Integer value) {
            addCriterion("ISSHARED <>", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedGreaterThan(Integer value) {
            addCriterion("ISSHARED >", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISSHARED >=", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedLessThan(Integer value) {
            addCriterion("ISSHARED <", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedLessThanOrEqualTo(Integer value) {
            addCriterion("ISSHARED <=", value, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedIn(List<Integer> values) {
            addCriterion("ISSHARED in", values, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedNotIn(List<Integer> values) {
            addCriterion("ISSHARED not in", values, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedBetween(Integer value1, Integer value2) {
            addCriterion("ISSHARED between", value1, value2, "isshared");
            return (Criteria) this;
        }

        public Criteria andIssharedNotBetween(Integer value1, Integer value2) {
            addCriterion("ISSHARED not between", value1, value2, "isshared");
            return (Criteria) this;
        }

        public Criteria andBaidulngIsNull() {
            addCriterion("BAIDULNG is null");
            return (Criteria) this;
        }

        public Criteria andBaidulngIsNotNull() {
            addCriterion("BAIDULNG is not null");
            return (Criteria) this;
        }

        public Criteria andBaidulngEqualTo(String value) {
            addCriterion("BAIDULNG =", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngNotEqualTo(String value) {
            addCriterion("BAIDULNG <>", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngGreaterThan(String value) {
            addCriterion("BAIDULNG >", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngGreaterThanOrEqualTo(String value) {
            addCriterion("BAIDULNG >=", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngLessThan(String value) {
            addCriterion("BAIDULNG <", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngLessThanOrEqualTo(String value) {
            addCriterion("BAIDULNG <=", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngLike(String value) {
            addCriterion("BAIDULNG like", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngNotLike(String value) {
            addCriterion("BAIDULNG not like", value, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngIn(List<String> values) {
            addCriterion("BAIDULNG in", values, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngNotIn(List<String> values) {
            addCriterion("BAIDULNG not in", values, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngBetween(String value1, String value2) {
            addCriterion("BAIDULNG between", value1, value2, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulngNotBetween(String value1, String value2) {
            addCriterion("BAIDULNG not between", value1, value2, "baidulng");
            return (Criteria) this;
        }

        public Criteria andBaidulatIsNull() {
            addCriterion("BAIDULAT is null");
            return (Criteria) this;
        }

        public Criteria andBaidulatIsNotNull() {
            addCriterion("BAIDULAT is not null");
            return (Criteria) this;
        }

        public Criteria andBaidulatEqualTo(String value) {
            addCriterion("BAIDULAT =", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatNotEqualTo(String value) {
            addCriterion("BAIDULAT <>", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatGreaterThan(String value) {
            addCriterion("BAIDULAT >", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatGreaterThanOrEqualTo(String value) {
            addCriterion("BAIDULAT >=", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatLessThan(String value) {
            addCriterion("BAIDULAT <", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatLessThanOrEqualTo(String value) {
            addCriterion("BAIDULAT <=", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatLike(String value) {
            addCriterion("BAIDULAT like", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatNotLike(String value) {
            addCriterion("BAIDULAT not like", value, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatIn(List<String> values) {
            addCriterion("BAIDULAT in", values, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatNotIn(List<String> values) {
            addCriterion("BAIDULAT not in", values, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatBetween(String value1, String value2) {
            addCriterion("BAIDULAT between", value1, value2, "baidulat");
            return (Criteria) this;
        }

        public Criteria andBaidulatNotBetween(String value1, String value2) {
            addCriterion("BAIDULAT not between", value1, value2, "baidulat");
            return (Criteria) this;
        }

        public Criteria andGooglelonIsNull() {
            addCriterion("GOOGLELON is null");
            return (Criteria) this;
        }

        public Criteria andGooglelonIsNotNull() {
            addCriterion("GOOGLELON is not null");
            return (Criteria) this;
        }

        public Criteria andGooglelonEqualTo(String value) {
            addCriterion("GOOGLELON =", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonNotEqualTo(String value) {
            addCriterion("GOOGLELON <>", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonGreaterThan(String value) {
            addCriterion("GOOGLELON >", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonGreaterThanOrEqualTo(String value) {
            addCriterion("GOOGLELON >=", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonLessThan(String value) {
            addCriterion("GOOGLELON <", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonLessThanOrEqualTo(String value) {
            addCriterion("GOOGLELON <=", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonLike(String value) {
            addCriterion("GOOGLELON like", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonNotLike(String value) {
            addCriterion("GOOGLELON not like", value, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonIn(List<String> values) {
            addCriterion("GOOGLELON in", values, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonNotIn(List<String> values) {
            addCriterion("GOOGLELON not in", values, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonBetween(String value1, String value2) {
            addCriterion("GOOGLELON between", value1, value2, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelonNotBetween(String value1, String value2) {
            addCriterion("GOOGLELON not between", value1, value2, "googlelon");
            return (Criteria) this;
        }

        public Criteria andGooglelatIsNull() {
            addCriterion("GOOGLELAT is null");
            return (Criteria) this;
        }

        public Criteria andGooglelatIsNotNull() {
            addCriterion("GOOGLELAT is not null");
            return (Criteria) this;
        }

        public Criteria andGooglelatEqualTo(String value) {
            addCriterion("GOOGLELAT =", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatNotEqualTo(String value) {
            addCriterion("GOOGLELAT <>", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatGreaterThan(String value) {
            addCriterion("GOOGLELAT >", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatGreaterThanOrEqualTo(String value) {
            addCriterion("GOOGLELAT >=", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatLessThan(String value) {
            addCriterion("GOOGLELAT <", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatLessThanOrEqualTo(String value) {
            addCriterion("GOOGLELAT <=", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatLike(String value) {
            addCriterion("GOOGLELAT like", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatNotLike(String value) {
            addCriterion("GOOGLELAT not like", value, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatIn(List<String> values) {
            addCriterion("GOOGLELAT in", values, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatNotIn(List<String> values) {
            addCriterion("GOOGLELAT not in", values, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatBetween(String value1, String value2) {
            addCriterion("GOOGLELAT between", value1, value2, "googlelat");
            return (Criteria) this;
        }

        public Criteria andGooglelatNotBetween(String value1, String value2) {
            addCriterion("GOOGLELAT not between", value1, value2, "googlelat");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterionForJDBCDate("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterionForJDBCDate("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterionForJDBCDate("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uploadTime not between", value1, value2, "uploadtime");
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