1.这是一个spring-cloud学习笔记
2.该项目依赖于maven构建的父子工程，父模块主要引入了spring-boot的版本依赖，以及spring-cloud的版本依赖。
一定要注意，spring-boot的版本和spring-cloud的版本是有相互的关系的，要注意一下，
然后引入了项目监控spring-boot-starter-actuator。
以及lombok，spring-boot-starter-web,spring-boot-starter-config,因为这些都是公共的组件。
3.spring-cloud-eureka-server模块注册中心服务端口的9000，整合了ribbon负载均衡。
4.spring-cloud-zuul-server网关模块，整合了spring-cloud-config配置中心,以便于提供动态路由等功能。
5.spring-cloud-config-server配置中心，整合Eureka用于通过网关直接调用服务，同时需要提供的负载均衡。
6.