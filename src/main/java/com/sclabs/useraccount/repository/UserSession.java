package com.sclabs.useraccount.repository;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity(name="user_session")
public class UserSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long sessionId;

    @OneToOne
    private UserInfo userInfo;

    private Date loginDate;
    private Time loginTime;
    private Time logoutTime;
    private String currentSessionState;
    private String channel;
    private String ipAddress;

    public UserSession() {
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Time getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Time loginTime) {
        this.loginTime = loginTime;
    }

    public Time getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Time logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getCurrentSessionState() {
        return currentSessionState;
    }

    public void setCurrentSessionState(String currentSessionState) {
        this.currentSessionState = currentSessionState;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
