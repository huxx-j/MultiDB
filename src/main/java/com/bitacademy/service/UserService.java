package com.bitacademy.service;

import com.bitacademy.dao.UserDao;
import com.bitacademy.vo.LicenseVo;
import com.bitacademy.vo.UserSchoolVo;
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
        for (int i=1; i<54000; i+=1000) {
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
            } else {
                break;
            }
        }
        System.out.println("데이터 입력 완료");
    }

    public void getpushuserSchool() {
        int pushCount=0;
        int empty=0;
        int index = 0;
        for (int i=1; i<64000; i+=1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i+999);
            List<UserSchoolVo> list = userDao.getUserschool(map);
            if (list.size()!=0) {
                for (UserSchoolVo userSchoolVo : list) {
                    index++;
                    System.out.print("데이터 index > " + index + "  //  ");
                    int flag = userDao.getVerification(userSchoolVo.getUser_no());
                    if (flag!=0) {
                        System.out.print("User_no > " + userSchoolVo.getUser_no() + "  //  ");
                        pushCount += userDao.pushUserSchool(userSchoolVo);
                        System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
                    } else { //참조할 값이 없으면 저장하지 않음
                        System.out.println("User_no 없음");
                        empty++;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(pushCount + "개 데이터 입력 완료" + empty + "개 User_no 없음");

    }

    public void getpushapplication() {
        userDao.getapplication();

//        userDao.pushapplication();
    }

    public void getPushLicense() {
        int pushCount=0;
        int empty=0;
        int index = 0;
        for (int i=1; i<12000; i+=1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i+999);
            List<LicenseVo> list = userDao.getLicense(map);

            if (list.size()!=0) {
                for (LicenseVo licenseVo : list) {
                    index++;
                    System.out.print("데이터 index > " + index + "  //  User_no > " + licenseVo.getUser_no() + "  //  ");
                    int flag = userDao.getVerification(licenseVo.getUser_no());
                    if (flag!=0) {
//                        licenseVo.setLiceName((licenseVo.getLiceName().equals(""))?null:licenseVo.getLiceName());
//                        licenseVo.setAcquireDate((licenseVo.getAcquireDate().equals(""))?null:licenseVo.getAcquireDate());
//                        licenseVo.setIssueOrgan((licenseVo.getIssueOrgan().equals(""))?null:licenseVo.getIssueOrgan());
//                        licenseVo.setScore((licenseVo.getScore().equals(""))?null:licenseVo.getScore());
//                        System.out.print(licenseVo.toString() + "  //  ");
                        System.out.print("flag > " + flag + "  //  ");
                        pushCount += userDao.pushLicense(licenseVo);
                        System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
                    } else { //참조할 값이 없으면 저장하지 않음
                        System.out.println("flag > " + flag);
                        empty++;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(pushCount + "개 데이터 입력 완료" + empty + "개 User_no 없음");
    }
}
