package com.example.demo.myabtisplus.domain.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Result<T> {

    private static final String success = "200";
    /**
     * 状态码
     */
    private String code = success;
    /**
     * 错误消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;

    public static <T> Result<T> ok() {
        return new Result<>();
    }

    /**
     * 返回数据
     *
     * @param data 数据
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {
        return new Result<T>().setData(data);
    }

    /**
     * 分页数据返回
     *
     * @param page mybatis-plus分页模型
     * @param <T>  泛型数据
     * @return
     */
    public static <T> Result<PageData<T>> page(IPage<T> page) {
        PageData<T> pageData = new PageData<T>().setPage(page.getCurrent()).setPages(page.getPages()).setPageSize(page.getSize())
                .setTotal(page.getTotal()).setRecords(page.getRecords());
        return new Result<PageData<T>>().setData(pageData);
    }
}
