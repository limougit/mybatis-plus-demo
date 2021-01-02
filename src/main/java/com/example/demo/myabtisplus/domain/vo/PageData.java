package com.example.demo.myabtisplus.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author limou
 * @title: PageData
 * @description: 分页数据封装
 * @date 2021/1/210:14
 */
@Data
@Accessors(chain = true)
public class PageData<T> {
    /**
     * 页码
     */
    private Long page;
    /**
     * 每页显示记录数
     */
    private Long pageSize;
    /**
     * 数据总条数
     */
    private Long total;
    /**
     * 总页数
     */
    private Long pages;
    /**
     * 分页数据
     */
    private List<T> records;
}
