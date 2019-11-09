package com.study.Offer;

public class ReverseList {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public static void main(String[] args) {
            int[] num = {1, 3, 5};
            ListNode head = null;
            ListNode cur = null;
            for (int i = 0; i < num.length; i++) {
                if (head == null) {
                    head = new ListNode(num[i]);
                    cur = head;
                } else {
                    cur.next = new ListNode(num[i]);
                    cur = cur.next;
                }
            }
            cur = reverseList(head);

        }

        public static ListNode reverseList(ListNode head) {
            ListNode first = new ListNode(0);
            ListNode node = null;
            //  boolean flag=true;
            if (head == null)
                return null;
            while (head != null) {
                if (first.next == null) {
                    first.next = head;
                    node = head.next;
                    head.next=null;
                    //     flag=!flag;
                } else {
                    head=first.next;
                   first.next=node;
                   node=node.next;
                   first.next=head;
                }
            }
            return first.next;
        }

    }
}
