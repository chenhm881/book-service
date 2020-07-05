package com.heiio.book.controller;

import com.heiio.book.model.blog.Blog;
import com.heiio.book.model.blog.ResBlogList;
import com.heiio.book.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
@ResponseBody
@CrossOrigin
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/bloglist")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<ResBlogList> blogList() {
        List<Blog> blogList = blogService.blogList();
        ResBlogList resBlogList = new ResBlogList();
        resBlogList.setData(blogList);
        resBlogList.setCode(0);
        ResponseEntity<ResBlogList> responseEntity = new ResponseEntity<>(resBlogList, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/taglist")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<Map<String, Object>> tagList() {
        Map<String, Object> tags = new HashMap<>();
        List<String> tagList = new ArrayList<>();
        tagList.add("tag1");
        tagList.add("tag2");
        tags.put("tags", tagList);
        tags.put("code", HttpStatus.OK.value());
        ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<>(tags, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/collect")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<Map<String, Object>> collect(int offset, int limit) {
        Map<String, Object> collect = new HashMap<>();
        List<String> rows = new ArrayList<>();
        collect.put("rows", rows);
        collect.put("code", HttpStatus.OK.value());
        ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<>(collect, HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping("/archive")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<Map<String, Object>> archive() {
        Map<String, Object> archive = new HashMap<>();
        List<String> rows = new ArrayList<>();
        archive.put("rows", rows);
        archive.put("code", 200);
        archive.put("year", "2020");
        ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<>(archive, HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping("/create")
    @CrossOrigin
    public ResponseEntity<Map<String, Object>> create(Blog blog) {
        Map<String, Object> testblog = new HashMap<>();
        String retMessage = blogService.create(blog);
        testblog.put("code", HttpStatus.CREATED);
        testblog.put("message", retMessage);
        ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<>(testblog, HttpStatus.CREATED);
        return responseEntity;
    }
}
