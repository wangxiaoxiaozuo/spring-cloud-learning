package com.login.center;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 09:20
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
@EnableDistributedTransaction
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
