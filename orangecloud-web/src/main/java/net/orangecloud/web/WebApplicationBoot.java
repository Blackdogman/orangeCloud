package net.orangecloud.web;

import net.orangecloud.customribbonrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.orangecloud")
@EnableEurekaClient
@RibbonClient(name = "ORANGECLOUE-API", configuration = MyRule.class)
public class WebApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationBoot.class, args);
    }
}
