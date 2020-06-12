package com.heiio.book.quiz.tree;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private Node root;
    private int count;
    private int foot = 0;
    private List<Integer> returnData = new ArrayList<>();
    private Object[] objects = new Object[]{};

    public class Node {
        private Node parent;
        private Node left;
        private Node right;
        private int data;

        public Node(int data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if(this.data > newNode.data) {
                if(this.left==null) {
                    this.left = newNode;
                    newNode.parent = this;
                } else {
                    this.left.addNode(newNode);
                }

            } else {
                if(this.right == null) {
                    this.right = newNode;
                    newNode.parent = this;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode() {
            if(this.left != null) {
                this.left.toArrayNode();
            }
            BinaryTree.this.returnData.add(this.data);
            if(this.right != null) {
                this.right.toArrayNode();
            }
        }

        public Node getRemoveNode(int data) {
            if(data==this.data) {
                return this;
            } else if(data < this.data) {
                if(this.left != null) {
                    return this.left.getRemoveNode(data);
                } else {
                    return null;
                }
            }  else {
                if(this.right != null) {
                    return this.right.getRemoveNode(data);
                } else {
                    return null;
                }
            }
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count ++;
    }

    public List<Integer> toArray() {
        if(this.count == 0) {
            return null;
        } else {
            this.foot = 0;
            this.root.toArrayNode();
            return returnData;
        }
    }

    public List<Integer> preToArray() {
        returnData.clear();
        if(this.count == 0) {
            System.out.println("null");
        } else {
            Stack<Node> stack = new Stack<>();
            stack.push(this.root);
            while (!stack.empty()) {
                Node node = stack.pop();
                returnData.add(node.data);
                if(node.right !=null) stack.push(node.right);
                if(node.left !=null) stack.push(node.left);
            }
        }

        return returnData;
    }

    public List<Integer> midToArray() {
        returnData.clear();
        if(this.count == 0) {
            System.out.println("null");
        } else {
            Stack<Node> stack = new Stack<>();
            Node cur = this.root;
            while (!stack.empty() || cur != null) {
                while (cur !=null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                Node node = stack.pop();
                returnData.add(node.data);
                if(node.right !=null) cur = node.right;
            }
        }

        return returnData;
    }

    public List<Integer> nextToArray() {
        returnData.clear();
        if(this.count == 0) {
            System.out.println("null");
        } else {
            Stack<Node> stack = new Stack<>();
            Stack<Node> stack2 = new Stack<>();
            stack.push(this.root);
            while (!stack.empty()) {
                Node node = stack.pop();
                stack2.push(node);
                if(node.left !=null) stack.push(node.left);
                if(node.right !=null) stack.push(node.right);

            }
            while (!stack2.empty()) {
               Node node = stack2.pop();
               returnData.add(node.data);
            }
        }

        return returnData;
    }

    public List<Integer> levelToArray() {
        returnData.clear();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(this.root);
        List<List<Integer>> datalist = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size -- > 0) {
                Node node = queue.poll();
                returnData.add(node.data);
                list.add(node.data);
                if(node.left!=null) queue.add(node.left);
                if(node.right !=null) queue.add(node.right);
            }
            datalist.add(list);
        }

        return returnData;
    }


    public void remove(int data) {
        Node removeNode = this.root.getRemoveNode(data);
        if(this.root.data == data) {
            Node moveNode = this.root.right;
            while (moveNode.left != null) {
                moveNode = moveNode.left;
            }
            moveNode.left = this.root.left;
            moveNode.right = this.root.right;
            moveNode.parent.left = null;
            this.root= moveNode;

        } else {

            if(removeNode.left == null && removeNode.right == null) {
                removeNode.parent.left = null;
                removeNode.parent.right = null;
            }
            else if(removeNode.left !=null && removeNode.right == null) {
                removeNode.left.parent = removeNode.parent;
                removeNode.parent.left = removeNode.left;
            }
            else if(removeNode.left ==null && removeNode.right != null) {
                removeNode.right.parent = removeNode.parent;
                removeNode.parent.right = removeNode.right;
            }
            else  {
                Node moveNode = removeNode.right;
                while (moveNode.left != null) {
                    moveNode = moveNode.left;
                }
                removeNode.parent.left = moveNode;
                moveNode.parent.left = null;
                moveNode.parent = removeNode.parent;
                moveNode.right = removeNode.right;
                moveNode.left = removeNode.left;
                System.out.println(moveNode.toString());
            }

        }

    }
}
