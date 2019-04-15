package com.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: wangjian
 * @Date: 2019/4/12 09:58
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);

    }

}
