package com.frankie.computerscience.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue myQueue = new Queue();

    @Before
    public void setUp() {
        for (int x = 0; x < 5; x++) {
            myQueue.add(x);
        }
    }

    @Test
    public void isEmpty() {
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void add() {
        myQueue.add(5);
        System.out.println("add test: should print 0,1,2,3,4,5");
        myQueue.printQueue();
    }

    @Test
    public void remove() {
        assertEquals(myQueue.remove().getData(), 0);
        System.out.println("remove test: should print 1,2,3,4");
        myQueue.printQueue();
    }

    @Test
    public void peek() {
        assertEquals(myQueue.peek(), 0);
        System.out.println("peek test: should print 0,1,2,3,4");
        myQueue.printQueue();
    }
}