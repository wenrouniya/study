package com.study.Offer;

public class removeNthFromEnd {
    static class ListNode{
        int val;
        ListNode next;



        public  ListNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        int [] num={1,2,3,4,5};
        ListNode head=new ListNode(num[0]);
         craeteLink(head,num,1);
        removeNthFromEnd(head,2);

    }
    public static void craeteLink(ListNode head ,int  [] nums,int i){
      if(i<nums.length){
          ListNode node=new ListNode(nums[i]);
          node.next=null;
          head.next=node;
          craeteLink(node,nums,++i);

      }

    }


    public static  ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode first=temp;
        ListNode second=temp;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return head;


    }
}
