package net.orangecloud.api.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import net.orangecloud.api.service.BlogMarkDownService;
import net.orangecloud.common.pojo.BlogMarkDown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
public class BlogMarkDownController {
    private final BlogMarkDownService blogMarkDownService;
    private final DiscoveryClient discoveryClient;

    @Autowired
    public BlogMarkDownController(BlogMarkDownService blogMarkDownService, DiscoveryClient discoveryClient) {
        this.blogMarkDownService = blogMarkDownService;
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/blogmarkdown/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public BlogMarkDown get(@PathVariable("id") String id){
        BlogMarkDown blogMarkDown = blogMarkDownService.get(id);
        if(blogMarkDown == null){
            throw new RuntimeException("can not find blog id: " + id);
        }
        return blogMarkDown;
    }

    public BlogMarkDown processHystrixGet(@PathVariable("id") String id){
        BlogMarkDown blogMarkDown = new BlogMarkDown();
        blogMarkDown.setFileName("can not find blog");
        blogMarkDown.setContent("id:" + id + " not exits;");
        return blogMarkDown;
    }

    @GetMapping("/blogmarkdown/list")
    public List<BlogMarkDown> list(){
        return blogMarkDownService.list();
    }


    /**
     * 扫描现在已经注册的微服务，并可以查询详细信息
     * @return 发现的客户端列表
     */
    @GetMapping("/blogmarkdown/discovery")
    public Object discovery(){
        List<String> serviceList = discoveryClient.getServices();
        System.err.println("serviceList: ");
        System.err.println(serviceList);
        // 查询指定服务名称的列表
        List<ServiceInstance> servList = discoveryClient.getInstances("这里是为服务名称");
        for(ServiceInstance item : servList){
            // 可以便利查询出对应服务的端口IP之类的信息
            System.err.println("HOST: " + item.getHost());
            System.err.println("PORT: " + item.getPort());
            System.err.println("URL: " + item.getUri());
            System.err.println("SERVICEID: " + item.getServiceId());
        }
        return this.discoveryClient;
    }
}
