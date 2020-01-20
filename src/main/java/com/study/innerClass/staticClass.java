package com.study.innerClass;

import org.junit.Test;

/**
 * 静态内部类 可以有静态变量  可以访问外部类的静态变量 但不能访问外部类的实例变量
 * 因为static关键字的作用相当于把类的成员变量变成类相关的而不是类种的对象相关的
 * 内部类的外部是外部类 外部类的外部是包 所以 static只能修饰内部类而不能修饰外部类
 * 外部不能直接访问静态内部类的成员，但可以使用静态内部类打点调用
 */
public class staticClass {

    private int j=5;
    private static int k=20;
    static  class  inner {
        private  static int i=1;//静态内部类可以有静态变量
        private int f=20;
        public static void main(String[] args) {
            System.out.println(i);
//            System.out.println(j);//不能访问外部类的非静态变量
            System.out.println(k);
        }

    }

    @Test
    public  void test(){
        //System.out.println(i);//外部类不能直接访问静态内部类的变量
        System.out.println(inner.i);
//        System.out.println(inner.f);//打点也不能直接访问静态内部类的非静态变量  必须通过对象
        System.out.println(new inner().f);
    }




}
