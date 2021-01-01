package com.example.demo.myabtisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.myabtisplus.dao.UserMapper;
import com.example.demo.myabtisplus.entity.User;
import com.example.demo.myabtisplus.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
