package com.study;


public class testString {
    public static void main(String[] args) {

        new String();//类被final修饰  存储的String变量存在final char value[] 中  value在方法中的操作都是用final修饰的
        //所以所有的操作都是不可变的 在内存中生成String的那一刻就是不可变的  是线程安全的
        new StringBuilder();//类也被final修饰 但对字符串的操作 以append为例都不是原子操作  在多线程环境下会产生
        //线程不安全的问题
        new StringBuffer();//是线程安全的  被transient修饰的变量不hi被序列化 也就是说不会 被写入磁盘 只能在内存中获取
        //以appen为例  方法都是被sychronized修饰过的是线程安全的
        //效率方面 Stringbuilder>String >StringBuffe

    }
}
