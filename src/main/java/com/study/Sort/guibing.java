package com.study.Sort;

/**
 * 归并排序 稳定 时间复杂度O(nlogn) 空间复杂度 O（N）N为压栈次数
 */
public class guibing {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    private  static void sort(int [] arr,int l,int r){
        if(l==r){
            return ;
        }
        int mid=l+((r-l)>>1);
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int p1=l;
        int p2=mid+1;
        int [] temp=new int[r-l+1] ;
        int i=0;
        while(p1<=mid&&p2<=r){
            temp[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=mid){
            temp[i++]=arr[p1++];
        }
        while(p2<=r){
            temp[i++]=arr[p2++];
        }
        //将temp赋值给元数组
        for(i=0;i<temp.length;i++){
            arr[l+i]=temp[i];
        }
    }
}
