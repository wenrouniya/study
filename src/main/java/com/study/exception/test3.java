package com.study.exception;

/**
 * 输出i=0;
 *在return的时候已经将操作数栈中的i弹出
 * finally再加1只是对局部变量表中的进行修改
 */
public class test3 {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static  int  test(){
        int i=0;
        try{
            return  i;
        }finally {
            i++;
        }
    }

        static{
            i=0;
           // System.out.println(i);//"非法前向引用”
        }
        static int i=1;



}
