package com.frankie.computerscience.datastructures.linkedlist;

import org.junit.Before;
import org.junit.Test;

// semi manual testing
public class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> myLinkedList;

    @Before
    public void setUp(){
        myLinkedList = new SinglyLinkedList();
        for (int x = 1; x <= 5; x++){
            myLinkedList.append(x);
        }
    }

    @Test
    public void testAppend() {
        System.out.println("Should print 1 to 6");
        myLinkedList.append(6);
        myLinkedList.printList();
    }

    @Test
    public void testPrepend() {
        System.out.println("Should print 0 to 5");
        myLinkedList.prepend(0);
        myLinkedList.printList();
    }

    @Test
    public void testDeleteValue() {
        System.out.println("Should print 1,2,3,5");
        myLinkedList.deleteValue(4);
        myLinkedList.printList();
    }

    @Test
    public void testReverse() {
        System.out.println("Should print 5 to 1");
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}