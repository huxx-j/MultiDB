package com.bitacademy.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestDao {
    @Autowired
    @Resource(name = "mysqlSession")
    private SqlSession mysqlSession;

    @Autowired
    @Resource(name = "mssqlSession")
    private SqlSession mssqlSession;


    public void test() {
        String y = mysqlSession.selectOne("mysql.test");
        String s = mssqlSession.selectOne("mssql.test");
        System.out.println("my > " + y);
        System.out.println("ms > " + s);
    }
}
