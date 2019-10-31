package com.study.Offer;



import java.util.List;
import java.util.Stack;

/**
 * 从尾部到头打印链表
 */
public class TailToReadListlink{
    private static class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    //添加节点
    public static ListNode addListNode(ListNode node, int index, int []num) {
        // 条件
        if (index > num.length - 1) {
            return null;
        }
        // 核心算法
        ListNode newNode=new ListNode(num[index]);
        newNode.next= addListNode(newNode,index+1,num);
        return newNode;
    }

    //创建一个新的链表
    public  static  ListNode tailToReadListlink(int []num) {
        if (num == null || num.length < 1) {
            return null;
        }
        ListNode res = new ListNode(num[0]);
        res.next = addListNode(res, 1, num);
        return res;
    }
    public static void main(String[] args) {
        int [] num={1,2,5,3,8};
        ListNode node = tailToReadListlink(num);
        System.out.println(node.val);

    }
}

