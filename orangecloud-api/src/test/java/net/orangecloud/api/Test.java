package net.orangecloud.api;

import net.orangecloud.api.dao.BlogMarkDownDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private BlogMarkDownDao blogMarkDownDao;

    @org.junit.Test
    public void myBatisTest(){
        System.out.println(blogMarkDownDao.findAll());
    }
}
