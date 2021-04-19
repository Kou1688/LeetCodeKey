package com.LeetCodePractice.pro1_50.pro27;

/**
 * 27.移除元素
 */
public class Pro27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int numsLength = nums.length;
        int j = 0;
        for (int i = 0; i < numsLength; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
