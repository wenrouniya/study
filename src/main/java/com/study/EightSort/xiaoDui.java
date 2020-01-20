package com.study.EightSort;

public class xiaoDui {
    public static void main(String[] args) {
        int[] array = {0, 60, 10, 80, 40, 90, 50};
        heapSort(array, 7);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

    }

    private static void heapSort(int[] array, int n) {
        int parent=(n-1)/2;
        for(int i=parent;i>=0;i--){
            heapfiy(array,n,i);
        }
        //现在建立的是小根堆 根节点为最小值
        for(int i=n-1;i>=0;i--){
            swap(array,0,i);
            heapfiy(array,i,0);
        }
    }

    private static void heapfiy(int[] array, int n, int i) {
        if(i>n){
            return;
        }
        int c1=i*2+1;
        int c2=i*2+2;
        int min=i;
        if(c1<n&&array[c1]<array[min]){
            min=c1;
        }
        if(c2<n&&array[c2]<array[min]){
            min=c2;
        }
        if(min!=i){
            swap(array,min,i);
            heapfiy(array,n,min);
        }
    }

    private static void swap(int[] array, int min, int i) {
        int temp=array[min];
        array[min]=array[i];
        array[i]=temp;
    }
}
