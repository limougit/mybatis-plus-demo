package com.example.demo.myabtisplus.controller;

import com.example.demo.myabtisplus.domain.entity.User;
import com.example.demo.myabtisplus.service.UserService;
import com.example.demo.myabtisplus.domain.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id 获取用户信息
     * @param id 用户id
     * @return
     */
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable("id") Integer id){
        return Result.ok(userService.getById(id));
    }
}
