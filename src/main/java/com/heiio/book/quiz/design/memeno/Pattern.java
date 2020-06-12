package com.heiio.book.quiz.design.memeno;

public class Pattern {
    public static void main(String[] args) {
       Originator originator = new Originator();
       originator.setLeft("1");
       originator.setRight("2");
       Caker caker = new Caker();
       caker.setMememo(originator.createMememo());
       originator.setRight("3");
       originator.setLeft("4");
       originator.restoreMememo(caker.getMememo());
       System.out.println(originator.getLeft());
        System.out.println(originator.getRight());
    }
}
