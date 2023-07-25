package com.jiyang.statistics.mapper;

import com.jiyang.statistics.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper{

    @Select({
            "select * from user"
    })
    List<UserDTO> queryUserList();
}
