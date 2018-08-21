package net.orangecloud.common.service;

import feign.hystrix.FallbackFactory;
import net.orangecloud.common.pojo.BlogMarkDown;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BlogMarkDownClientServiceFallBack implements FallbackFactory<BlogMarkDownClientService> {
    @Override
    public BlogMarkDownClientService create(Throwable throwable) {
        return new BlogMarkDownClientService() {
            @Override
            public BlogMarkDown get(String id) {
                BlogMarkDown blogMarkDown = new BlogMarkDown();
                blogMarkDown.setFileName("该服务已经被降级，无法获取数据");
                blogMarkDown.setContent("无法获取ID为: " + id + "数据");
                return blogMarkDown;
            }

            @Override
            public List<BlogMarkDown> list() {
                List<BlogMarkDown> list = new ArrayList<>();
                BlogMarkDown blogMarkDown = new BlogMarkDown();
                blogMarkDown.setFileName("该服务已经被降级，无法获取数据");
                blogMarkDown.setContent("无法获数据");
                list.add(blogMarkDown);
                return list;
            }
        };
    }
}
