package net.orangecloud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestControllerConsumer {

    private final RestTemplate restTemplate;

    @Autowired
    public TestControllerConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    

}
