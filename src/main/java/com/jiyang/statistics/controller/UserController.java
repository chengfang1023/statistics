package com.jiyang.statistics.controller;

import com.jiyang.statistics.dto.UserDTO;
import com.jiyang.statistics.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService  userService;

    @GetMapping("/queryUserList")
    public List<UserDTO> queryUserList() {
        return userService.queryUserList();
    }
}
