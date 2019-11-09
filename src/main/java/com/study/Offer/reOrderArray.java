package com.study.Offer;

public class reOrderArray {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7};
        reOrderedArray(num);

    }

        public static void reOrderedArray(int [] array) {
            int len=array.length;
            int [] num=new int [len];
            int p=0;
            int q=len-1;
            for(int i=0,j=len-1;i<len&&j>-1;i++,j--){
                if(array[i]%2==1){
                    num[p++]=array[i];
                }
                if(array[j]%2==0){
                    num[q--]=array[j];
                }
            }
            for(int i=0;i<len;i++){
                array[i]=num[i];
            }
        }
    }

