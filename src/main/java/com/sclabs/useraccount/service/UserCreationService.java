package com.sclabs.useraccount.service;

//import Name;
import com.sclabs.useraccount.dto.CreateUserDto;
import com.sclabs.useraccount.repository.UserInfo;
import com.sclabs.useraccount.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.Date;

@Component
public class UserCreationService {

    private UserInfoRepository userInfoRepository;

    @Autowired
    public UserCreationService(UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }


    @Transactional
    public UserInfo createUser(CreateUserDto createUserDto){
        //UserInfo ui = UserInfo.builder().
        UserInfo userInfo = new UserInfo();
        //Name name = new Name(createUserDto.getFirstName(),createUserDto.getLastName());

        userInfo.setName(createUserDto.getName());
        userInfo.setEmailId(createUserDto.getEmailId());
        userInfo.setPassword(createUserDto.getPassword());
        userInfo.setCreated(Date.from(Instant.now()));

        userInfo = userInfoRepository.save(userInfo);
        //System.out.println(userInfo.getUserId());
        return userInfo;
    }
}
