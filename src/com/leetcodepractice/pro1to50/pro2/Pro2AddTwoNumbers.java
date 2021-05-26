package com.leetcodepractice.pro1to50.pro2;

public class Pro2AddTwoNumbers {
    /**
     * 两数相加
     *
     * @param l1 第一个数(链表逆序形式)
     * @param l2 第二个数(链表逆序形式)
     * @return 返回结果(链表)
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null; //头结点,用于标记结果链表
        ListNode last = null; //尾结点,尾结点没有上一个结点的信息
        int carry = 0;    //用来保存计算产生的进位值

        while (l1 != null || l2 != null) {
            //若l1不为空取val值,否则补零
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            int sumVal = num1 + num2 + carry;
            if (head == null) {    //第一次取值,需要给头结点值,以标记链表
                head = last = new ListNode(sumVal % 10);
            } else {
                last.next = new ListNode(sumVal % 10);   //因为每个结点只能存储一位数字,所以需要取余
                last = last.next;   //让last指向当前非空最后一个结点
            }
            carry = sumVal / 10;    //计算进位
            //遍历链表
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {    //若有进位,补一个结点
            last.next = new ListNode(carry);
        }
        return head;
    }
}
