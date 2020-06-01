package com.heiio.book.quiz.design.bridge;

public class UrgencyMessage implements IMessage {

    @Override
    public void send(IDevice device) {
        device.deliveryMessage("urgency");
    }
}
