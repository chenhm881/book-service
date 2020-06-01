package com.heiio.book.quiz.design.bridge;

public class Camera implements IDevice {


    @Override
    public void deliveryMessage(String message) {
        System.out.println("Camera send" + message);
    }
}
