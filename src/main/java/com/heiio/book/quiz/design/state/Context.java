package com.heiio.book.quiz.design.state;

public class Context {

    public final static OpenState openningState = new OpenState();//开门状态，这时候电梯只能关闭
    public final static CloseState closeingState = new CloseState();//关闭状态，这时候电梯可以运行、停止和开门
    public final static RunState runingState = new RunState();//关闭状态，这时候电梯可以运行、停止和开门


    private LiftState liftState;

    public LiftState getLiftState() {
        return this.liftState;
    }

    public void setLiftState(LiftState liftState) {
        //当前环境改变
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }


    public void Open() {
        this.liftState.Open();
    }

    public void Close() {
        this.liftState.Close();
    }

    public void Run() {
        this.liftState.Run();
    }

    public void Stop() {
        this.liftState.Stop();
    }
}
