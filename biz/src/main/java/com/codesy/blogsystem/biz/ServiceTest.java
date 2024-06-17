package com.codesy.blogsystem.biz;

import com.codesy.blogsystem.dao.DaoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {
    @Autowired
    DaoTest daoTest;

    public void ServiceTest1() {
        System.out.println("ServiceTest打印了");
        daoTest.DaoTest1();
    }
}
