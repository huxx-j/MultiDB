package com.bitacademy.dao;

import com.bitacademy.vo.UsersVo;
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
    //


}
