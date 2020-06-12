package com.heiio.book.quiz.design.Observer;

public interface Ihandler {
    String change();
    void add(IOberver oberver);
    void tell();
}
