package com.study.Sort;

/**
 * 冒泡排序
 * 时间复杂度O（n2） 空间复杂度 O（1）
 * 是稳定的
 */

public class maopao {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
