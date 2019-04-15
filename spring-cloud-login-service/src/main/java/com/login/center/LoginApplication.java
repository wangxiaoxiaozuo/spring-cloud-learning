package com.login.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 09:20
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class LoginApplication {


    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
