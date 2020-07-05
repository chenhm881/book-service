package com.heiio.book.model.blog;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {

    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean published;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;
    private String[] tags = new String[] {"tag1", "tag2"};
    private int commentSize;

}
