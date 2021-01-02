package com.example.demo.myabtisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.myabtisplus.domain.dto.EmpDto;
import com.example.demo.myabtisplus.domain.entity.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author limou
 * @title: EmployeesDao
 * @description: TODO
 * @date 2021/1/210:28
 */
@Repository
@Mapper
public interface EmployeesDao extends BaseMapper<Employees> {
    /**
     * 自定义分页查询
     *
     * @param page 分页参数
     * @param queryParam 检索参数
     * @return 员工信息列表
     */
    IPage<EmpDto> customizedPage(IPage<EmpDto> page, @Param("param") Map<String, Object> queryParam);
}
