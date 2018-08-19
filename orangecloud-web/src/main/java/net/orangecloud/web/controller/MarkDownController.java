package net.orangecloud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MarkDownController {

    @Value("${api.url.prefix}")
    private String URL_PREFIX;

    private final RestTemplate restTemplate;

    @Autowired
    public MarkDownController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/web/blog/list")
    public List listBlog(){
        System.err.println(URL_PREFIX);
        return restTemplate.getForObject(URL_PREFIX + "/blogmarkdown/list", List.class);
    }
}
