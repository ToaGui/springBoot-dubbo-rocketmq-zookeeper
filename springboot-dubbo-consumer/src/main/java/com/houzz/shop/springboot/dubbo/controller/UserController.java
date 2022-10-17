package com.houzz.shop.springboot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.houzz.shop.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HouZZ
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return userService.sayHello(name);
    }
}
