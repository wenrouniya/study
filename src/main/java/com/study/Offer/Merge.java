package com.study.Offer;

public class Merge {
    static  class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
    public static void main(String[] args) {
        int [] num={1,3,5};
        ListNode head=null;
        ListNode cur=null;

        for (int i=0;i<num.length;i++){
            if (head==null){
                head=new ListNode(num[i]);
                cur=head;
            }else{
                cur.next=new ListNode(num[i]);
                cur=cur.next;
            }
        }
        merge(head,null);

    }
        public static ListNode merge(ListNode list1,ListNode list2) {
            ListNode cur=null;
            ListNode head=null;
            while(list1!=null&&list2!=null){
                if(list1.val<list2.val){
                    if(head==null){
                        head=list1;
                        cur=head;
                    }else{
                        cur.next=list1;
                        cur=cur.next;
                    }
                    list1=list1.next;
                }else{
                    if(head==null){
                        head=list2;
                        cur=head;
                    }else{
                        cur.next=list2;
                        cur=cur.next;
                    }
                    list2=list2.next;
                }
            }
            if (list1!=null){
                if(head==null){
                    head=list1;
                }else{
                    cur.next=list1;
                }


            }
            if(list2!=null){
                if(head==null){
                    head=list2;
                }else{
                    cur.next=list2;
                }
            }
            return head;
        }

}
