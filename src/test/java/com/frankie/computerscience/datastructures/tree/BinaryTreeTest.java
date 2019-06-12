package com.frankie.computerscience.datastructures.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    /*
                1
              /   \
             2     3
           / \
          4   5
             /  \
            6    7
     */

    static BinaryTree myTree = new BinaryTree(1);

    @BeforeClass
    public static void setup() {
        myTree.getRoot().setLeft(new Node(2));
        myTree.getRoot().setRight(new Node(3));
        myTree.getRoot().getLeft().setLeft(new Node(4));
        myTree.getRoot().getLeft().setRight(new Node(5));
        myTree.getRoot().getLeft().getRight().setLeft(new Node(6));
        myTree.getRoot().getLeft().getRight().setRight(new Node(7));
    }


    @Test
    public void inorderTraversal() {
        System.out.println("inorderTraversal, should print: 4 2 6 5 7 1 3");
        myTree.inorderTraversal(myTree.getRoot());
    }


    @Test
    public void preorderTraversal() {
        System.out.println("preorderTraversal, should print: 1 2 4 5 6 7 3");
        myTree.preorderTraversal(myTree.getRoot());
    }

    @Test
    public void postorderTraversal() {
        System.out.println("postorderTraversal, should print: 4 6 7 5 2 3 1");
        myTree.postorderTraversal(myTree.getRoot());
    }
}