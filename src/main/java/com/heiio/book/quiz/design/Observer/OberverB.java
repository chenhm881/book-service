package com.heiio.book.quiz.design.Observer;

public class OberverB implements IOberver {

    @Override
    public void say(Ihandler handler) {
        System.out.println("B get: " + handler.change());
    }
}
