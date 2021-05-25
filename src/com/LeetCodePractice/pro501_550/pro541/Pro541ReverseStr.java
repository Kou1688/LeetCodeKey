package com.LeetCodePractice.pro501_550.pro541;

/**
 * @author Kou
 * @date: 2021/5/24 20:02
 * @Description:
 */
public class Pro541ReverseStr {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i = i + 2 * k) {
            int start = i, j = Math.min(i + k - 1, charArray.length - 1);
            while (start<j){
                char tmp = charArray[start];
                charArray[start++] = charArray[j];
                charArray[j--] = tmp;
            }
            /*int size = i + k;
            for (int j = i; j < i + k / 2; j++) {
                size--;
                char temp = charArray[j];
                charArray[j] = charArray[size];
                charArray[size] = temp;
            }*/
        }
        return new String(charArray);
    }
}
