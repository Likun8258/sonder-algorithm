package com.example.demo.listnode;

import java.util.ArrayList;

/**
 * @Author likun
 * @Date
 **/
public class Solution {

    /**
     * 反转链表 reverseListNode
     */
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode four = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = four;

        System.out.println(printListFromTailToHead(reverseListOne(first)));
        System.out.println(printListFromTailToHead(reverseListTwo(first)));
    }

    /**
     * 第一种思路
     */
    public static ListNode reverseListOne(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode reverseHead = null;
        ListNode current = head;
        ListNode tmp = null;
        ListNode pre = null;

        while (current != null) {
            tmp = current.next;
            current.next = pre;
            if (tmp == null) {
                reverseHead = current;
            }
            pre = current;
            current = tmp;
        }

        return reverseHead;
    }

    /**
     * 第二种思路
     */
    public static ListNode reverseListTwo(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    /**
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ListNode temp = listNode;
        while (temp != null) {
            a.add(new Integer(temp.val));
            temp = temp.next;
        }
//        Integer b;
//        for (int i = 0; i < a.size() / 2; i++) {
//            b = a.get(i);
//            a.set(i, a.get(a.size() - i - 1));
//            a.set(a.size() - i - 1, b);
//        }
        return a;

    }
}
