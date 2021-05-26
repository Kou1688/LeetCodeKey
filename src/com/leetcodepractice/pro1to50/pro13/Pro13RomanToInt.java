package com.leetcodepractice.pro1to50.pro13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kou
 * @date: 2021/5/8 19:44
 * @Description: 罗马数字转整数
 * 字符串从左到右来，如果当前字符代表的值不小于其右边，就加上该值；
 * 否则就减去该值。以此类推到最左边的数，最终得到的结果即是答案
 */
public class Pro13RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);

        int result = 0;
        int temp = romanNumber.get(s.charAt(0));
        //遍历字符串
        /*
         * 先判断左边大于右边的多数情况，遍历到length-1.循环外加上最后一位数
         * */
        for (int i = 1; i < s.length(); i++) {
            int currentNum = romanNumber.get(s.charAt(i));
            if (temp >= currentNum) {
                result = result + temp;
            } else {
                result = result - temp;
            }
            temp = currentNum;
        }
        result = result + temp;
        return result;
    }
}
