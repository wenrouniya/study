package com.study.Offer;

import static java.lang.Math.pow;

public class cutRope {

    public static void main(String[] args) {
        int i=8;
       int max= cutRope2(i);
        System.out.println(max);
    }
        /*
         *动态规划
         */
        public static int cutRope1(int target) {
            if(target<2){
                return 0;
            }if(target==2){
                return 1;
            }if(target==3){
                return 2;
            }
            int [] maxNum=new int[target+1];
            maxNum[0]=0;
            maxNum[1]=1;
            maxNum[2]=2;
            maxNum[3]=3;

            int max=0;
            for(int i=4;i<=target;i++){
                max=0;
                for(int j=1;j<=target/2;j++){
                    int cur=maxNum[j]*maxNum[i-j];
                    if(max<cur){
                        max =cur;
                    }
                }
                maxNum[i]=max;
            }
            return maxNum[target];

        }

    /**
     * 贪心算法
     */
    public static int cutRope2(int target) {
        if(target<2){
            return 0;
        }if(target==2){
            return 1;
        }if(target==3){
            return 2;
        }

        int timesOf3=target/3;//尽可能多的减成3
        if(target-3*timesOf3==1){
            timesOf3-=1;//2*2>1*3

        }
        int timeOf2=(target-3*timesOf3)/2;
        return (int) ((int)pow(3,timesOf3)*pow(2,timeOf2));



    }

    }
