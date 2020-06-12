package com.heiio.book.quiz.design.bridge;


public class Pattern {
    public static void main(String[] args) {
        IDevice camera = new Camera();
        IDevice postMain = new PostMail();
        IMessage urgency = new UrgencyMessage();
        IMessage normal = new NormalMessage();
        urgency.send(camera);
        normal.send(postMain);
        urgency.send(postMain);
        normal.send(camera);
    }
}
