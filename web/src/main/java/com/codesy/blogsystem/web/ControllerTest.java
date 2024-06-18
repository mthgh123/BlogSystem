package com.codesy.blogsystem.web;

import com.codesy.blogsystem.biz.ServiceTest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Autowired
    ServiceTest serviceTest;

    @GetMapping("/test")
    @Tag(name = "/test")
    @Operation(summary = "调用/test测试接口")
    public String ControllerTest1() {
        System.out.println("ControllerTest1打印了");
        serviceTest.ServiceTest1();
        return "成功";
    }
}
