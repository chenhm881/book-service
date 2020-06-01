package com.heiio.book.quiz.design.visitor;

public class Pattern {
    public static void main(String[] args) {
       Monitor monitor = new Monitor();
       IVisitor visitorA = new VisitorA();
       IVisitor visitorB = new VisitorB();
       monitor.setVisitorA(visitorA);
       monitor.setVisitorB(visitorB);
       monitor.operation();
    }
}
