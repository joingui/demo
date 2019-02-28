package com.river.service;

import com.river.bean.ResultResponse;
import com.river.bean.User;
import com.river.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean insertUser(User user) {
        return userMapper.InsertUser(user);
    }


    public ResultResponse<User> getUserById(String id) {
        User user = new User();
        user.setId(Integer.parseInt(id));
        User selectUser = userMapper.getUserById(user);


        ResultResponse<User> resultResponse = new ResultResponse<User>();
        if (selectUser != null) {
            resultResponse.setStatus(ResultResponse.STAUS_SUCCESS);
            resultResponse.setMsg("");
            resultResponse.setData(selectUser);
        } else {
            resultResponse.setStatus(ResultResponse.STAUS_xxxEROOR);
            resultResponse.setMsg("没有找到用户");

        }

        return resultResponse;
    }
}
