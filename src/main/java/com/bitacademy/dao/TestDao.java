package com.bitacademy.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestDao {
    @Autowired
    @Resource(name = "sqlSession")
    private SqlSession sqlSession;

    @Autowired
    @Resource(name = "sqlSession2")
    private SqlSession sqlSession2;


    public void test() {
        String y = sqlSession.selectOne("mysql.test");
        String s = sqlSession2.selectOne("mssql.test");
        System.out.println("my > " + y);
        System.out.println("ms > " + s);
    }
}
