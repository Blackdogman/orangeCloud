package net.orangecloud.web.controller;

import net.orangecloud.common.pojo.BlogMarkDown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MarkDownController {
    // 这是调用提供者的url前缀，在配置文件中配置
    private final String URL_PREFIX;
    // 这是远程调用的Rest请求的类
    private final RestTemplate restTemplate;

    @Autowired
    public MarkDownController(@Value("${api.url.prefix}") String url_prefix, RestTemplate restTemplate) {
        this.URL_PREFIX = url_prefix;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/web/blog/list")
    public List listBlog() {
        return restTemplate.getForObject(URL_PREFIX + "/blogmarkdown/list", List.class);
    }

    @GetMapping("/web/blog/get/{id}")
    public BlogMarkDown getBlog(@PathVariable("id") String id){
        return restTemplate.getForObject(URL_PREFIX + "/blogmarkdown/get/" + id, BlogMarkDown.class);
    }

    @GetMapping("/web/blog/discovery")
    public Object discovery(){
        return restTemplate.getForObject(URL_PREFIX + "/blogmarkdown/discovery", Object.class);
    }
}
