package com.myd.web.model;

import java.util.Date;

public class PoiInfo {
    private String id;

    private String entid;

    private String optid;

    private String lat;

    private String lon;

    private Integer zoom = 8;

    private Integer type = 3;

    private String label;

    private Integer usealarm = 1;

    private Integer radius;

    private String position;

    private String phone;

    private String zipcode;

    private String description;

    private Integer isshared = 1;

    private String baidulng;

    private String baidulat;

    private String googlelon;

    private String googlelat;

    private Date uploadtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? "" : id.trim();
    }

    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid == null ? "" : entid.trim();
    }

    public String getOptid() {
        return optid;
    }

    public void setOptid(String optid) {
        this.optid = optid == null ? "" : optid.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? "" : lat.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? "" : lon.trim();
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? "" : label.trim();
    }

    public Integer getUsealarm() {
        return usealarm;
    }

    public void setUsealarm(Integer usealarm) {
        this.usealarm = usealarm;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? "" : position.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? "" : phone.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? "" : zipcode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? "" : description.trim();
    }

    public Integer getIsshared() {
        return isshared;
    }

    public void setIsshared(Integer isshared) {
        this.isshared = isshared;
    }

    public String getBaidulng() {
        return baidulng;
    }

    public void setBaidulng(String baidulng) {
        this.baidulng = baidulng == null ? "" : baidulng.trim();
    }

    public String getBaidulat() {
        return baidulat;
    }

    public void setBaidulat(String baidulat) {
        this.baidulat = baidulat == null ? "" : baidulat.trim();
    }

    public String getGooglelon() {
        return googlelon;
    }

    public void setGooglelon(String googlelon) {
        this.googlelon = googlelon == null ? "" : googlelon.trim();
    }

    public String getGooglelat() {
        return googlelat;
    }

    public void setGooglelat(String googlelat) {
        this.googlelat = googlelat == null ? "" : googlelat.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}