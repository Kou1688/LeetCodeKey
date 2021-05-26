package com.leetcodepractice.pro1to50.pro21;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Pro21MergeTwoLists {
    /**
     * 合并两个有序链表
     *
     * @param l1 链表l1
     * @param l2 链表l2
     * @return 返回合并后的链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {   //基准条件
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {   //递归条件
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;  //返回小的结点
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
