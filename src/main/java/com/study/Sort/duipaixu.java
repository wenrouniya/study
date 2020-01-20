package com.study.Sort;

/**
 * 堆排序不稳定
 * 先构建大根堆 时间复杂度是O（NlogN) 空间复杂度 O（1）
 *
 */
public class duipaixu {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        heapCreate(arr,arr.length);
        //将大根堆的顶端与最后一个节点交换
        for(int j=arr.length-1;j>=0;j--){
            swap(arr,0,j);
            heapify(arr,0,j);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    //创建一个大根堆
    public static  void heapCreate(int [] arr,int n){
        int parent =(n-1)/2;
        for (int i=parent;i>=0;i--){
            heapify(arr,i,n);
        }

    }

    private static void heapify(int[] arr, int i, int n) {
        if(i>n) {
            return;
        }
        int c1=i*2+1;
        int c2=i*2+2;
        int max=i;
        if(c1<n&&arr[c1]>arr[max]){
            max=c1;
        }
        if(c2<n&&arr[c2]>arr[max]){
            max=c2;
        }
        if(max!=i){
            swap(arr,max,i);
            heapify(arr,max,n);
        }
    }

    private static void swap(int[] arr, int max, int i) {
        int temp=arr[max];
        arr[max]=arr[i];
        arr[i]=temp;
    }
}
