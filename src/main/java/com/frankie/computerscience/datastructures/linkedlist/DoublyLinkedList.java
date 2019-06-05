package com.frankie.computerscience.datastructures.linkedlist;

public class DoublyLinkedList<T> {
    private class Node {
        Node next;
        Node previous;
        T data;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
            currentNode.next.previous = currentNode;
        }
    }

    public void prepend(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newHead = new Node(data);
            newHead.next = head;
            head.previous = newHead;
            head = newHead;
        }
    }

    public void reverse() {
        if (head != null) {
            head.previous = head.next;
            head.next = null;
            Node currentNode = head.previous;
            while (currentNode.next != null) {
                Node temp = currentNode.next; // save the next to another var
                currentNode.next = currentNode.previous;
                currentNode.previous = temp;
                currentNode = currentNode.previous;
            }
            head = currentNode;
            head.next = head.previous;
            head.previous = null;
        }
    }

    public void deleteVal(T data) {
        if (head == data) {
            head = head.next;
            head.previous = null;
        } else {
            Node currentNode = head.next;
            while (currentNode != null) {
                if (currentNode.data == data) {
                    currentNode.previous.next = currentNode.next;
                    currentNode.next.previous = currentNode.previous;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void printList() {
        Node printNode = head;
        if (printNode == null) {
            System.out.println("Empty DoublyLinkedList!");
        } else {
            while (printNode != null) {
                System.out.println(String.format("%s : %s", printNode, printNode.data));
                printNode = printNode.next;
            }
        }
    }
}
