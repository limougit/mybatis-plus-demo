package com.example.demo.myabtisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.myabtisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
}