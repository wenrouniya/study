package com.study.Sort;

/***
 * 希尔排序
 * 将待排序的数组分成不同的间隔 先将这些间隔内的所有数字为一组进行插入排序
 * 间隔逐次减少为原来的一半
 * 当间隔为1是数组排序已经基本有序 此时进行的排序为直接插入排序
 *
 * 时间复杂度O（NLOGn）  空间复杂度O（1）
 * 不稳定
 * 最好情况o(n）  最坏 O（n2)
 *
 */
public class xier {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void sort(int [] arr){
        int N=arr.length;
        for(int gap=N/2;gap>0;gap/=2){
            for(int i=gap;i<N;i++){
                  int   insertVal=arr[i];
                int j=i-gap;
                while(j>=0&&arr[j]>insertVal){
                    arr[j+gap]=arr[j];
                    j=j-gap;
                }
                arr[j+gap]=insertVal;
            }
        }
    }

}
