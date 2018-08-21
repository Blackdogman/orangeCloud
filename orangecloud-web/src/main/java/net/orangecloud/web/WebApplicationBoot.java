package net.orangecloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.orangecloud")
@EnableEurekaClient
@EnableFeignClients(basePackages = {"net.orangecloud"})
public class WebApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationBoot.class, args);
    }
}
