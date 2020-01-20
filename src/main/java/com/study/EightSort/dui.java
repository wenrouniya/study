package com.study.EightSort;

public class dui {
    public static void main(String[] args) {
        int[] array = {0, 60, 10, 80, 40, 90, 50};
        heapSort(array, 7);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  ");
        }

    }

    public static void heapSort(int array[], int n) {

        int parent=(n-1)/2;
        for (int i = parent; i >= 0; i--) {
            HeapAdjust(array, i, n);//从下向上，从右向左调整
        }
        for(int i=n-1;i>=0;i--){
            swap(array,i,0);
            HeapAdjust(array,0,i);
        }

    }

    public static void HeapAdjust(int array[], int i, int n) {
        int c1=i*2+1;
        int c2=i*2+2;
        if(i>n){
            return ;
        }
        int max=i;
        if(c1<n&&array[c1]>array[max]){
            max=c1;
        }
        if(c2<n&&array[c2]>array[max]){
            max=c2;
        }
        if(max!=i){
            swap(array,i,max);
            HeapAdjust(array,max,n);
        }

    }

    public static void swap(int array[], int i, int j) {
        int temp;
         temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
