package com.study.Offer;

import java.util.Stack;

/**
 * 20191014 chuangjian lianbiao 2
 *
 */
public class createLinklist2 {
    static class linkNode{
         private int data;
         private linkNode next;
         public linkNode(int data){
             this.data=data;
         }

         public static linkNode createLinklist(int [] num){
             linkNode node=new linkNode(num[0]);
             int index=0;
             node.next=addNode(num,index+1);
             return  node;
         }
         public static linkNode addNode(int [] num,int index){
             if(index>num.length-1){
                 return null;
             }
             linkNode newNode=new linkNode(num[index]);
             newNode.next=addNode(num,index+1);
             return  newNode;
         }
         public static void printLink(linkNode node){
             if (node==null){
                 System.out.println("null!!");
             }else {
                 while (node != null) {
                     System.out.println(node.data);
                     node = node.next;
                 }
             }
         }
         //
         public static void FTOprint(linkNode node){
             Stack< linkNode> stack=new Stack();
             while(node!=null){
                 stack.push(node);
                 node=node.next;
             }
             while(!stack.empty()){
                 linkNode nowNode=stack.pop();
                 System.out.println(nowNode.data);
             }
         }


         public static void reversePrint(linkNode node){
             if(node.next!=null){
                 reversePrint(node.next);
             }

             System.out.println(node.data);
         }



        public static void main(String[] args) {
            int a[]={2,5,8,0};
            linkNode head=createLinklist(a);
            printLink(head);
            //tail to head print linklist
            System.out.println("================");
            FTOprint(head);
            System.out.println("===========================");
            reversePrint(head);
        }

    }
}
