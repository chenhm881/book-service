package com.heiio.book.quiz.design.responsibility;

import org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper;

public class RequestBuy implements IRequest{

    public RequestBuy(IRequest next) {
        this.next = next;
    }

    IRequest next;

    @Override
    public boolean operation(RequestHandler handler) {
        System.out.println("Buy");
        if (!handler.isBuyed()) {
            return false;
        }
        if(next==null) {
            return true;
        } else {
            return next.operation(handler);
        }
    }
}
