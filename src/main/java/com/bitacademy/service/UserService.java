package com.bitacademy.service;

import com.bitacademy.dao.UserDao;
import com.bitacademy.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //유저 기본정보를 마이그레이션하는 코드
    public void getUserInfo(){
        int pushCount=0;
        for (int i=30511; i<54000; i+=1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i+999);
            List<UsersVo> list = userDao.getUserInfo(map);
            if (list.size()!=0) {
                for (UsersVo usersVo : list) {
                    if (usersVo.getGender().equals("")) {
                        usersVo.setGender("9");//성별데이터가 없으면 9로 바꿔서 입력 나중에 default 값을 null로 주고 해보기
                    }
                    pushCount += userDao.pushUserInfo(usersVo);
                    System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
                }
            }
        }
        System.out.println("데이터 입력 완료");
    }
}
