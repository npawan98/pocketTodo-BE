package com.pockettodo.pockettodo.Logout;

import org.springframework.web.bind.annotation.PostMapping;

public class LogoutController {

    LogoutService logoutService = new LogoutServiceImpl();
    @PostMapping("/logout")
    public String logout() {
        return logoutService.logout();
    }
}
