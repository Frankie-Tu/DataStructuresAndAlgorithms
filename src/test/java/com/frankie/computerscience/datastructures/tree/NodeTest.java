package com.frankie.computerscience.datastructures.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    private static Node myNode;

    @BeforeClass
    public static void setup() {
        myNode = new Node(1);
        myNode.setLeft(new Node(2));
        myNode.setRight(new Node(3));
        System.out.println(String.format("root node: %s", myNode));
        System.out.println(String.format("root node data: %s", myNode.getData()));
        System.out.println(String.format("left node: %s", myNode.getLeft()));
        System.out.println(String.format("left node data: %s", myNode.getLeft().getData()));
        System.out.println(String.format("right node: %s", myNode.getRight()));
        System.out.println(String.format("right node data: %s", myNode.getRight().getData()));
    }

    @Test
    public void getLeftTest() {
        assertEquals(myNode.getLeft().getData(),2);
    }

    @Test
    public void getRightTest() {
        assertEquals(myNode.getRight().getData(), 3);
    }
}