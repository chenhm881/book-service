package com.heiio.book.quiz.design.proxy;

public class Man implements IPerson {
    @Override
    public String getName(String prefix) {
        return prefix + "Jack";
    }
}
