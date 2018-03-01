package com.hejia.pisces.controller;

import com.hejia.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * info:
 * Created by shang on 2018/2/28.
 */
@RestController
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return userService.hello();
    }

}
