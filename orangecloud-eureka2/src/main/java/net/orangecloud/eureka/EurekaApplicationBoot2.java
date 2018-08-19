package net.orangecloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationBoot2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationBoot2.class, args);
    }
}
