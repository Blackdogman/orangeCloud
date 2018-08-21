package net.orangecloud.api.service;

import net.orangecloud.common.pojo.BlogMarkDown;

import java.util.List;

public interface BlogMarkDownService {
    BlogMarkDown get(String id);
    List<BlogMarkDown> list();
}
