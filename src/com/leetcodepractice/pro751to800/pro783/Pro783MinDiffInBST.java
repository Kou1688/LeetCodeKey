package com.leetcodepractice.pro751to800.pro783;

public class Pro783MinDiffInBST {
    /**
     * 二叉搜索树结点的最小距离
     * 即任意相邻两个结点的最小差值
     *
     * @param root 根结点
     * @return 返回树中任意两不同结点值之间的最小差值
     */
    private int pre;   //存放前驱结点的值
    private int result;

    public int minDiffInBST(TreeNode root) {
        result = Integer.MAX_VALUE;   //因为要求最小值,结果预设成最大int数
        pre = -1;   //
        ldr(root);
        return result;
    }

    private void ldr(TreeNode root) {
        if (root == null) { //基准条件
            return;
        }
        //中序遍历
        ldr(root.left);
        if (pre == -1) {   //设pre初值,即二叉树的最小结点

        } else {
            result = Math.min(root.val - pre, result);  //计算当前结点与它的前驱结点的差,并更新最小差
        }
        pre = root.val; //更新pre值
        ldr(root.right);
    }
}
