package com.bitacademy.controller;

import com.bitacademy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/dbtest", method = RequestMethod.GET)
    public void test(){
        testService.test();
    }
}
