package com.liam.cloud6225.controller;


import com.liam.cloud6225.mapper.UserMapper;
import com.liam.cloud6225.model.Users;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("/api")
@RestController
public class UsersController {
    private UserMapper userMapper;

    public UsersController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("showAllUsers")
    List<Users> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

}
