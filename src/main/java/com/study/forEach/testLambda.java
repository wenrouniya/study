package com.study.forEach;

import java.util.ArrayList;
import java.util.List;

public class testLambda {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<1000;i++){
            list.add(i);
        }
        long strat=System.currentTimeMillis();
        list.forEach(item-> System.out.println(item));
        long end=System.currentTimeMillis();
        System.out.println("lamdam表达式用时时间"+(end-strat)+"ms");

        long strat1=System.currentTimeMillis();
        for (Integer item:list){
            System.out.println(item);
        }
        long end1=System.currentTimeMillis();
        System.out.println("forEach的表达式用时时间"+(end1-strat1)+"ms");
        //结论 ：非lanbda表达式的用时少
    }
}
