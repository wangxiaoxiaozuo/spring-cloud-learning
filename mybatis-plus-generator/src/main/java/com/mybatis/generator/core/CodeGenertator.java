package com.mybatis.generator.core;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wangjian
 * @Date: 2019/4/16 17:12
 * @Description: 利用spring-boot 启动加载后执行
 */
@Component
@Slf4j
public class CodeGenertator implements InitializingBean {

    @Autowired
    private ConfigParams configParams;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(StrUtil.format("开始生成表{}",configParams.getTableNames().toString()));
        generator();
    }


    public void generator() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String outputDir = configParams.getOutputDir();
        gc.setOutputDir(outputDir + "/src/main/java");
        gc.setAuthor(configParams.getAuthor());
        gc.setOpen(true);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        //设置Service ServiceImpl DTO 名字
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");

        //开启Swagger2注释
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(configParams.getJdbcUrl());
        // dsc.setSchemaName("public");
        dsc.setDriverName(configParams.getJdbcDriverName());
        dsc.setUsername(configParams.getJdbcUsername());
        dsc.setPassword(configParams.getJdbcPassword());
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("");
        pc.setParent(configParams.getPackageName());
        pc.setEntity("dto");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return outputDir + "/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(configParams.getTableNames());
        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
//        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
//        strategy.setSuperEntityColumns("id");
//        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();

    }
}
