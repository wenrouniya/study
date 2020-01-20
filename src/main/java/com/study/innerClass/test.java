package com.study.innerClass;

/**
 * 不能再非静态内部类里定义静态成员
 *
 * 静态方法里也不能有非静态内部类
 *
 * 总结：非静态内部类种不能有静态方法、静态成员变量和静态代码块
 */
public class test {
    public class in{

    }

//    public static void main(String[] args) {
//        in in = new in();
//    }

    public static  void test11(){
//        new in();//静态方法种不能有非静态内部类
    }
}
