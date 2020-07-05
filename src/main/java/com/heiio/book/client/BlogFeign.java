package com.heiio.book.client;


import com.heiio.book.model.blog.Blog;
import feign.Headers;
import feign.RequestLine;

import java.util.List;

public interface BlogFeign {
    @RequestLine("GET /bloglist")
    @Headers({"Content-Type: application/json"})
    List<Blog> blogList();

    @RequestLine("POST /createBlog")
    @Headers({"Content-Type: application/json"})
    String createBlog(Blog blog);
}
