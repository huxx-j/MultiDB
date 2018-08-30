package com.bitacademy.dao;

import com.bitacademy.vo.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
    @Autowired
    @Resource(name = "mysqlSession")
    private SqlSession mysqlSession;

    @Autowired
    @Resource(name = "mssqlSession")
    private SqlSession mssqlSession;

    //유저 기본정보를 마이그레이션하는 코드
    public List<UsersVo> getUserInfo(Map<String, Integer> range) {
        return mssqlSession.selectList("ms-user.getUserInfo", range);
    }
    public int pushUserInfo(UsersVo usersVo) {
        return mysqlSession.insert("my-user.pushUserInfo", usersVo);
    }

    public List<UserSchoolVo> getUserschool(Map<String,Integer> map) {
        return mssqlSession.selectList("ms-userSchool.getUserSchool", map);
    }

    public int pushUserSchool(UserSchoolVo userSchoolVo) {
        return mysqlSession.insert("my-userSchool.pushUserSchool", userSchoolVo);
    }

    public int getVerification(int user_no) {
        return mysqlSession.selectOne("my-userSchool.getVerification", user_no);
    }

    public List<ApplyInfoVo> getapplication(Map<String, Integer> map) {
        return mssqlSession.selectList("ms-apply.getapplication", map);
    }

    public int pushapplication(ApplyInfoVo applyInfoVo) {
        return mysqlSession.insert("my-apply.pushapplication", applyInfoVo);
    }

    public List<LicenseVo> getLicense(Map<String, Integer> map) {
        return mssqlSession.selectList("ms-license.getLicense", map);
    }

    public int pushLicense(LicenseVo licenseVo) {
        return mysqlSession.insert("my-license.pushLicense", licenseVo);
    }

    public List<CareerVo> getCareer(Map<String,Integer> map) {
        return mssqlSession.selectList("ms-career.getCareer",map);
    }

    public int pushCareer(CareerVo careerVo) {
        return mysqlSession.insert("my-career.pushCareer", careerVo);
    }

    public List<TrainingVo> getTraining(Map<String,Integer> map) {
        return mssqlSession.selectList("ms-training.getTraining", map);
    }

    public int pushTraining(TrainingVo trainingVo) {
        return mysqlSession.insert("my-training.pushTraining", trainingVo);
    }

    public List<UsersVo> getGenderInfo(int map) {
        return mysqlSession.selectList("my-user.getGenderInfo", map);
    }

    public int upGender(UsersVo usersVo) {
        return mysqlSession.update("my-user.upGender", usersVo);
    }

    public List<UsersVo> getMemberOut(Map<String,Integer> map) {
        return mssqlSession.selectList("ms-user.getMemberOut", map);
    }


    public int pushMemberOut(UsersVo usersVo) {
        return mysqlSession.insert("my-user.pushMemberOut", usersVo);
    }

    public List<UsersVo> getAdress(Map<String,Integer> map) {
        return mssqlSession.selectList("ms-user.getAdress", map);
    }

    public int pushAdress(UsersVo usersVo) {
        return mysqlSession.insert("my-user.pushAdress", usersVo);

    }
}
