package com.heiio.book.quiz.design.Observer;



public class Pattern {
    public static void main(String[] args) {
        Ihandler handler = new OberverHanlder();
        IOberver oberverA = new OberverA();
        IOberver oberverB = new OberverB();
        handler.add(oberverA);
        handler.add(oberverB);
        handler.tell();

    }
}
