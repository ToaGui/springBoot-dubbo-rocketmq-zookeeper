package com.houzz.shop.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.houzz.shop.service.UserService;
import org.springframework.stereotype.Component;


/**
 * @author HouZZ
 **/
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
