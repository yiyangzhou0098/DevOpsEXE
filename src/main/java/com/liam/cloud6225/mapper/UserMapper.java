package com.liam.cloud6225.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liam.cloud6225.model.Users;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
//    @Select("select * from users")
    public List<Users> selectAllUsers();
}
