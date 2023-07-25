package com.jiyang.statistics.service.impl;

import com.jiyang.statistics.dto.UserDTO;
import com.jiyang.statistics.mapper.UserMapper;
import com.jiyang.statistics.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<UserDTO> queryUserList() {
        return userMapper.queryUserList();
    }
}
