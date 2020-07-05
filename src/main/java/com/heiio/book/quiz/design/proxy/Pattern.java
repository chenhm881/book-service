package com.heiio.book.quiz.design.proxy;


import org.springframework.cglib.proxy.Enhancer;

public class Pattern {
    public static void main(String[] args) {
        IPerson person = new Man();
        DynamicProxy proxy = new DynamicProxy(person);
        IPerson obj = (IPerson)proxy.bind(person.getClass());
        obj.getName("Chen");

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Man.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Man man = (Man) enhancer.create();
        man.getName("Deng");
        System.out.println(man.toString());
        System.out.println(man.getClass());
        System.out.println(man.hashCode());
    }
}
