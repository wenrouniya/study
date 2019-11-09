package com.study.Offer;

public class uglynum {
        public int GetUglyNumber_Solution(int index) {
            if(index<7){
                return index;
            }
            int[] num=new int [index];
            num[0]=1;
            int p2=0;
            int p3=0;
            int p5=0;
            for(int i=1;i<index;i++){
                num[i]=Math.min(Math.min(num[p2]*2,num[p3]*3),num[p5]*5);
                if(num[p2]*2==num[i]) p2++;
                if(num[p3]*3==num[i]) p3++;
                if(num[p5]*5==num[i]) p5++;

            }
            return num[index-1];

        }
    }

