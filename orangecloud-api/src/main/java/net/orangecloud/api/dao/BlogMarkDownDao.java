package net.orangecloud.api.dao;

import net.orangecloud.common.pojo.BlogMarkDown;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BlogMarkDownDao {
    @Insert("INSERT INTO blog_markdown (id, up_date, file_name, content, flag, md5_code) VALUES (NULL,now(),#{file_name},#{content},1,#{md5_code})")
    int insert(
            @Param("file_name") String fileName,
            @Param("content") String content,
            @Param("md5_code") String md5Code
    );

    BlogMarkDown findById(@Param("id") String id);

    List<BlogMarkDown> findAll();
}
