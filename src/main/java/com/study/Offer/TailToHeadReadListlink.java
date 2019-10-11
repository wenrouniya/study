package com.study.Offer;

import java.util.Stack;

/**
 * 从尾到头打印链表 第二次自己思路
 * 利用栈 先进后出  不改变链表结构
 */
public class TailToHeadReadListlink {
   //定义一个链表节点
   static class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    //创建一个新的链表
    public  static ListNode makeListlink(int [] num){
        ListNode node=new ListNode(num[0]);
        node.next=addNode(node, 1, num);
        return node;
    }
    //创建一个新的节点
    public static ListNode addNode(ListNode node,int index,int[] num){
       if(index>num.length-1){
           return null;
       }
       ListNode newNode=  new ListNode(num[index]);
       newNode.next=addNode(newNode, index+1, num);
       return newNode;
   }
   //循环打印链表
    public static void printLinklist(ListNode head){
        if(head==null) {
            System.out.println("该链表为空");
        }else{
            ListNode node=head;
            while (node!=null){
                System.out.println(node.val);
                node=node.next;
            }
        }
    }
    //从尾部遍历链表
    public static   void tailToHead(ListNode head){
        Stack <ListNode>stack=new Stack();
        ListNode node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        //stack.empty() 为空时返回true 不为空时返回false
        while(!stack.empty()){
            node=stack.pop();
            System.out.println(node.val);
        }
    }

    public static void main(String[] args) {
        int [] arr={1,3,5,8};
       ListNode head= makeListlink(arr);
//        printLinklist(head);
        tailToHead(head);


    }
}
