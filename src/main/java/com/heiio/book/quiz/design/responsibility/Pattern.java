package com.heiio.book.quiz.design.responsibility;

public class Pattern {
    public static void main(String[] args) {
        IHandler handler = RequestHandler.builder().buyed(true).Logged(false).build();
        handler.doAction(new RequestLogin(new RequestBuy(null)));
    }
}
