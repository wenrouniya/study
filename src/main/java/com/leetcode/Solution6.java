package com.leetcode;

public class Solution6 {
    public static  String ReverseSentence(String str) {
        String [] array=str.split(" ");
        reserve(array,0,array.length-1);
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<array.length;i++){
            stringBuffer.append(array[i]);
            if(i!=array.length-1){
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
    public  static void reserve(String []  arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static  void swap(String [] arr,int i,int j){
        String str=arr[i];
        arr[i]=arr[j];
        arr[j]=str;
    }

    public static void main(String[] args) {
        String s = new String("student. a am I");
        String s1 = ReverseSentence(s);
        System.out.println(s1);
    }
}