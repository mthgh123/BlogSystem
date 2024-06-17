package com.codesy.blogsystem.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoTest {
    public String DaoTest1() {
        System.out.println("dao打印了");
        return "www";
    }
}
