package com.codesy.blogsystem.biz.service;

import com.codesy.blogsystem.dao.mapper.UserMapper;
import com.codesy.blogsystem.model.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

}
