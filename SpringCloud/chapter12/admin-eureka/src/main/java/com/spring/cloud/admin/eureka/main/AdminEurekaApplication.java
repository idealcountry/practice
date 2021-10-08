package com.spring.cloud.admin.eureka.main;

@SpringBootApplication
@EnableEurekaServer
public class AdminEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminEurekaApplication.class, args);
    }

}
