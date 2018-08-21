package net.orangecloud.common.service;


import net.orangecloud.common.pojo.BlogMarkDown;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "http://ORANGECLOUD-API", fallbackFactory = BlogMarkDownClientServiceFallBack.class)
public interface BlogMarkDownClientService {

    @GetMapping("/blogmarkdown/get/{id}")
    BlogMarkDown get(@PathVariable("id") String id);

    @GetMapping("/blogmarkdown/list")
    List<BlogMarkDown> list();
}
