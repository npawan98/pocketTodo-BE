package com.pockettodo.pockettodo.GetTodoList;

import com.pockettodo.pockettodo.Test.TestService;
import com.pockettodo.pockettodo.Test.TestServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;

public class GetTodoListController {

    GetTodoListImpl getTodoListService = new GetTodoListImpl();

    @GetMapping("/getList")
    public String getTodoList() {
        return getTodoListService.getTodoList();
    }
}
