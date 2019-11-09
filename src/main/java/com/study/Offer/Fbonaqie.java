package com.study.Offer;

public class Fbonaqie {
        public int Fibonacci(int n) {
            if(n<=1){
                return 1;
            }
            int [] num={1,1};
            int i=0;
            while(i<n){
                num=  createNum(num[0],num[1]);
                i++;
            }
            return num[1];
        }
        public static int[]  createNum(int a,int b ){
            int c= a+b;
            int [] result={b,c};
            return result;
        }

}
