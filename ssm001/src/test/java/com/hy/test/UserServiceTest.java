package com.hy.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hy.baseTest.SpringTestCase;
import com.hy.domain.User;
import com.hy.service.UserService;

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.getUserById((long) 1);
        System.out.println("userLoginName:" + user.getLoginName());
    }  
}
