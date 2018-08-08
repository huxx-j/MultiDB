package com.bitacademy.controller;

import com.bitacademy.service.JobOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobOfferController {
    @Autowired
    private JobOfferService jobOfferService;

    @RequestMapping(value = "/getpushjoboffer")
    public void getPushJobOffer(){
        jobOfferService.getPushJobOffer();
    }
}
