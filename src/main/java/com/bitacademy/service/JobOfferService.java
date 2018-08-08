package com.bitacademy.service;

import com.bitacademy.dao.JobOfferDao;
import com.bitacademy.vo.JobOfferVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobOfferService {
    @Autowired
    private JobOfferDao jobOfferDao;

    public void getPushJobOffer() {

        int pushCount = 0;
        for (int i = 9069; i < 20000; i += 1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start",i);
            map.put("end",i+999);
            List<JobOfferVo> list = jobOfferDao.getJobOffer(map);
            if (list.size()!=0) {
              for (JobOfferVo jobOfferVo : list) {
                  System.out.println(jobOfferVo.getCommpany_no());
                  pushCount += jobOfferDao.pushJobOffer(jobOfferVo);
                  System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
              }
            } else {
                break;
            }
        }
        System.out.println("데이터 입력 완료");
    }
}
