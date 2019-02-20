package com.sclabs.useraccount.UserAccount.repository;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
    @Id
    @NotNull
    long userId;

    String emailId;
    String password;
    String type
}
