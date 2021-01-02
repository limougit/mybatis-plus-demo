package com.example.demo.myabtisplus.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.myabtisplus.domain.dto.EmpDto;
import com.example.demo.myabtisplus.domain.entity.Employees;
import com.example.demo.myabtisplus.domain.vo.PageData;
import com.example.demo.myabtisplus.domain.vo.Result;
import com.example.demo.myabtisplus.service.EmployeesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author limou
 * @title: EmployeesController
 * @description: TODO
 * @date 2021/1/210:32
 */
@RestController
@RequestMapping("/emp")
public class EmployeesController {

    private final EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    /**
     * 分页查询  员工信息以及所在部门
     * @param page 页码
     * @param pageSize  每页显示记录数
     * @return
     */
    @GetMapping("/page")
    public Result<PageData<EmpDto>> page(@RequestParam(value = "page",required = false,defaultValue = "1") Long page,
                                         @RequestParam(value = "pageSize",required = false,defaultValue = "15") Long pageSize,
                                         @RequestParam(value = "firstName",required =  false) String firstName,
                                         @RequestParam Map<String,Object> queryParam){
        return Result.page(employeesService.customizedPage(new Page<>(page,pageSize),queryParam));
    }
}
