package com.gexiao.userservice.controller;

import com.gexiao.userservice.entity.User;
import com.gexiao.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gexiao
 * @date 2019/1/30 11:14
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("add")
    public String add() {
        User user = new User();
        user.setUsername("小明");
        user.setAge(10);
        user.setSex("男");
        userService.save(user);
        User user1 = new User();
        user1.setUsername("小红");
        user1.setAge(11);
        user1.setSex("女");
        userService.save(user1);
        return "success";
    }

    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }
}
