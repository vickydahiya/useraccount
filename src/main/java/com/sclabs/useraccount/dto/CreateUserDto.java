package com.sclabs.useraccount.dto;

import com.sclabs.useraccount.common.Name;
import com.sclabs.useraccount.validator.ValidEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Pattern;

public class CreateUserDto {


    private Name name;
    @NotNull
    @NotBlank
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @NotBlank
    @ValidEmail
    //@Pattern(regexp = "[{a-zA-Z0-9}@{a-zA-Z}.{a-zA-Z}]")
    private String emailId;
    @NotNull
    @Size(min=8, message = "password should be atleast 8 character long")
    private String password;

    private String matchingPassword;

    public CreateUserDto(){

    }

    public CreateUserDto(Name name,String firstName, String lastName, String emailId, String password, String matchingPassword) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
        this.matchingPassword = matchingPassword;
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

    public Name getName() {
        return name;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }
}
