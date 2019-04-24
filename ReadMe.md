1.这是一个spring-cloud学习笔记
2.该项目依赖于maven构建的父子工程，父模块主要引入了spring-boot的版本依赖，以及spring-cloud的版本依赖。
一定要注意，spring-boot的版本和spring-cloud的版本是有相互的关系的，要注意一下，
然后引入了项目监控spring-boot-starter-actuator。
以及lombok，spring-boot-starter-web,spring-boot-starter-config,因为这些都是公共的组件。
3.spring-cloud-eureka-server模块注册中心服务端口的9000，整合了ribbon负载均衡。
4.spring-cloud-zuul-server网关模块，整合了spring-cloud-config配置中心,以便于提供动态路由等功能。
5.spring-cloud-config-server配置中心，整合Eureka用于通过网关直接调用服务，同时需要提供的负载均衡。
6.第一个坑：spring-config 不能为公共组件，因为在项目在加载的时候config会远程拉一下配置，虽然说这个不影响
整体的使用，但是还是暂时这么做并不妥当
7.blog-service,login-service,order-service,在blog-service中同时调用login和order的服务，采用的是
LCN分布式事务管理，
8.TX-LCN 分布式事务在配置上暂时需要数据库以及redis，redis的唯一作用是需要创建分布式事务统一的groupID
而数据的作用可能在于记录日志，目前暂时没有发现，需要创建一个名为tx-manager的数据库，以及一张默认的表
9.事务的发起方以及事务的参与方，在tc端需要配置tm的地址。
10.如果使用的feign调用的话，同时开启了hystrix。需要在fallback中加让异常记录点，不然异常捕获不到，并不能同时回滚
11.spring-cloud-config坑：如果想要使用项目名称作为分级路径的话，记得不能配置git文件的路径，要配置为git的地址
12.config-client端如果想加载配置，要将服务端的地址配置在bootstrap.yml中，应为bootstrap.yml的优先级比
application.yml的优先级更高
13.下一步准备研究一下 LCN分布式如何记录日志
14.tx-manager 如果同时启动俩个一样的服务，会发生tc成功注册但是事务无法回滚的情况（坑）