package com.hejia.pisces.service;


import com.hejia.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * info:
 * Created by shang on 2018/2/28.
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public String hello() {
        return "hello dubbo";
    }
}
