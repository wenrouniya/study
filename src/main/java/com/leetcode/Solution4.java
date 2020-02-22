package com.leetcode;
import java.util.ArrayList;
public class Solution4 {


        public  static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> result=  new ArrayList();
            //双指针 在数组中作为一个滑动窗口 根据现在窗口内数字大小 向左向右调整指针
            int plow=1;
            int phigh=2;
            while(plow<phigh){
                ArrayList<Integer> list=new ArrayList<Integer>();
                int temp=(plow+phigh)*(phigh-plow+1)/2;
                if(temp==sum){
                    for(int i=plow;i<=phigh;i++){
                        list.add(i);
                    }
                    result.add(list);
                    plow++;

                    //两个窗口都是从左边出发，
                    //不是两边夹逼。另外，当小于目标数时high++；大于目标数时low++，如果是high--，
                    //那么你仔细想想，你的窗口还怎么往后移动，整个结果在第一次大于目标数之后就不会往后移动，
                    //相反，而是在在这个low和high之间夹逼试探，最终啥都找不到或者只能找到一个。
                }else if(temp<sum){
                    phigh++;
                }else{
                    plow++;
                }
            }
            return result;

        }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result=   FindContinuousSequence(15);
        System.out.println(result);
    }
    }

