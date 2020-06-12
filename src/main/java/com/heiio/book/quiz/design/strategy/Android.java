package com.heiio.book.quiz.design.strategy;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Android {
    private IStrategyA strategyA;
    private IStrategyB strategyB;

    public void jump() {
        strategyA.jump();
    }
    public void shout() {
        strategyB.shout();
    }

}
