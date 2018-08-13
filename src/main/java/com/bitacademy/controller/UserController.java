package com.bitacademy.controller;

import com.bitacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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

    @RequestMapping(value = "/getpushuserSchool")
    public void getpushuserSchool(){
        userService.getpushuserSchool();
    }

    //state(비트생) 정보 찾을때까지 보류
//    @RequestMapping(value = "/getpushapplication")
//    public void getpushapplication(){
//        userService.getpushapplication();
//    }

    @RequestMapping(value = "/getPushLicense")
    public void getpushlicense(){
        userService.getPushLicense();
    }

    @RequestMapping(value = "/getPushCareer")
    public void getPushCareer(){
        userService.getPushCareer();
    }

    @RequestMapping(value = "/getPushTraining")
    private void getPushTraining(){
        userService.getPushTraining();
    }

    @RequestMapping(value = "/modGender")
    public void modGender (){
        userService.modGender();
    }

    @RequestMapping(value = "/getPushMemberOut")
    public void getPushMemberOut(){
        userService.getPushMemberOut();
    }
}
