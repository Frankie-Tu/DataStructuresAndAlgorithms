package com.frankie.computerscience.datastructures;

// LIFO
// pop, peek, push top
public class Stack {
    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    // remove top of stack
    public Node pop() {
        if (top != null) {
            Node dropTop = top;
            top = top.next;
            return dropTop;
        } else {
            return null;
        }
    }

    // push new value to top of stack
    public void push(int data) {
        Node newTop = new Node(data);
        newTop.next = top;
        top = newTop;
    }

    // peek at top value without removing it from stack
    public int peek() {
        return top.data;
    }

    public void printStack() {
        Node printNode = top;
        if (printNode == null) {
            System.out.println("Empty Stack");
        } else {
            while (printNode != null) {
                System.out.println(printNode.data);
                printNode = printNode.next;
            }
        }
    }
}