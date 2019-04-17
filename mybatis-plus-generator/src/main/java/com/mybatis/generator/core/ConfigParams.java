package com.mybatis.generator.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: wangjian
 * @Date: 2019/4/16 17:11
 * @Description: 数据库等参数配置文件映射
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "code.generator")
public class ConfigParams {
    //包名
    private String packageName;
    //生成的表数组名
    private String[] tableNames;
    //输出目录
    private String outputDir;
    //注释作者名
    private String author;
    //数据库url
    private String jdbcUrl;
    //用户名
    private String jdbcUsername;
    //密码
    private String jdbcPassword;
    //驱动
    private String jdbcDriverName;

}
