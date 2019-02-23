package com.sclabs.useraccount.UserAccount.controller;

import com.sclabs.useraccount.UserAccount.dto.CreateUserDto;
import com.sclabs.useraccount.UserAccount.service.UserCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCreationController {

    @Autowired
    UserCreationService userCreationService;

    @PostMapping(value = "/users/registration")
    public Long createUser(@RequestBody CreateUserDto createUserDto){
        return userCreationService.createUser(createUserDto);
    }
}
