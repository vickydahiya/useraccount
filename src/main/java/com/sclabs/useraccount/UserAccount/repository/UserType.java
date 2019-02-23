package com.sclabs.useraccount.UserAccount.repository;

import javax.persistence.Entity;

@Entity
public class UserType {
    private Long typeId;
    private String typeName;

    public UserType() {

    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
