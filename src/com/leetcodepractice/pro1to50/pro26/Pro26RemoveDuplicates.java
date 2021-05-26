package com.leetcodepractice.pro1to50.pro26;

/**
 * 26. 删除有序数组中的重复项
 */
public class Pro26RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int numsLength = nums.length;
        //有序数组中重复项一定是连续的
        if (numsLength == 0) {
            return 0;
        }
        //第一个元素不用动,从第二个开始覆盖
        int left = 1;
        for (int right = left; right < numsLength; right++) {
            if (nums[right - 1] != nums[right]) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}
