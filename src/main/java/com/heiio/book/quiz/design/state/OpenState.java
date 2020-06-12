package com.heiio.book.quiz.design.state;

public class OpenState extends LiftState{


    @Override
    protected void Open() {
        System.out.println("The Lift is Open");
    }

    @Override
    protected void Close() {
        super.context.setLiftState(Context.closeingState);
        context.getLiftState().Close();
    }

    @Override
    protected void Run() {

    }

    @Override
    protected void Stop() {

    }
}
