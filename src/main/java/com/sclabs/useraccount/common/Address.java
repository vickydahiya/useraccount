package com.sclabs.useraccount.common;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String homeAddress1;
    private String homeAddress2;
    private String city;
    private String state;
    private String zipCode;

    public Address() {

    }

    public Address(String homeAddress1, String homeAddress2, String city, String state, String zipCode) {
        this.homeAddress1 = homeAddress1;
        this.homeAddress2 = homeAddress2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getHomeAddress1() {
        return homeAddress1;
    }

    public void setHomeAddress1(String homeAddress1) {
        this.homeAddress1 = homeAddress1;
    }

    public String getHomeAddress2() {
        return homeAddress2;
    }

    public void setHomeAddress2(String homeAddress2) {
        this.homeAddress2 = homeAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
