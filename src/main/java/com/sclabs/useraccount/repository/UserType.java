package com.sclabs.useraccount.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="user_type")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
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
