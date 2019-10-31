package com.study.EightSort;

/**
 * 希尔排序
 */
public class xier {
    public static void main(String[] args) {
        int [] arr={9,1,2,5,7,4,8,6,3,5};
        shellSort( arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
    public static  void shellSort(int[] arr){
        int N=arr.length;
        for (int gap=N/2;gap>0;gap/=2){
            for (int i=gap;i<N;i++){
                insetSort(arr,gap,i);
            }
        }
    }

    private static void insetSort(int[] arr, int gap, int i) {
        int insertVal=arr[i];
        int j;
        for(j=i-gap;j>=0&&insertVal<arr[j];j-=gap){
            arr[j+gap]=arr[j];
        }
        arr[j+gap]=insertVal;
    }
}
