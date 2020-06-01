package com.heiio.book.quiz.design.memeno;

import lombok.Data;

@Data
public class Originator {
    private String left;
    private String right;

    public Mememo createMememo() {
        return new Mememo(left, right);
    }

    public void restoreMememo (Mememo mememo) {
        this.left = mememo.getLeft();
        this.right = mememo.getRight();
    }
}
