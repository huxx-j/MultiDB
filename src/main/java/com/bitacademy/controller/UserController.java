package com.bitacademy.controller;

import com.bitacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //유저 기본정보를 마이그레이션하는 코드
    @RequestMapping(value = "/getpushuserinfo")
    public void getPushUserInfo() {
        userService.getUserInfo();
    }
}
