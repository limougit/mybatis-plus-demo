package com.example.demo.myabtisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.myabtisplus.domain.dto.EmpDto;
import com.example.demo.myabtisplus.domain.entity.Employees;

import java.util.Map;

/**
 * @author limou
 * @title: EmployeesService
 * @description: TODO
 * @date 2021/1/210:27
 */
public interface EmployeesService extends IService<Employees> {
    /**
     * 查询员工信息以及所在部门
     *
     * @param page 分页参数
     * @param queryParam  检索参数map
     * @return
     */
    IPage<EmpDto> customizedPage(IPage<EmpDto> page, Map<String, Object> queryParam);
}
