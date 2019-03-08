package com.sclabs.useraccount.UserAccount.service;

//import com.sclabs.useraccount.UserAccount.common.Name;
import com.sclabs.useraccount.UserAccount.dto.CreateUserDto;
import com.sclabs.useraccount.UserAccount.repository.UserInfo;
import com.sclabs.useraccount.UserAccount.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Component
public class UserCreationService {

    private UserInfoRepository userInfoRepository;

    @Autowired
    public UserCreationService(UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }

    public Long createUser(CreateUserDto createUserDto){
        //UserInfo ui = UserInfo.builder().
        UserInfo userInfo = new UserInfo();
        //Name name = new Name(createUserDto.getFirstName(),createUserDto.getLastName());

        userInfo.setName(createUserDto.getName());
        userInfo.setEmailId(createUserDto.getEmailId());
        userInfo.setPassword(createUserDto.getPassword());
        userInfo.setCreated(Date.from(Instant.now()));

        userInfoRepository.save(userInfo);
        System.out.println(userInfo.getUserId());
        return userInfo.getUserId();
    }
}
