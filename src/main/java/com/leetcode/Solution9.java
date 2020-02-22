package com.leetcode;

import java.util.*;
public class Solution9 {
    //条件：数字最大值最小值之差不大于五  数字中没有重复的数字  所有数字之差等于零的个数
    public static  boolean isContinuous(int [] numbers) {//numbers中的数字就是抽到的五个数字
        if(numbers==null||numbers.length<5){
            return false;
        }
        int  cnt=0;//统计0的个数
        Arrays.sort(numbers);
        for(int num:numbers){
            if(num==0){
                cnt++;
            }
        }
        int cha=0;//记录前后数字的差值
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==0){
                continue;
            }
            if(numbers[i]!=0&&numbers[i]==numbers[i+1]){
                return false;
            }
            cha+=numbers[i+1]-numbers[i]-1;
        }
        if(cnt==cha||cha==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] num=new int []{0,3,2,6,4};
        boolean continuous = isContinuous(num);
        System.out.println(continuous);
    }
}
