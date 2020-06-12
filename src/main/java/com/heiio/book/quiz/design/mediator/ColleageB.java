package com.heiio.book.quiz.design.mediator;

public class ColleageB implements IColleage {

    @Override
    public void doAction(IMediator mediator) {
        System.out.println("I am presentation");
        mediator.Presentation();

    }

    @Override
    public void tell(String order) {
        System.out.println(order);
    }
}
