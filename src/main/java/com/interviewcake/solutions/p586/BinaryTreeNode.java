package com.interviewcake.solutions.p586;

class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    // Constructor
    public BinaryTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // Insert left child
    public BinaryTreeNode insertLeft(int value) {
        this.left = new BinaryTreeNode(value);
        return this.left;
    }

    // Insert right child
    public BinaryTreeNode insertRight(int value) {
        this.right = new BinaryTreeNode(value);
        return this.right;
    }
}
