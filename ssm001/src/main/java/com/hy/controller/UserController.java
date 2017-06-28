package com.hy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hy.domain.User;
import com.hy.service.UserService;

@Controller  
public class UserController {  

    @Resource  
    private UserService userService;  

    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.getUserById((long) 1);
        mav.addObject("user", user);   
        return mav;    
    }    
}  