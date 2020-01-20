package com.study.Sort;

/**
 * 选择排序 不稳定 时间复杂度 O(n2) 空间复杂度 O(1)
 */
public class xuanze {

    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void  sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int k=i;
            for(int j=k+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            if(k!=i){
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
            }
        }
    }

}
