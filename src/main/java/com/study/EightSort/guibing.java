package com.study.EightSort;

/**
 * 归并排序：
 * 把两个以上有序表合并成一个新的有序表，即把待排序序列分称若干个子序列 每个子序列都是有序的，
 * 然后再把有序序列合并为整体有序序列
 */
public class guibing {
    public static void main(String[] args) {
        int [] nums={3,2,5,8,4,7,6,9};
        sort(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
    }

    //将整个数组不断拆分为很多个小数组
    public  static  void sort(int [] nums,int l,int r){
        if (l==r){
            return;
        }
        int mid=l+((r-l)>>1);
        sort(nums,l,mid);
        sort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    //将两个有序数组合并为一个
    public static  void merge(int [] nums,int l,int mid,int r){
        int [] temp=new int[r-l+1] ;
        int p1=l;
        int p2=mid+1;
        int i=0;

        //当两个数组都没有到达末尾时 同时遍历比较大小
        while(p1<=mid&&p2<=r){
            temp[i++]=nums[p1]<nums[p2]?nums[p1++]:nums[p2++];
        }
        while(p1<=mid){
            temp[i++]=nums[p1++];
        }
        while(p2<=r){
            temp[i++]=nums[p2++];
        }

        //将合并后的有序数组放入原数组 从起始位置开始放
        for(i=0;i<temp.length;i++){
            nums[l+i]=temp[i];
        }

    }
}
