package com.frankie.computerscience.datastructures.linkedlist;

import org.junit.Test;
import org.junit.Before;

public class CircularLinkedListTest {

    CircularLinkedList myCircularList = new CircularLinkedList();

    @Before
    public void setup() {
        myCircularList.append(1);
        myCircularList.append(2);
        myCircularList.append(3);
    }

    @Test
    public void testAppend() {
        System.out.println("should print 1, 2, 3");
        myCircularList.printList();
    }

    @Test
    public void testDeleteVal() {
        System.out.println("should print 2, 3");
        myCircularList.deleteVal(1);
        myCircularList.printList();
        System.out.println("should print 2");
        myCircularList.deleteVal(3);
        myCircularList.printList();
        System.out.println("should print 'empty list' ");
        myCircularList.deleteVal(2);
        myCircularList.printList();
    }
}