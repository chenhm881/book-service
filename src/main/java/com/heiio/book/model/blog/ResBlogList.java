package com.heiio.book.model.blog;

import lombok.Data;

import java.util.List;

@Data
public class ResBlogList {
    private List<Blog> data;
    private Integer code;
    private String msg;
}
