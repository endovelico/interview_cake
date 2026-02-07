package com.interviewcake.solutions.p586;

public class ValidateBST {

    // Function to check if tree is a valid BST
    public static boolean isValidBST(BinaryTreeNode node) {
        return isValidBSTHelper(node, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(BinaryTreeNode node, long minValue, long maxValue) {
        if (node == null) return true;
        if (node.value <= minValue || node.value >= maxValue) return false;
        return isValidBSTHelper(node.left, minValue, node.value) &&
                isValidBSTHelper(node.right, node.value, maxValue);
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.insertLeft(5);
        root.insertRight(15);
        root.left.insertLeft(2);
        root.left.insertRight(7);

        System.out.println(isValidBST(root)); // Output: true
    }
}
