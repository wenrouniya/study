package com.study.Offer;


import javax.sound.midi.SoundbankResource;

/**
 * 一个数组奇数有序 偶数逆序
 * 将其合并为一个升序的单项链表
 */
public class mergeLink {
    static class linkNode{
        int val;
        linkNode next;
        public linkNode( int val){
            this.val=val;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        int [] nums={8,5,6,7,4,9,2};
        int r;
        if (nums.length%2==1){
            //长度时奇数
            r=(nums.length+1)/2;
        }
        else{
            r=nums.length/2;
        }
        int [] jnums=new int[nums.length/2];
        int [] onums=new int[r] ;

        sort(nums,jnums,onums);
       linkNode node =createLink(nums);
       while(node.next!=null){
           System.out.print(node.val+"   ");
           node=node.next;
       }

    }
    public static void sort(int [] nums,int [] jnums,int [] onums){
        int i=0;
        int len=nums.length;
        int j=0;
        int k=0;
        while(i<len){
            if (i%2==0){
                onums[j++]=nums[i];
            }else{
                jnums[k++]=nums[i];
            }
            i++;
        }
        reverse(onums);
        merge(nums,jnums,onums);
    }
    //将偶数数组逆序
    public static  void reverse(int [] onums){
        int i,j;
        int temp;
        for (i=0,j=onums.length-1;i<j;i++,j--){
             temp=onums[i];
            onums[i]=onums[j];
            onums[j]=temp;
        }
    }

    //将两个数组合并
    public  static  void merge(int []nums, int [] jnums,int [] onums) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[jnums.length + onums.length];
        while (i < jnums.length && j < onums.length) {
            temp[k++] = jnums[i] < onums[j] ? jnums[i++] : onums[j++];
        }
        while (i < jnums.length) {
            temp[k++] = jnums[i++];
        }
        while (j < onums.length) {
            temp[k++] = onums[j++];
        }
        k=0;
        for (i=0;i<nums.length;i++){
            nums[k++]=temp[i];
        }

    }
    public static linkNode createLink(int []nums){
        linkNode head=new linkNode(nums[0]);
        linkNode now = null;
        for (int i=1;i<nums.length;i++){
            linkNode node=new linkNode(nums[i]);
            if (head.next==null){
                head.next=node;
                now=node;
            }else{
                now.next=node;
                now=node;
            }
        }
        return head;

    }

}
