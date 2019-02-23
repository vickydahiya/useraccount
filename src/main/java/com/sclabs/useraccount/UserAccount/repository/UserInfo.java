package com.sclabs.useraccount.UserAccount.repository;

import com.sclabs.useraccount.UserAccount.common.Name;
import com.sun.istack.internal.NotNull;
import lombok.Builder;

import javax.persistence.*;
import java.util.Date;

@Builder
@Entity(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long userId;

    @NotNull
    private String emailId;

    @Embedded
    private Name name;

    private String password;

    private String type;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created;


    public UserInfo(){

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
