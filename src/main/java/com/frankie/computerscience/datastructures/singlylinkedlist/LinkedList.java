package com.frankie.computerscience.datastructures.singlylinkedlist;

public class LinkedList {
    private class Node {
        Node nextNode; // points to next node
        int data; // holding value

        private Node (int data) {
            this.data = data;
        }
    }

    private Node head; // first node in the linkedlist

    public void append (int data){
        if (head == null) { // check if empty linkedlist
            head = new Node(data);
        } else if (head.nextNode == null) { // check if there is more than one node in the linkedlist
            head.nextNode = new Node(data);
        } else {
            Node currentNode = head;// the node of the linkedlist we are on
            while (currentNode.nextNode != null){// as long as current node is not the last node, aka has nextNode node, we update current node to be nextNode node
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(data); // add the node to end of linkedlist
        }
    }

    public void prepend (int data){
        if (head == null) {
            head = new Node(data);
        } else {
            Node newHead = new Node(data); // create a new head
            newHead.nextNode = head; // make current head the nextNode of newHead
            head = newHead; // update head to be newHead
        }
    }

    public void deleteValue (int data){
        if (head.data == data){
            head = head.nextNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.nextNode != null){
            if (currentNode.nextNode.data == data){
                currentNode.nextNode = currentNode.nextNode.nextNode; // skip current nextNode to the next nextNode
                return;  // break out of loop
            }
            currentNode = currentNode.nextNode;
        }
    }

    public void printList () {
        Node printNode = head; // starting from the first node
        if (printNode == null) {
            System.out.println("Empty LinkedList!");
        } else {
            System.out.println(String.format("%s : %s", printNode, printNode.data));
            while (printNode.nextNode != null){
                printNode = printNode.nextNode;
                System.out.println(String.format("%s : %s", printNode, printNode.data));
            }
        }
    }
}
