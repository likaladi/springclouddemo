package com.liwen.demo.controller;

import com.liwen.demo.pojo.User;
import com.liwen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id) {
        User user = null;
        try{
            user = this.userService.queryById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

}
