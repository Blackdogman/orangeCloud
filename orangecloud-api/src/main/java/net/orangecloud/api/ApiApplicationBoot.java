package net.orangecloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.orangecloud")
public class ApiApplicationBoot {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplicationBoot.class, args);
    }
}
