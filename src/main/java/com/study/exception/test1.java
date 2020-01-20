package com.study.exception;

public class test1 {
    public static void main(String[] args) {
       int i= method();
        System.out.println("main方法被执行");
        System.out.println("i======"+i);
    }
    public static  int  method(){
        try {
           int i= 1/0;
            System.out.println("try中的方法");
        }catch (Exception e){
            System.out.println("catch中的方法");

            return 0;
        }finally {
            System.out.println("finall中的方法");
            return 1;
        }
    }
}
