package com.pockettodo.pockettodo.Login;

public class LoginServiceImpl implements LoginService {

    public String login() {
        // TODO: Integrate auth0 SSO for seamless login
        return "login successful";
    }

    public Boolean createUser() {
        return true;
    }
}
