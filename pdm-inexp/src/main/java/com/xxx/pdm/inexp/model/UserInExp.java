package com.xxx.pdm.inexp.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserInExp {
    private String userInexpUid;

    private Date rowVersion;

    private Integer rowStatus;

    private String userUid;

    private Integer year;

    private Integer month;

    private String inexpTitle;

    private String inexpType;

    private BigDecimal money;

    private String userInexpTypeUid;

    private String inexpTypeName;

    private Date inexpDate;

    public String getUserInexpUid() {
        return userInexpUid;
    }

    public void setUserInexpUid(String userInexpUid) {
        this.userInexpUid = userInexpUid;
    }

    public Date getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Date rowVersion) {
        this.rowVersion = rowVersion;
    }

    public Integer getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(Integer rowStatus) {
        this.rowStatus = rowStatus;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getInexpTitle() {
        return inexpTitle;
    }

    public void setInexpTitle(String inexpTitle) {
        this.inexpTitle = inexpTitle;
    }

    public String getInexpType() {
        return inexpType;
    }

    public void setInexpType(String inexpType) {
        this.inexpType = inexpType;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUserInexpTypeUid() {
        return userInexpTypeUid;
    }

    public void setUserInexpTypeUid(String userInexpTypeUid) {
        this.userInexpTypeUid = userInexpTypeUid;
    }

    public String getInexpTypeName() {
        return inexpTypeName;
    }

    public void setInexpTypeName(String inexpTypeName) {
        this.inexpTypeName = inexpTypeName;
    }

    public Date getInexpDate() {
        return inexpDate;
    }

    public void setInexpDate(Date inexpDate) {
        this.inexpDate = inexpDate;
    }
}