package com.study.innerClass;

import org.junit.Test;

/**
 * 非静态内部类 调用可以访问外部类的任何方法 及变量
 * 但外部类不能访问内部类的实例成员 因为非静态内部类可能不存在 对于外部类来说  必须显示的new一个内部类
 */
public class noStatic {

    private  String  c="外部类的private 变量";
    public  String  d="外部类的public 变量";

    class inner{
        private  String  a="内部类的private 变量";
        public  String  b="内部类的public 变量";
        //private static  String string = "内部类的私有静态变量";//非静态内部类不能有静态变量
        public  inner(){
            System.out.println(c);
            System.out.println(d);
        }
    }
    @Test
    public void test1(){
        inner inner = new inner();
        System.out.println(inner.a);//可以通过new一个非静态内部类 来调用他的方法
        System.out.println(inner.b);
    }
}
