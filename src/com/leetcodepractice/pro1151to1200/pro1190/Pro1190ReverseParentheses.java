package com.leetcodepractice.pro1151to1200.pro1190;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Kou
 * @date: 2021/5/26 19:18
 * @Description: 反转每对括号间的子串
 */
public class Pro1190ReverseParentheses {
    public String reverseParentheses(String s) {
        Deque<String> stack = new LinkedList<>();
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(str.toString());
                str.setLength(0);
            } else if (ch == ')') {
                str.reverse();
                str.insert(0, stack.pop());
            } else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
