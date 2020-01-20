package com.study.Sort;

/**
 * 插入排序
 * 时间复杂度O（N2） 空间复杂度 O（1）
 * 是稳定的排序  适合于数组基本有序 待插入数字较少的情况
 */
public class charu {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public  static void sort(int []  arr){

        for(int i=1;i<arr.length-1;i++){
           int insertVal=arr[i];//要插入的数
            int index=i-1;//代插入的位置
            while(index>=0&&arr[index]>insertVal){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=insertVal;
        }
    }
}
