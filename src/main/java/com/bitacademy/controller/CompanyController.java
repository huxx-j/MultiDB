package com.bitacademy.controller;

import com.bitacademy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    //company 테이블 마이그레이션
    @RequestMapping(value = "/getpushcompanyinfo")
    public void getPushCompanyInfo(){
        companyService.getPushCompanyInfo();
    }
}
