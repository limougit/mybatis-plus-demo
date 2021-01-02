package com.example.demo.myabtisplus.domain.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.myabtisplus.domain.entity.Employees;

/**
 * @author limou
 * @title: EmpDto
 * @description: TODO
 * @date 2021/1/210:39
 */
public class EmpDto extends Employees {
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 地址id
     */
    private String locationId;
    /**
     * address
     */
    private String streetAddress;
    /**
     * postalCode
     */
    private String postalCode;
    /**
     * city
     */
    private String city;
    /**
     * stateProvince
     */
    private String stateProvince;
}
