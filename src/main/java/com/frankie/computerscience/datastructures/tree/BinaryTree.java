package com.frankie.computerscience.datastructures.tree;

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

    public void postorderTraversal() {
        postorderTraversal(root);
    }
}
