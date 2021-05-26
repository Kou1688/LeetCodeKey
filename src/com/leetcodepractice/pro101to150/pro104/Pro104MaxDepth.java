package com.leetcodepractice.pro101to150.pro104;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Pro104MaxDepth {
    /**
     * 返回二叉树最大深度
     *
     * @param root 根结点
     * @return 返回最大深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = maxDepth(root.left);  //递归左子树
        int maxRight = maxDepth(root.right);    //递归右子树
        return Math.max(maxLeft, maxRight) + 1; //左右子树的最大深度+根结点
    }
}
