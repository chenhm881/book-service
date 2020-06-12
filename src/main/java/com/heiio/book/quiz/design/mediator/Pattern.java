package com.heiio.book.quiz.design.mediator;

public class Pattern {
    public static void main(String[] args) {

        IColleage colleageA = new ColleageA();
        IColleage colleageB = new ColleageB();
        IMediator mediator = new ConcreteMediator(colleageA, colleageB);

        colleageA.doAction(mediator);
        colleageB.doAction(mediator);
    }
}
