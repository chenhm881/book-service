package com.heiio.book.quiz.design.proxy;


public class Pattern {
    public static void main(String[] args) {
        IPerson person = new Man();
        DynamicProxy proxy = new DynamicProxy(person);
        IPerson obj = (IPerson)proxy.bind(person.getClass());
        obj.getName("Chen");

    }
}
