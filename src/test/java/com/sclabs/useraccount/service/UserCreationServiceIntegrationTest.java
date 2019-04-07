package com.sclabs.useraccount.service;

import com.sclabs.useraccount.dto.CreateUserDto;
import com.sclabs.useraccount.repository.UserInfo;
import com.sclabs.useraccount.repository.UserInfoRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserCreationServiceIntegrationTest {

    @Autowired
    UserInfo userInfo;

    @Autowired
    CreateUserDto createUserDto;

    @Autowired
    UserCreationService userCreationService;

    @Before
    public void setValuefor_UserInfo_InBeforeTest(){

    }

    @Test
    public void addAUser(){


        assertEquals("ABC","ABC");
    }

    @Test
    public void dummytestTwo(){
        System.out.println("Pass");
    }
}

