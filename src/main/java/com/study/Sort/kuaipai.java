package com.study.Sort;

/**
 * 快排是一种不稳定排序
 * 时间复杂度 O（NlogN）
 * 空间复杂度 O(N）  n为压栈的次数
 */
public class kuaipai {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        quickSort(arr,0,arr.length-1);
        //找到第一个数应该在的中间位置 对该位置左边和右边分别进行快排

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    private static void quickSort(int [] arr,int low,int high){
        if(low<high){
            int mid=getMid(arr,low,high);
            quickSort(arr,low,mid-1);
            quickSort(arr,mid+1, high);
        }

    }
    private static int getMid(int[] arr, int low, int high) {
        int temp=arr[low];
        while(low<high){
            while(low<high&&arr[high]>=temp){
                high--;
            }
            arr[low]=arr[high];
            while(low<high&&arr[low]<=temp){
                low++;
            }
            arr[high]=arr[low];
            arr[low]=temp;
        }
        return low;
    }

}
