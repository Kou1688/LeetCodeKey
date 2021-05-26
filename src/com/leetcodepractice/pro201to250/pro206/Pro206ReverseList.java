package com.leetcodepractice.pro201to250.pro206;

/**
 * @author Kou
 * @date: 2021/5/19 19:41
 * @Description: 反转链表 迭代
 */
public class Pro206ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
