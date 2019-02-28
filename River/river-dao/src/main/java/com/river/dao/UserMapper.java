package com.river.dao;

import com.river.bean.User;

public interface UserMapper {

    User getUserById(User user);

    boolean InsertUser(User user);

    boolean deleteUser(User user);

    boolean updateUser(User user);
}
