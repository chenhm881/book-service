package com.heiio.book.quiz.design.strategy;



public class Pattern {
    public static void main(String[] args) {
        IStrategyB strategyB = new StrategyBMan();
        IStrategyA strategyA = new StrategyAMan();
        IStrategyA strategyADog = new StrategyADog();

        Android android = new Android(strategyA, strategyB);
        android.jump();
        android.shout();
        android = new Android(strategyADog, strategyB);
        android.shout();
        android.jump();
    }
}
