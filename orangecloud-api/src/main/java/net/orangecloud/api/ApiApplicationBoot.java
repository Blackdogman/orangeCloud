package net.orangecloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.orangecloud")
@EnableDiscoveryClient // 启用服务发现
@EnableEurekaClient // 启用作为Eureka客户端
public class ApiApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplicationBoot.class, args);
    }
}
