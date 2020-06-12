package com.heiio.book.quiz.design.Observer;

import java.util.ArrayList;
import java.util.List;

public class OberverHanlder implements Ihandler {

    List<IOberver> oberverList = new ArrayList<>();

    public void add(IOberver oberver) {
        oberverList.add(oberver);
    }

    public void tell () {
        for(IOberver oberver : oberverList) {
            oberver.say(this);
        }
    }

    @Override
    public String change() {
        return "Boss is coming";
    }
}
