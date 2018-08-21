package net.orangecloud.api;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.orangecloud")
@EnableDiscoveryClient // 启用服务发现
@EnableEurekaClient // 启用作为Eureka客户端
@EnableCircuitBreaker
public class HystrixApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplicationBoot.class, args);
    }
}
