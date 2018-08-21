package net.orangecloud.strixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardBoot {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardBoot.class, args);
    }
}
