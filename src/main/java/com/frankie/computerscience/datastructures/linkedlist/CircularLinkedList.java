package com.frankie.computerscience.datastructures.linkedlist;

public class CircularLinkedList {
    private class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            head.next = head;
        } else {
            Node currentNode = head.next;
            // if only head node in the linkedlist
            if (currentNode == head) {
                head.next = new Node(data);
                head.next.next = head;
            } else {
                // loop until the next node of current node is head
                while (currentNode.next != head) {
                    currentNode = currentNode.next;
                }
                currentNode.next = new Node(data);
                currentNode.next.next = head;
            }
        }
    }

    public void deleteVal(int data) {
        if (head != null) {
            if (head.data == data) {
                // if more than one node in the list
                if (head.next != head) {
                    Node newHead = head.next;
                    Node currentNode = newHead;
                    while (currentNode.next != head) {
                        currentNode = currentNode.next;
                    }
                    currentNode.next = newHead;
                    head = newHead;
                } else { // knowing that head is the node to be removed and the only node in the list
                    head = null;
                }
            } else {
                Node currentNode = head.next;
                // knowing head is not the node to be removed, check if head.next is the node to be removed
                if (currentNode.data == data) {
                    head.next = currentNode.next;
                } else {
                    // loop until the value is found and removed or reach the end of the list
                    while (currentNode.next != head) {
                        if (currentNode.next.data == data) {
                            currentNode.next = currentNode.next.next;
                            break;
                        }
                        currentNode = currentNode.next;
                    }
                }
            }
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            System.out.println(head.data);
            Node currentNode = head.next;
            while (currentNode != head) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }
}
