package net.orangecloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationBoot.class, args);
    }
}
