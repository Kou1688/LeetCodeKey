package com.LeetCodePractice.pro301_350.pro344;

/**
 * @author Kou
 * @date: 2021/5/24 19:42
 * @Description: 反转字符串
 */
public class Pro344ReverseString {
    public void reverseString(char[] s) {
        int len = s.length, size = len;
        for (int i = 0; i < len / 2; i++) {
            size--;
            char temp = s[i];
            s[i] = s[size];
            s[size] = temp;
        }
    }
}
