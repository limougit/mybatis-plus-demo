package com.example.demo.myabtisplus;

import com.example.demo.myabtisplus.entity.User;
import com.example.demo.myabtisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyabtisPlusApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = userService.getById(1);
        System.out.println(user);
    }

}
