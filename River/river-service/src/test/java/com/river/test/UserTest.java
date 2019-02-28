package com.river.test;

import com.river.bean.User;
import com.river.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserTest {
    @Autowired
    private UserMapper domeMapper;

    @Test
    public void InsertDomeTest() {
        User user = new User();
        user.setName("Test2");
        System.out.println(domeMapper.InsertUser(user));
    }

    @Test
    public void SelectAllTest() {
        User user = new User();
        user.setId(1);
        User u = domeMapper.getUserById(user);
        System.out.println(u);
    }

    @Test
    public void DeleteUser() {
        User user = new User();
        user.setId(3);
        System.out.print(domeMapper.deleteUser(user));

    }
}
