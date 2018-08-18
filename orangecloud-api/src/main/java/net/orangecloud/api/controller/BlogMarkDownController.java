package net.orangecloud.api.controller;

import net.orangecloud.api.service.BlogMarkDownService;
import net.orangecloud.common.pojo.BlogMarkDown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogMarkDownController {
    private final BlogMarkDownService blogMarkDownService;

    @Autowired
    public BlogMarkDownController(BlogMarkDownService blogMarkDownService) {
        this.blogMarkDownService = blogMarkDownService;
    }

    @GetMapping("/blogmarkdown/get/{id}")
    public BlogMarkDown get(@PathVariable("id") String id){
        return blogMarkDownService.get(id);
    }

    @GetMapping("/blogmarkdown/list")
    public List<BlogMarkDown> list(){
        return blogMarkDownService.list();
    }
}
