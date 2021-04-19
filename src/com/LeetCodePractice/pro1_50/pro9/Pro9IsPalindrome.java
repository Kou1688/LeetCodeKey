package com.LeetCodePractice.pro1_50.pro9;

public class Pro9IsPalindrome {
    /**
     * 回文数
     *
     * @param x 需要判断的数
     * @return 是回文true不是回文false
     */
    public boolean isPalindrome(int x) {
        //此题不需要考虑溢出,在此题中如果一个数是回文数,那么它必不可能溢出
        //运行时间9ms
        /*int result = 0;
        int temp = x;
        if (x < 0 || temp % 10 == 0 && x != 0) {
            return false;
        } else {
            while (x != 0) {
                int endNum = x % 10;
                x = x / 10;
                result = result * 10 + endNum;
            }
            if (result == temp) {
                return true;
            } else {
                return false;
            }
        }*/

        //为了严谨,考虑溢出的情况,那么我们只需反转末尾一半的数字,
        //重点在于如何判断已经反转一半
        //运行时间11ms
        int result = 0;
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        while (x > result) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return x == result || x == result / 10;
    }
}
