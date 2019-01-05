package com.sparrow.controller;

import com.sparrow.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * Created by wancheng on 2018/12/29.
 */
@RestController
@Validated
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "test.do")
    public User test1(@Valid User user){
        System.out.println(user.getUserName());
        return user;
    }
    @RequestMapping(value = "test2.do")
    public String test2(@Email String userEmail){
        System.out.println(userEmail);
        return userEmail;
    }
}
