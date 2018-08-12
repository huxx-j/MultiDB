package com.bitacademy.service;

import com.bitacademy.dao.UserDao;
import com.bitacademy.vo.*;
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
        for (int i=53422; i<54000; i+=1000) {
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
        int index = 21932;
        for (int i= 28635; i<64000; i+=1000) {
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

//    public void getpushapplication() {
//        int pushCount=0;
//        int empty=0;
//        for (int i=1; i<12000; i+=1000) {
//            Map<String, Integer> appmap = new HashMap<>();
//            appmap.put("start", i);
//            appmap.put("end", i+999);
//            List<ApplyInfoVo> list = userDao.getapplication(appmap);
//
//            if (list.size()!=0) {
//                for (ApplyInfoVo applyInfoVo: list) {
//                    System.out.print("Row Num > " + applyInfoVo.getSeq() + "  //  User_no > " + applyInfoVo.getUser_no() + "  //  ");
//                    userDao.getStat(applyInfoVo.getUser_no(),applyInfoVo.getCurriculum_no());
//                    int flag = userDao.getVerification(applyInfoVo.getUser_no());
//                    if (flag!=0) {
//                        System.out.print("flag > " + flag + "  //  ");
//                        pushCount += userDao.pushapplication(applyInfoVo);
//                        System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
//                    } else { //참조할 값이 없으면 저장하지 않음
//                        System.out.println("flag > " + flag);
//                        empty++;
//                    }
//                }
//            } else {
//                break;
//            }
//        }
//        System.out.println(pushCount + "개 데이터 입력 완료" + empty + "개 User_no 없음");
//    }

    public void getPushLicense() {
        int pushCount=0;
        int empty=0;
        for (int i=1; i<12000; i+=1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i+999);
            List<LicenseVo> list = userDao.getLicense(map);

            if (list.size()!=0) {
                for (LicenseVo licenseVo : list) {
                    System.out.print("seq > " + licenseVo.getSeq() + "  //  User_no > " + licenseVo.getUser_no() + "  //  ");
                    int flag = userDao.getVerification(licenseVo.getUser_no());
                    if (flag!=0) {
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

    public void getPushCareer() {
        int pushCount=0;
        int empty=0;
        for (int i=1163; i<20000; i+=1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i+999);
            List<CareerVo> list = userDao.getCareer(map);

            if (list.size()!=0) {
                for (CareerVo careerVo : list) {
                    System.out.print("seq > " + careerVo.getSeq() + "  //  User_no > " + careerVo.getUser_no() + "  //  ");
                    int flag = userDao.getVerification(careerVo.getUser_no());
                    if (flag!=0) {
                        System.out.print("flag > " + flag + "  //  ");
                        pushCount += userDao.pushCareer(careerVo);
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

    public void getPushTraining() {
        int pushCount=0;
        int empty=0;
        for (int i=1; i<20000; i+=1000) {
            Map<String, Integer> map = new HashMap<>();
            map.put("start", i);
            map.put("end", i+999);
            List<TrainingVo> list = userDao.getTraining(map);

            if (list.size()!=0) {
                for (TrainingVo trainingVo : list) {
                    System.out.print("seq > " + trainingVo.getSeq() + "  //  User_no > " + trainingVo.getUser_no() + "  //  ");
                    int flag = userDao.getVerification(trainingVo.getUser_no());
                    if (flag!=0) {
                        System.out.print("flag > " + flag + "  //  ");
                        pushCount += userDao.pushTraining(trainingVo);
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

    public void modGender() {
        int pushCount = 0;
        int empty = 0;
        for (int i = 27000; i < 60000; i += 1000) {
            List<UsersVo> list = userDao.getGenderInfo(i);

            if (list.size() != 0) {
                for (UsersVo usersVo : list) {
                    if (!usersVo.getStudResNum().equals("1") && !usersVo.getStudResNum().equals("2") && !usersVo.getStudResNum().equals("3") && !usersVo.getStudResNum().equals("4") && !usersVo.getStudResNum().equals("5") && !usersVo.getStudResNum().equals("6")) {
                        usersVo.setStudResNum("9");
                    }
                    System.out.print("User_no > " + usersVo.getUser_no() + "  //  Gender > " + usersVo.getStudResNum() + "  //  ");
                    pushCount += userDao.upGender(usersVo);
                    System.out.println(pushCount + "개의 데이터가 입력 되었습니다.");
                }
            } else {
                break;
            }
        }

    }
}
