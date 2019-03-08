package com.sclabs.useraccount.UserAccount.common;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Name {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String middleName;

    Name(){

    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
