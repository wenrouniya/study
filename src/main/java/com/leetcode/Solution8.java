package com.leetcode;

import java.util.LinkedList;

public class Solution8 {
    public static  int LastRemaining_Solution(int n, int m) {//m表示循环的次数 n表示小朋友个数
        if(n<1||m<1)
            return -1;
        LinkedList<Integer> list=new LinkedList();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int index=0;
        while(list.size()>1){
            index=(index+m-1)%list.size();
            list.remove(index);
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        int i = LastRemaining_Solution(5, 3);
        System.out.println(i);
    }
}