package com.frankie.computerscience.datastructures.linkedlist;

import org.junit.Before;
import org.junit.Test;


public class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> myDoublyLinkedList;

    @Before
    public void setup() {
        myDoublyLinkedList = new DoublyLinkedList();
        myDoublyLinkedList.append(5);
    }

    @Test
    public void append() {
        myDoublyLinkedList.append(1);
        System.out.println("append test: should print 5, 1");
        myDoublyLinkedList.printList();
    }

    @Test
    public void prepend() {
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.prepend(1);
        System.out.println("prepend test: should print 1, 5, 1");
        myDoublyLinkedList.printList();
    }

    @Test
    public void reverse() {
        myDoublyLinkedList.append(4);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.reverse();
        System.out.println("reverse test: should print 1, 2, 3, 4, 5");
        myDoublyLinkedList.printList();
    }

    @Test
    public void deleteVal() {
        myDoublyLinkedList.append(10);
        myDoublyLinkedList.append(20);
        myDoublyLinkedList.deleteVal(10);
        System.out.println("deleteVal test: should print 5, 20");
        myDoublyLinkedList.printList();
    }
}