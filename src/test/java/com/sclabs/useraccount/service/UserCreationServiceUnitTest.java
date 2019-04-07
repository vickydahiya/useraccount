package com.sclabs.useraccount.service;

import com.sclabs.useraccount.common.Name;
import com.sclabs.useraccount.dto.CreateUserDto;
import com.sclabs.useraccount.repository.UserInfo;
import com.sclabs.useraccount.repository.UserInfoRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserCreationServiceUnitTest {

    @Mock
    UserInfoRepository userInfoRepository; //= mock(UserInfoRepository.class);

    @InjectMocks
    UserCreationService userCreationService;

    private CreateUserDto createUserDto;
    private UserInfo mockUserInfo;

    @Before
    public void setUp(){
        //userCreationService = new UserCreationService(userInfoRepository);
        MockitoAnnotations.initMocks(this);
    }

    @Before
    public void setup_UserInfo_Data_Before_Every_Test(){

        Name name = new Name("Vikas","Dahiya");
        createUserDto = new CreateUserDto(name,"Vikas","dahiya","abc@xyz.com","myPassword1!","myPassword1!");

        //Name name = new Name("Vikas","Dahiya");
        mockUserInfo = new UserInfo();
        mockUserInfo.setUserId(1L);
        mockUserInfo.setName(name);
        mockUserInfo.setEmailId("abc@xyz.com");
    }



    @Test
    public void addUserServiceTestWithRightUserReturn(){

        //UserInfoRepository userInfoRepository = mock(UserInfoRepository.class);

        //@InjectMocks
        //UserCreationService userCreationService = new UserCreationService(userInfoRepository);

        when(userInfoRepository.save(any(UserInfo.class))).thenReturn(mockUserInfo);
        UserInfo mockUserInfoData = userCreationService.createUser(createUserDto);

        Long expectedId = 1L;
        assertEquals(expectedId,mockUserInfoData.getUserId());
    }

    @Test
    public void addUserServiceTestWithWrongUserReturn(){
        when(userInfoRepository.save(any(UserInfo.class))).thenReturn(mockUserInfo);
        UserInfo mockUserInfoData = userCreationService.createUser(createUserDto);

        Long expectedId = 2L;
        assertNotEquals(expectedId,mockUserInfoData.getUserId());

    }

}
