package com.example.demo.myabtisplus.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Result<T> {

    private static final String success = "200";
    /**
     * 状态码
     */
    private String code;
    /**
     * 错误消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;

    public static <T> Result<T> ok(){
        return new Result<>();
    }

    /**
     * 返回数据
     * @param data 数据
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data){
        return new Result<T>().setData(data);
    }
}
