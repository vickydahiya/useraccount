package com.sclabs.useraccount.controller;

import com.sclabs.useraccount.dto.CreateUserDto;
import com.sclabs.useraccount.service.UserCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserCreationController {

    @Autowired
    UserCreationService userCreationService;

   /* @Autowired
    private HttpServletRequest request;*/

    @Autowired
    Environment environmnet;

    @PostMapping(value = "/users/registration")
    public ResponseEntity<Map<String,Long>> createUser(@Valid @RequestBody CreateUserDto createUserDto){
        ResponseEntity<Map<String,Long>> response = null;
        Map<String,Long> user = new HashMap<>();

        //System.out.println(request.getRequestURI());
        System.out.println(environmnet.getActiveProfiles());

        Long id =  userCreationService.createUser(createUserDto);
        if (id != null){
            user.put("id",id);
            response = new ResponseEntity<>(user,HttpStatus.CREATED);
        }
        return response;
    }
}
