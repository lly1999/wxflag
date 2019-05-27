package wxflag.wxflag_44.entity;

import java.util.Date;

public class Flag {
    private Integer flagID;
    private Integer openID;
    private Character userID;
    private Integer joinNum;
    private Integer niceNum;
    private Integer reportNum;
    private Date flagTime;

    public Integer getFlagID() {
        return flagID;
    }

    public void setFlagID(Integer flagID) {
        this.flagID = flagID;
    }

    public Integer getOpenID() {
        return openID;
    }

    public void setOpenID(Integer openID) {
        this.openID = openID;
    }

    public Character getUserID() {
        return userID;
    }

    public void setUserID(Character userID) {
        this.userID = userID;
    }

    public Integer getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(Integer joinNum) {
        this.joinNum = joinNum;
    }

    public Integer getNiceNum() {
        return niceNum;
    }

    public void setNiceNum(Integer niceNum) {
        this.niceNum = niceNum;
    }

    public Integer getReportNum() {
        return reportNum;
    }

    public void setReportNum(Integer reportNum) {
        this.reportNum = reportNum;
    }

    public Date getFlagTime() {
        return flagTime;
    }

    public void setFlagTime(Date flagTime) {
        this.flagTime = flagTime;
    }
}
