package com.leetcodepractice.pro1to50.pro1;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值
 * 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ProOneTwoSum {
    /**
     * 在数组中找到和为target的两个数
     *
     * @param nums   数组
     * @param target 目标和
     * @return 返回一个装有结果下标的数组
     */
    public int[] twoSum(int[] nums, int target) {
        //暴力遍历
        /*int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;*/
        //哈希表
        Map<Integer, Integer> numHash = new HashMap<>();    //key存储数值,value存储下标
        for (int i = 0; i < nums.length; i++) {
            if (numHash.containsKey(target - nums[i])) {    //找到符合条件的值
                return new int[]{numHash.get(target - nums[i]), i}; //将符合条件的value值与当前下标存入数组返回
            }
            numHash.put(nums[i], i);    //没有符合条件的key,将当前数值和下标存入散列表
        }
        throw new IllegalArgumentException("Could not find");   //没有找到,抛出异常
    }
}
