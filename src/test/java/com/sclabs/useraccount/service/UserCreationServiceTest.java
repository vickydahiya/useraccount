package com.sclabs.useraccount.service;

import com.sclabs.useraccount.repository.UserInfo;
import com.sclabs.useraccount.repository.UserInfoRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserCreationServiceTest {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    UserInfo userInfo;

    @Autowired
    UserCreationService userCreationService;

    @Before
    public void setValuefor_UserInfo_InBeforeTest(){

    }

    @Test
    public void dummyTest(){

    }
}
