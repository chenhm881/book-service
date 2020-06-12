package com.heiio.book.quiz.design.state;

public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    protected abstract void Open();
    protected abstract void Close();
    protected abstract void Run();
    protected abstract void Stop();

}
