package com.frankie.computerscience.datastructures.tree;

import com.frankie.computerscience.datastructures.Queue;

public class BinaryTree {

    protected Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private void inorderTraversal(Node node) {
        /*
        depth first:
            left root right
         */
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.println(node.getData());
            inorderTraversal(node.getRight());
        }
    }

    // overloaded public traversal method calling private traversal method with the actual logic
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void preorderTraversal(Node node) {
        /*
        depth first:
            root left right
         */
        if (node != null) {
            System.out.println(node.getData());
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void postorderTraversal(Node node) {
        /*
        depth first:
            left right root
         */
        if (node != null) {
            postorderTraversal(node.getLeft());
            postorderTraversal(node.getRight());
            System.out.println(node.getData());
        }
    }

    public void breadthFirstTraversal() {
        Queue<Node> nodeQueue = new Queue<Node>();

        if (root != null) {
            nodeQueue.add(root);
        }

        while (!nodeQueue.isEmpty()) {
            /*
            Note: queue returns Queue Node object which contains Tree Node object, thus getter was called twice.
            First getter to get Tree Node, second getter to get data from Tree Node
             */
            Node currentNode = nodeQueue.remove().getData();
            // add left node to queue if not null
            if (currentNode.getLeft() != null) {
                nodeQueue.add(currentNode.getLeft());
            }
            // add right node to queue if not null
            if (currentNode.getRight() != null) {
                nodeQueue.add(currentNode.getRight());
            }
            System.out.println(currentNode.getData());
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }
}
