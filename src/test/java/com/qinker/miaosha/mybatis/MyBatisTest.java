package com.qinker.miaosha.mybatis;

import com.qinker.miaosha.dao.UserDao;
import com.qinker.miaosha.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insertUser(){
        User user = new User();
        user.setName("lory");
        userDao.insert(user);
    }

}
