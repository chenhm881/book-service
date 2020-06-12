package com.heiio.book.quiz.design.state;

public class CloseState extends LiftState{


    @Override
    protected void Open() {

    }

    @Override
    protected void Close() {
        System.out.println("I closed");
    }

    @Override
    protected void Run() {

        super.context.setLiftState(Context.runingState);
        context.Run();
    }

    @Override
    protected void Stop() {

    }
}
