package com.heiio.book.quiz.design.state;

public class RunState extends LiftState{


    @Override
    protected void Open() {
        context.setLiftState(Context.openningState);
        context.Open();
    }

    @Override
    protected void Close() {

    }

    @Override
    protected void Run() {
        System.out.println("I am running");

    }

    @Override
    protected void Stop() {

    }
}
