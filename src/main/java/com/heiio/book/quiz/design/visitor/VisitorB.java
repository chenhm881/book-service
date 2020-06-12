package com.heiio.book.quiz.design.visitor;

public class VisitorB implements IVisitor {

    @Override
    public void look(Monitor monitor) {
        monitor.visitIPace();
    }
}
