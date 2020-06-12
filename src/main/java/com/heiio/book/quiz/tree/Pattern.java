package com.heiio.book.quiz.tree;

public class Pattern {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(80);
        binaryTree.add(50);
        binaryTree.add(60);
        binaryTree.add(30);
        binaryTree.add(90);
        binaryTree.add(10);
        binaryTree.add(55);
        binaryTree.add(70);
        binaryTree.add(85);
        binaryTree.add(95);

        binaryTree.remove(80);

        System.out.println(binaryTree.toArray());
        //System.out.println(binaryTree.levelToArray());

    }
}
