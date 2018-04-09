package com.xxx.pdm.inexp.model;

import java.util.Date;

public class UserInExpType {
    private String userInexpTypeUid;

    private Date rowVersion;

    private Integer rowStatus;

    private String userUid;

    private String inexpTypeName;

    private String iconUid;

    public String getUserInexpTypeUid() {
        return userInexpTypeUid;
    }

    public void setUserInexpTypeUid(String userInexpTypeUid) {
        this.userInexpTypeUid = userInexpTypeUid;
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

    public String getInexpTypeName() {
        return inexpTypeName;
    }

    public void setInexpTypeName(String inexpTypeName) {
        this.inexpTypeName = inexpTypeName;
    }

    public String getIconUid() {
        return iconUid;
    }

    public void setIconUid(String iconUid) {
        this.iconUid = iconUid;
    }
}