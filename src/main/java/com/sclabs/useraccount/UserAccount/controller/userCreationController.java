package com.sclabs.useraccount.UserAccount.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userCreationController {
    @PostMapping(value = "/users/registration")
    public void createUser(){

    }
}
