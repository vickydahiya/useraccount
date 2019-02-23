package com.sclabs.useraccount.UserAccount.dto;

import com.sclabs.useraccount.UserAccount.common.Name;

public class CreateUserDto {
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;

    public CreateUserDto(){

    }

    public CreateUserDto(String firstName, String lastName, String emailId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }
}
