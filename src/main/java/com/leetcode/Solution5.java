package com.leetcode;

public class Solution5 {
    /*
    *借助反转 先
    //1.反转要移位的部分
    // 2. 反转其余部分
    // 3. 整体反转
    */
    public  static String LeftRotateString(String str,int n) {
        if(n<0||n>str.length()){
            return str;
        }
        char [] strArray=str.toCharArray();
        reserve(strArray,0,n-1);
        reserve(strArray,n,str.length()-1);
        reserve(strArray,0,str.length()-1);
        return new String(strArray);

    }
    public static  void reserve(char [] array,int start,int end){
        while(start<end){
            swap(array,start,end);
            start++;
            end--;
        }
    }
    public  static void swap(char []  str,int a,int b){
       char t=str[a];
       str[a]=str[b];
       str[b]=t;
    }

    public static void main(String[] args) {
        String str=new String("hello");
      String s=  LeftRotateString(str,2);
        System.out.println(s);
    }
}
