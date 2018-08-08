package com.bitacademy.service;

import com.bitacademy.dao.CompanyDao;
import com.bitacademy.vo.CompanyVo;
import com.bitacademy.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;

    public void getPushCompanyInfo() {
        int pushCount = 0;
        for (int i = 9125; i < 20000; i += 1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i + 999);
//            map.put("start", 1);
//            map.put("end", 5);
            List<CompanyVo> list = companyDao.getCompanyInfo(map);

            if (list.size() != 0) {
                for (CompanyVo companyVo : list) {
                    pushCount += companyDao.pushCompanyInfo(companyVo);
                    System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
                }
            } else {
                break;
            }
        }
        System.out.println("데이터 입력 완료");
    }
}
