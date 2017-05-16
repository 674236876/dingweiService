package com.myd.web.model;

import java.util.Date;

public class PersonalTerminal {
    private Long id;

    private Long groupid;

    private String ptname;

    private String imsi;

    private String phonenumber;

    private Long imageid;

    private String description;

    private Date registtime;

    private Date activetime;

    private Date gpstime;

    private Date lastnotifytime;

    private String orglat;

    private String orglon;

    private Integer speed;

    private Integer altitude;

    private Integer directory;

    private Integer state;

    private Integer online;

    private Integer protocal;

    private Integer active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getPtname() {
        return ptname;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname == null ? null : ptname.trim();
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public Date getActivetime() {
        return activetime;
    }

    public void setActivetime(Date activetime) {
        this.activetime = activetime;
    }

    public Date getGpstime() {
        return gpstime;
    }

    public void setGpstime(Date gpstime) {
        this.gpstime = gpstime;
    }

    public Date getLastnotifytime() {
        return lastnotifytime;
    }

    public void setLastnotifytime(Date lastnotifytime) {
        this.lastnotifytime = lastnotifytime;
    }

    public String getOrglat() {
        return orglat;
    }

    public void setOrglat(String orglat) {
        this.orglat = orglat == null ? null : orglat.trim();
    }

    public String getOrglon() {
        return orglon;
    }

    public void setOrglon(String orglon) {
        this.orglon = orglon == null ? null : orglon.trim();
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Integer getDirectory() {
        return directory;
    }

    public void setDirectory(Integer directory) {
        this.directory = directory;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getProtocal() {
        return protocal;
    }

    public void setProtocal(Integer protocal) {
        this.protocal = protocal;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}