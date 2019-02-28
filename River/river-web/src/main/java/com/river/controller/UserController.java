package com.river.controller;

import com.river.bean.ResultResponse;

import com.river.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("getuser")
    public @ResponseBody
    ResultResponse findUserById(@RequestParam("id") String id) {
        logger.debug("getuser");
        return userService.getUserById(id);
    }
}
