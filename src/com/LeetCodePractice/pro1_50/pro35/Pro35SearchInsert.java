package com.LeetCodePractice.pro1_50.pro35;

/**
 * @author Kou
 * @date: 2021/5/8 21:07
 * @Description: 搜索插入位置
 */
public class Pro35SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return target > nums[mid] ? mid + 1 : mid;
    }
}
