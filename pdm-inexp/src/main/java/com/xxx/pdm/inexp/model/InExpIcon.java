package com.xxx.pdm.inexp.model;

import java.util.Date;

public class InExpIcon {
    private String iconUid;

    private Date rowVersion;

    private Integer rowStatus;

    private String icon;

    private String iconDesc;

    public String getIconUid() {
        return iconUid;
    }

    public void setIconUid(String iconUid) {
        this.iconUid = iconUid;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconDesc() {
        return iconDesc;
    }

    public void setIconDesc(String iconDesc) {
        this.iconDesc = iconDesc;
    }
}