package com.heiio.book.quiz.design.mediator;

public class ColleageA implements IColleage {
    @Override
    public void doAction(IMediator mediator) {
        System.out.println("I am printing");
        mediator.Print();
    }

    @Override
    public void tell(String order) {
        System.out.println(order);
    }
}
