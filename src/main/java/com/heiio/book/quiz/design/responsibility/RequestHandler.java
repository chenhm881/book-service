package com.heiio.book.quiz.design.responsibility;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RequestHandler implements IHandler {

    private boolean Logged;
    private boolean buyed;

    @Override
    public void doAction(IRequest request) {
        request.operation(this);
    }
}
