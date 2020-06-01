package com.heiio.book.quiz.design.bridge;

public class PostMail implements IDevice {


    @Override
    public void deliveryMessage(String message) {
        System.out.println("PostMail send" + message);
    }
}
