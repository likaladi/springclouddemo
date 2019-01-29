package com.liwen.demo.controller;

import com.liwen.demo.pojo.User;
import com.liwen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consume")
public class ConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping
    //请求路径http://localhost:8080/consume?ids=4,5,6
    public List<User> consume(@RequestParam("ids") List<Integer> ids) {
        return userService.queryUserByIds(ids);
    }
}

