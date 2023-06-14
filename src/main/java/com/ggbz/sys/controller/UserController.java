package com.ggbz.sys.controller;

import com.ggbz.sys.entity.User;
import com.ggbz.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ggbz
 * @since 2023-06-14
 */
//@Controller
//@RequestMapping("/sys/user")
@RestController//默认帮你做json处理
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    public List<User> getAllUser(){
        List<User> list = userService.list();
        return list;
    }
}
