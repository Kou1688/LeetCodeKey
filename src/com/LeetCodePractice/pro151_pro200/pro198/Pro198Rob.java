package com.LeetCodePractice.pro151_pro200.pro198;

public class Pro198Rob {
    /**
     * 打家劫舍(动态规划)
     *
     * @param nums 需要计算的数组
     * @return 能得到的最大值
     */
    public int rob(int[] nums) {
        //return rec_opt(nums, nums.length - 1);

        return dp_opt(nums);
    }

    /**
     * 递归求解打家劫舍(容易超时)
     *
     * @param arr 需要计算的数组
     * @param i   数组的长度-1
     * @return 返回最大值
     */
    private int rec_opt(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        } else if (i == 1) {
            return Math.max(arr[0], arr[1]);
        } else {
            int yesNum = rec_opt(arr, i - 2) + arr[i];
            int noNum = rec_opt(arr, i - 1);
            return Math.max(yesNum, noNum);
        }
    }

    /**
     * 动态规划求解打家劫舍
     *
     * @param arr 需计算的数组
     * @return 返回最大值
     */
    private int dp_opt(int[] arr) {
        int[] opt = new int[arr.length];
        if (opt.length == 1) {
            opt[0] = arr[0];
            return opt[0];
        } else if (opt.length == 0) {
            return 0;
        }
        opt[0] = arr[0];
        opt[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int yesNum = opt[i - 2] + arr[i];
            int noNum = opt[i - 1];
            opt[i] = Math.max(yesNum, noNum);
        }
        return opt[arr.length - 1];
    }
}
