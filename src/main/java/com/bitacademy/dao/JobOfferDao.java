package com.bitacademy.dao;

import com.bitacademy.vo.JobOfferVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class JobOfferDao {
    @Autowired
    @Resource(name = "mysqlSession")
    private SqlSession mysqlSession;

    @Autowired
    @Resource(name = "mssqlSession")
    private SqlSession mssqlSession;

    public List<JobOfferVo> getJobOffer(Map<String,Integer> map) {
        return mssqlSession.selectList("ms-joboffer.getJobOffer", map);
    }

    public int pushJobOffer(JobOfferVo jobOfferVo) {
        return mysqlSession.insert("my-joboffer.pushJobOffer", jobOfferVo);
    }
}
