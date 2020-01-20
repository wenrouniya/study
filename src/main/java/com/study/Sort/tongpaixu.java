package com.study.Sort;

/**
 * 桶排序
 * 时间复杂度 O（N）
 * 空间复杂度O（N）N 为桶的长度
 * 稳定
 */
public class tongpaixu {
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        count_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    private static void count_sort(int []arr){
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            max=arr[i]>max?arr[i]:max;
        }
        int [] count=new int[max+1];
        //将当前元素的值放入下标对应的位置当中  count数组记录的是数值为i的个数
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int id=0;
        for(int i=0;i<=max;i++){
            //以个数为结束条件 将下表i赋值给arr id为arr中的下标 每赋值一次都持续递增
            for(int j=0;j<count[i];j++){
                arr[id++]=i;
            }
        }

    }
}
