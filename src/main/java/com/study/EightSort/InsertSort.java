package com.study.EightSort;

/**
 * 直接插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr={2,3,8,6,9,5};
        for (int i=1;i<arr.length;i++){
            int insertVal=arr[i];//当前待插入数据
            int index=i-1;//待插入位置（准备和前一个数比较）
            while(index>=0&&arr[index]>insertVal){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=insertVal;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
