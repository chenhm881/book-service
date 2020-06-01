package com.heiio.book.quiz.design.visitor;

public class VisitorA implements IVisitor {

    @Override
    public void look(Monitor monitor) {
        monitor.visitIPace();
    }
}
