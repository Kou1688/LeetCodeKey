package com.leetcodepractice.pro201to250.pro213;

import java.util.Arrays;

public class Pro213Rob2 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(dp_opt(Arrays.copyOfRange(nums, 1, nums.length)),
                dp_opt(Arrays.copyOfRange(nums, 0, nums.length - 1)));
    }

    private int dp_opt(int[] arr) {
        int[] opt = new int[arr.length];
        if (opt.length == 0) {
            return 0;
        } else if (opt.length == 1) {
            opt[0] = arr[0];
            return opt[0];
        }
        opt[0] = arr[0];
        opt[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < opt.length; i++) {
            int yesNum = opt[i - 2] + arr[i];
            int noNum = opt[i - 1];
            opt[i] = Math.max(yesNum, noNum);
        }
        return opt[opt.length - 1];
    }
}
