package com.justin.algoexpert.top150.BinaryTreeGeneral;

/**
 * @author Justin Mathew @dev_io
 */
public class IsSameTree {
    public static void main(String[] args) {
        IsSameTree isSameTree = new IsSameTree();
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        root.left = left;
        root.right = right;
        right.left = rightLeft;
        right.right = rightRight;

        TreeNode root2 = new TreeNode(3);
        TreeNode left2 = new TreeNode(9);
        TreeNode right2 = new TreeNode(20);
        TreeNode rightLeft2 = new TreeNode(15);
        TreeNode rightRight2 = new TreeNode(7);
        root2.left = left2;
        root2.right = right2;
        right2.left = rightLeft2;
        right2.right = rightRight2;

        System.out.println(isSameTree.isSameTree(root, root2));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);
    }
}
