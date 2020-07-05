package com.heiio.book.service.blog;

import com.heiio.book.client.BlogFeign;
import com.heiio.book.model.blog.Blog;
import feign.Feign;
import feign.Retryer;
import feign.codec.Encoder;
import feign.codec.StringDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Value("${rediscache.endpoint}")
    private String endpoint;

    public List<Blog> blogList() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .retryer(new Retryer.Default(100, 1000, 5))
                .target(BlogFeign.class, endpoint).blogList();
    }

    public String create(Blog blog) {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .retryer(new Retryer.Default(100, 1000, 5))
                .target(BlogFeign.class, endpoint).createBlog(blog);
    }
}
