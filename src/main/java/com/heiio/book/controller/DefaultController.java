package com.heiio.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @RequestMapping("")
    public String helloWorld() {
        return "Spring boot to docker test";
    }
}