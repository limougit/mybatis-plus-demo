package com.example.demo.myabtisplus.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.myabtisplus.dao.EmployeesDao;
import com.example.demo.myabtisplus.domain.dto.EmpDto;
import com.example.demo.myabtisplus.domain.entity.Employees;
import com.example.demo.myabtisplus.service.EmployeesService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author limou
 * @title: EmployeesServiceImpl
 * @description: TODO
 * @date 2021/1/210:27
 */
@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesDao,Employees> implements EmployeesService {
    @Override
    public IPage<EmpDto> customizedPage(IPage<EmpDto> page, Map<String, Object> queryParam) {
        return baseMapper.customizedPage(page,queryParam);
    }
}
