package com.frankie.computerscience.datastructures.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    private static BinarySearchTree myTree;

    @Before
    public void setup() {
        myTree = new BinarySearchTree();
    }

    @Test
    public void insert() {
        /*
                        3
                      /   \
                    1      9
                  /  \    /
                0     2  4
                          \
                            6
         */
        myTree.insert(new Node(3));
        myTree.insert(new Node(1));
        myTree.insert(new Node(9));
        myTree.insert(new Node(2));
        myTree.insert(new Node(4));
        myTree.insert(new Node(1));
        myTree.insert(new Node(6));
        myTree.insert(new Node(0));
        System.out.println("insert test: should print 0,1,2,3,4,6,9");
        myTree.inorderTraversal();
    }

    @Test
    public void search() {
        /*
                5
               / \
              1   7
             / \   \
            2   3   9
         */
        myTree.insert(new Node(5));
        myTree.insert(new Node(1));
        myTree.insert(new Node(7));
        myTree.insert(new Node(3));
        myTree.insert(new Node(9));
        myTree.insert(new Node(2));

        assertEquals(myTree.search(2).getData(), 2);
        assertNull(myTree.search(10));
    }
}