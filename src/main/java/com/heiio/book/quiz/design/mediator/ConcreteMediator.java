package com.heiio.book.quiz.design.mediator;

public class ConcreteMediator implements IMediator {

    private IColleage colleageA;
    private IColleage colleageB;

    public ConcreteMediator(IColleage colleageA, IColleage colleageB) {
        this.colleageA = colleageA;
        this.colleageB = colleageB;
    }

    @Override
    public void Print() {
        colleageB.tell("Printed");
    }

    @Override
    public void Presentation() {
        colleageA.tell("Presentation");
    }

    @Override
    public void Summary() {

    }

}
