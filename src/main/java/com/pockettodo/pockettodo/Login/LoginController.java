package com.pockettodo.pockettodo.Login;

import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {

    LoginService loginService = new LoginServiceImpl();
    @PostMapping("/login")
    public String login() {
        return loginService.login();
    }

    @PostMapping("/createUser")
    public Boolean createUser() {
        return loginService.createUser();
    }
}
