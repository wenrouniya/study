package com.study.leetcode;

import java.util.ArrayList;

public class reverse7 {
    public static void main(String[] args) {
        int x=1534236469;
       int y= reverse(x);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(y);
    }

        public static int   reverse(int x) {
        if (x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
            return 0;
        }
            ArrayList arrayList=new ArrayList();
            int i=0;
            while(x!=0){
                arrayList.add(x%10);
                x=x/10;
            }
            int y=0;
            for(i=0;i<arrayList.size();i++){
                int temp=(int)arrayList.get(i);
                y = (y * 10) + temp;
            }
            return y;

        }

}
