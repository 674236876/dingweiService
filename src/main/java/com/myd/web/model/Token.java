package com.myd.web.model;

/**
 * Created by zhugp on 2017/3/28.
 */
public class Token {
    private String ptId;
    private String token;
    private String ptName;
    private String phoneNum;

    public Token(String ptId, String token) {
        this.ptId = ptId;
        this.token = token;
    }

    public String getPtId() {
        return ptId;
    }

    public void setPtId(String ptId) {
        this.ptId = ptId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
