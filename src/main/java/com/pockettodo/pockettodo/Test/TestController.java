package com.pockettodo.pockettodo.Test;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    TestService testService = new TestServiceImpl();
    @GetMapping("/test")
    public String getTest() {
        return testService.getTest();
    }
}
