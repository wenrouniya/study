package com.leetcode;

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
一个快指针一个慢指针  两个同时走 若链表有环 定在环内相遇
一个指针再从链表头出发 另一个指针从相遇的地方出发 两个速度一致   相遇时就是链表头部

*/

public class Solution12 {
//
//    public ListNode EntryNodeOfLoop(removeNthFromEnd.ListNode pHead)
//    {
//        ListNode slow=pHead;
//        ListNode fast=pHead;
//        while(fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){//快慢指针找到相遇点
//                break;
//            }
//        }
//        if(fast==null||fast.next==null){
//            return null;//如果为null表示没有环 返回null
//        }
//        slow=pHead;
//        while(slow!=pHead){
//            slow=slow.next;
//            fast=fast.next;
//        }
//        return slow;
//    }
}
