package org.example.demorestapi2.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.demorestapi2.model.entity.User;

@Mapper
public interface UserRepository {

    @Select("SELECT * FROM user_tb WHERE id = #{userId}")
    User findUserById(Integer userId);
}
