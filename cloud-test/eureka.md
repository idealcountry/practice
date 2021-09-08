# 服务治理中心-Eureka的搭建
1. 构建SpringBoot项目
2. 在子模块中同样搭建SpringBoot项目，记得勾选web和eureka-server组件（在spring cloud discovery中）
3. 在启动类中加入注解
```java
    //驱动Eureka 服务治理中心 
    @EnableEurekaServer
    public class EurekaServerApplication {
        public static void main(String[] args) {
            SpringApplication.run(EurekaServerApplication.class, args);
        }
    }
```
4. 在application.yml文件中加入微服务相关的设置