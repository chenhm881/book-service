package com.heiio.book.quiz.design.responsibility;

public class RequestLogin implements IRequest{

    public RequestLogin(IRequest next) {
        this.next = next;
    }

    IRequest next;


    @Override
    public boolean operation(RequestHandler builder) {
        System.out.println("Login in");
        if(!builder.isLogged()) {
            return false;
        }
        if(next == null) {
            return true;
        } else {
            return next.operation(builder);
        }
    }
}
