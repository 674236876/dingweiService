package com.myd.web.model;

import java.util.List;

public class EntgroupInfo {
    private Long groupid;

    private Long entid;

    private String name;

    private String description;

    private Long fathergid;

    private Integer type;

    private Integer isDefault;

    private List<PersonalTerminal> personalTerminals;


    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public Long getEntid() {
        return entid;
    }

    public void setEntid(Long entid) {
        this.entid = entid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getFathergid() {
        return fathergid;
    }

    public void setFathergid(Long fathergid) {
        this.fathergid = fathergid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public List<PersonalTerminal> getPersonalTerminals() {
        return personalTerminals;
    }

    public void setPersonalTerminals(List<PersonalTerminal> personalTerminals) {
        this.personalTerminals = personalTerminals;
    }
}