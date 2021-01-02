package com.example.demo.myabtisplus.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.dialects.MySqlDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author limou
 * @title: MybatisPlusConfig
 * @description: mybatisplus  配置分页
 * @date 2021/1/210:21
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor interceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor pageInterceptor = new PaginationInnerInterceptor();
        pageInterceptor.setDbType(DbType.MYSQL);
        pageInterceptor.setDialect(new MySqlDialect());
        interceptor.addInnerInterceptor(pageInterceptor);
        return interceptor;
    }
}
