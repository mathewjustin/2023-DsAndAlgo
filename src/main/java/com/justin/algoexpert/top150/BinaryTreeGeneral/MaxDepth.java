package com.justin.algoexpert.top150.BinaryTreeGeneral;

/**
 * @author Justin Mathew @dev_io
 */
public class MaxDepth {
    public static void main(String[] args) {
        MaxDepth maxDepth = new MaxDepth();
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        root.left = left;
        root.right = right;
        right.left = rightLeft;
        right.right = rightRight;
        System.out.println(maxDepth.maxDepth(root));
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return java.lang.Math.max(left_height, right_height) + 1;
        }


    }


}
