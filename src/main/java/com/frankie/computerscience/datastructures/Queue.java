package com.frankie.computerscience.datastructures;

// FIFO
// remove, peak head
// add tail;
public class Queue {
    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        if (head == null) {            // empty
            head = new Node(data);
        } else if (tail == null) {     // has one Node
            head.next = new Node(data);
            tail = head.next;
        } else {                      // has 2 or more nodes
            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public Node remove() {
        if (head != null) {
            Node oldHead = head;
            head = head.next;
            return oldHead;
        } else {
            return null;
        }
    }

    public int peek() {
        return head.data;
    }

    public void printQueue() {
        Node printNode = head;
        while (printNode != null) {
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
    }
}
