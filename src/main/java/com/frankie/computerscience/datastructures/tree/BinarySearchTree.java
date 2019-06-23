package com.frankie.computerscience.datastructures.tree;

public class BinarySearchTree extends BinaryTree {
    public void insert(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            while (true) {
                if (currentNode.getData() < newNode.getData()) {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        break;
                    }
                    currentNode = currentNode.getRight();
                } else if (currentNode.getData() > newNode.getData()) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        break;
                    }
                    currentNode = currentNode.getLeft();
                } else {
                    // break if insert value equals current node value.
                    break;
                }
            }
        }
    }


}
