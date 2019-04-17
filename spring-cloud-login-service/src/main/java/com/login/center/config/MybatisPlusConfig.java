package com.login.center.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author limin
 * @date 2018-05-04
 * mybatis启动类
 */
@Configuration
@MapperScan(basePackages = "com.login.center.mapper")
public class MybatisPlusConfig {
    /**
     * @Author : wangjian
     * @Description 分页插件，自动识别数据库类型 多租户，请参考官网【插件扩展】
     * @Date 2018/11/6 9:29
     * @Param []
     * @Return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     **/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * @Author : wangjian
     * @Description mybatis-plus SQL执行效率插件【生产环境可以关闭】
     * @Date 2018/11/6 9:29
     * @Param []
     * @Return com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor
     **/
    @Bean
    @Profile("dev")
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }


}