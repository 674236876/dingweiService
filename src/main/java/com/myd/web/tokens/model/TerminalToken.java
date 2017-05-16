package com.myd.web.tokens.model;

/**
 * Created by zhugp on 2017/5/15.
 */
public class TerminalToken extends Token{

    private String ptId;

    private String ptName;

    private String phoneNum;

    public TerminalToken(String ptId,String token) {
        this.token = token;
        this.ptId = ptId;
    }

    public String getPtId() {
        return ptId;
    }

    public void setPtId(String ptId) {
        this.ptId = ptId;
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
