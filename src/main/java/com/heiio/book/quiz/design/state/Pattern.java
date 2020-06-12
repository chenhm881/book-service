package com.heiio.book.quiz.design.state;

public class Pattern {
    public static void main(String[] args) {
        LiftState openState = new OpenState();
        Context context = new Context();
        openState.setContext(context);
        context.setLiftState(openState);
        context.Open();
        System.out.println(context.getLiftState());
        context.Close();
        System.out.println(context.getLiftState());
        context.Run();
        System.out.println(context.getLiftState());

    }
}
