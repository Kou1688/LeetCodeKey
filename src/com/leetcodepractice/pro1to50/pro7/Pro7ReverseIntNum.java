package com.leetcodepractice.pro1to50.pro7;

public class Pro7ReverseIntNum {
    /**
     * 整数反转
     *
     * @param x 需要反转的整数
     * @return 返回x反转后的结果
     */
    public int reverse(int x) {
        int result = 0; //反转后的数
        while (x != 0) {
            int temp = x % 10;  //取末尾数字
            x = x / 10; //删除末尾数字
            //int取值范围是[-2147483648,2147483647]
            //如果result比MAX_VALUE/10位数大并且还有下一位数字时，一定溢出
            //如果result与MAX_VALUE/10相等并且新取的末尾数字大于MAX_VALUE的末尾数字，一定溢出
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && temp > 7) {
                return 0;
            } else if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && temp < -8) {
                return 0;
            }
            result = result * 10 + temp;
        }
        return result;
    }
}
