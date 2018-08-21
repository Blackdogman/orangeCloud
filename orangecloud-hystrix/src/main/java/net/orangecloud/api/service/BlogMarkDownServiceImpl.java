package net.orangecloud.api.service;

import net.orangecloud.api.dao.BlogMarkDownDao;
import net.orangecloud.common.pojo.BlogMarkDown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogMarkDownServiceImpl implements BlogMarkDownService {
    private final BlogMarkDownDao blogMarkDownDao;

    @Autowired
    public BlogMarkDownServiceImpl(BlogMarkDownDao blogMarkDownDao) {
        this.blogMarkDownDao = blogMarkDownDao;
    }

    public BlogMarkDown get(String id){
        return blogMarkDownDao.findById(id);
    }

    @Override
    public List<BlogMarkDown> list() {
        return blogMarkDownDao.findAll();
    }
}
