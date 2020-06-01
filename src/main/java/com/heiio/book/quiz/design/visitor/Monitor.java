package com.heiio.book.quiz.design.visitor;

import lombok.Data;

@Data
public class Monitor {
    private IVisitor visitorA;
    private IVisitor visitorB;

    public void operation() {
        visitorA.look(this);
        visitorB.look(this);
    }

    public void visitIPace () {
        System.out.println("palace");
    }

    public void visitGarden() {
        System.out.println("gardne");
    }
}
