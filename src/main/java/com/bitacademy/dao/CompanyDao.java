package com.bitacademy.dao;

import com.bitacademy.vo.CompanyVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CompanyDao {
    @Autowired
    @Resource(name = "mysqlSession")
    private SqlSession mysqlSession;

    @Autowired
    @Resource(name = "mssqlSession")
    private SqlSession mssqlSession;

    public List<CompanyVo> getCompanyInfo(Map<String, Integer> map) {
        return mssqlSession.selectList("ms-company.getCompanyInfo", map);
    }

    public int pushCompanyInfo(CompanyVo companyVo) {
        return mysqlSession.insert("my-company.pushCompanyInfo", companyVo);
    }
}
