package com.sclabs.useraccount.UserAccount.dto;

import com.sclabs.useraccount.UserAccount.common.Name;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserDto {
    @NotNull
    @Size(min=4)
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String emailId;
    @NotNull
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
