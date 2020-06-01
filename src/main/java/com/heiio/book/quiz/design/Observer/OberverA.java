package com.heiio.book.quiz.design.Observer;

public class OberverA implements IOberver {

    @Override
    public void say(Ihandler handler) {
        System.out.println("A get: " + handler.change());
    }
}
