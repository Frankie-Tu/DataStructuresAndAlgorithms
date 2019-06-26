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

    public Node search(int val) {
        Node currentNode = root;

        // when currentNode is null, either root is null or val is not found from traversal
        while (currentNode != null) {
            if (currentNode.getData() > val) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getData() < val) {
                currentNode = currentNode.getRight();
            } else {
                return currentNode;
            }
        }
        return null;
    }

    public Node findSuccessor(Node node) {
        Node returnNode = node;
        while (returnNode.getLeft() != null){
            returnNode = node.getLeft();
        }
        return returnNode;
    }

    public void delete(int val) {
        root = delete(root, val);
    }

    private Node delete(Node node, int val) {
        if (node.getData() > val && node.getLeft() != null) {
            node.setLeft(delete(node.getLeft(), val));
        } else if (node.getData() < val && node.getRight() != null) {
            node.setRight(delete(node.getRight(), val));
        } else { // If the node to be deleted is found or value not found in the tree at the end of traversal
            if (node.getLeft() != null && node.getRight() != null) { // has two children
                // the next min Node
                Node successor = findSuccessor(node.getRight());
                // copy the successor data over to the node we want to delete
                node.setData(successor.getData());
                // take successor node out of right child
                node.setRight(delete(node.getRight(), successor.getData()));
            } else if (node.getLeft() != null) { // has left child
                return node.getLeft();
            } else if (node.getRight() != null) { // has right child
                return node.getRight();
            } else { // has no children
                return null;
            }
        }
        // return the updated binary search tree
        return node;
    }
}
