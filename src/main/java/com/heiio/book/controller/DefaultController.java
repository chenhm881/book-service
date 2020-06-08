package com.heiio.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class DefaultController {
    @RequestMapping("")
    public String helloWorld() {
        return "Spring boot to docker test";
    }

    @RequestMapping("/list")
    public ModelAndView list(Map<String, Object> model) {
        model.put("msg", "Hello World");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jsp/book-list");
        return modelAndView;
    }

    @RequestMapping("/booklist")
    public String bookList(Map<String, Object> model) {
        model.put("msg", "Hello World");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("thymeleaf/book-list");
        return "thymeleaf/book-list";
    }

    @RequestMapping("/booklist2")
    public String bookList2(Map<String, Object> model) {
        model.put("msg", "Hello World");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("thymeleaf/book-list");
        return "list";
    }

}




