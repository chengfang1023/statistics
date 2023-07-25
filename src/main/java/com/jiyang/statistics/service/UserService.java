package com.jiyang.statistics.service;

import com.jiyang.statistics.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> queryUserList();
}
