package com.springcloud.zuul;

import com.springcloud.zuul.filter.AccessFilter;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangjian
 * @Date: 2019/4/12 09:58
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@RestController
public class ZuulApplication {

    @Value("${test.name}")
    private String userName;

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }


    @GetMapping("/getName")
    public String getUserName() {
        if (StringUtils.isNotEmpty(userName)) {
            return userName;
        } else {
            return "未能从配置文件获取信息";
        }
    }


}
