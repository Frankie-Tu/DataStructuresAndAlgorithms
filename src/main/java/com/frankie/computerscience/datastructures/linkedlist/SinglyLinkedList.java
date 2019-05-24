package com.frankie.computerscience.datastructures.linkedlist;

public class SinglyLinkedList<T> {
    private class Node {
        Node next; // points to next node
        T data; // holding value

        private Node(T data) {
            this.data = data;
        }
    }

    private Node head; // first node in the linkedlist

    public void append(T data) {
        if (head == null) { // check if empty linkedlist
            head = new Node(data);
        } else if (head.next == null) { // check if there is more than one node in the linkedlist
            head.next = new Node(data);
        } else {
            Node currentNode = head;// the node of the linkedlist we are on
            while (currentNode.next != null) {// as long as current node is not the last node, aka has next node, we update current node to be next node
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data); // add the node to end of linkedlist
        }
    }

    public void prepend(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newHead = new Node(data); // create a new head
            newHead.next = head; // make current head the next of newHead
            head = newHead; // update head to be newHead
        }
    }

    public void deleteValue(T data) {
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next; // skip current next to the next next
                return;  // break out of loop
            }
            currentNode = currentNode.next;
        }
    }

    public void reverse() {
        if (head != null) { // non-empty linkedlist
            Node previousNode = null;
            Node currentNode = head;
            Node nextNode = null;
            while (currentNode.next != null) {
                nextNode = currentNode.next; //  pointer to next node
                currentNode.next = previousNode; // reverse pointer of current node to previous node
                previousNode = currentNode; // make current node the previous node
                currentNode = nextNode; // make next node the current node and repeat this process
            }
            head = currentNode; // since currentNode.next points to null, we have reach the end of linkedlist. Make currentNode the new head
            head.next = previousNode; // make new head.next point to previous node
        }
    }

    public void printList() {
        Node printNode = head; // starting from the first node
        if (printNode == null) {
            System.out.println("Empty SinglyLinkedList!");
        } else {
            while (printNode != null) {
                System.out.println(String.format("%s : %s", printNode, printNode.data));
                printNode = printNode.next;
            }
        }
    }
}
