package com.heiio.book.quiz.design.bridge;

public class NormalMessage implements IMessage {

    @Override
    public void send(IDevice device) {
        device.deliveryMessage("normal");
    }
}
