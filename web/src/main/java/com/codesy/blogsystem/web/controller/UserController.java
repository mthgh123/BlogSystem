package com.codesy.blogsystem.web.controller;

import com.codesy.blogsystem.biz.service.UserService;
import com.codesy.blogsystem.model.DTO.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    @Tag(name = "/user")
    @Operation(summary = "获取用户信息")
    public User getUser(String name) {
        return userService.getUserByName(name);
    }
}
