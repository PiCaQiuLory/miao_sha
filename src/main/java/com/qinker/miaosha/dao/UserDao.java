package com.qinker.miaosha.dao;

import com.qinker.miaosha.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    @Insert("insert into user values(null,#{name})")
    void insert(User user);
}
