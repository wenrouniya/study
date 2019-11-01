package com.study.leetcode;

import java.util.ArrayList;

/**
 * 判断一个数字是否是回文数
 */
public class isPalindrome9 {
    public static void main(String[] args) {
        boolean flag=test(-121);
        System.out.println(flag);
    }
    public  static boolean test(int x) {
        ArrayList arrayList = new ArrayList();
        if (x==0)
            return true;
        while (x != 0&&x>0) {
            arrayList.add(x % 10);
            x = x / 10;
        }

        int i=0;
        int j=arrayList.size()-1;
        while(i!=j&&i<j){
            if (arrayList.get(i++)!=arrayList.get(j--)){
                return  false;
            }
         }
        return true;
    }



}
