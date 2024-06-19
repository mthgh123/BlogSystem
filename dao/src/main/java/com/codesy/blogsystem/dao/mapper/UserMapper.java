package com.codesy.blogsystem.dao.mapper;

import com.codesy.blogsystem.model.DTO.User;

public interface UserMapper {
    User getUserByName(String name);

}
