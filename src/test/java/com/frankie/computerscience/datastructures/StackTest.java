package com.frankie.computerscience.datastructures;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class StackTest {

    Stack myStack = new Stack();

    @Before
    public void setup() {
        for (int x = 0; x < 5; x++) {
            myStack.push(x);
        }
    }

    @Test
    public void isEmpty() {
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void pop() {
        myStack.pop();
        System.out.println("pop test: should print 3,2,1,0");
        myStack.printStack();
    }

    @Test
    public void push() {
        myStack.push(5);
        System.out.println("push test: should print 5,4,3,2,1,0");
        myStack.printStack();
    }

    @Test
    public void peek() {
        assertEquals(myStack.peek(), 4);
        System.out.println("peek test: should print 4,3,2,1,0");
        myStack.printStack();
    }
}