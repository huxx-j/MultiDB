package com.bitacademy.service;

import com.bitacademy.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public void test() {
        testDao.test();

    }
}
