package com.tx.manager;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: wangjian
 * @Date: 2019/4/17 11:17
 * @Description: tx-lcn-manager
 */
@SpringBootApplication
@EnableTransactionManagerServer
public class TxManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxManagerApplication.class, args);
    }
}
