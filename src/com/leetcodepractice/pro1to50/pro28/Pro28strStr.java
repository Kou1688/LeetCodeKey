package com.leetcodepractice.pro1to50.pro28;

public class Pro28strStr {
    public int strStr(String haystack, String needle) {
        //BF
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i + m <= n; i++) {   //i+m<=n因为遍历到短字符串+已遍历过的字符数=长链后再遍历就会超界了
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {//i+j因为已遍历过的i不需要考虑
                    flag = false;
                    break;
                }
            }
            if (flag) { //遍历needle完成,所有字符均为真,返回i(长字符串中比较的第一个位置)
                return i;
            }
        }
        return -1;
    }
}
