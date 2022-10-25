package com.pockettodo.pockettodo.GetUsers;

import com.pockettodo.pockettodo.GetTodoList.GetTodoListImpl;
import org.springframework.web.bind.annotation.PostMapping;

public class GetUsersController {

    GetUserServiceImpl getUserService = new GetUserServiceImpl();

    @PostMapping("/getUsers")
    public String getUsers() {
        return getUserService.getUsers();
    }
}
