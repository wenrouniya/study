package com.study.innerClass;

/**
 * 函数式接口：只有一个抽象方法的接口
 * lambda表达式形式：(参数列表)->{方法的实现}
 * lambda表达式的结果就是被当成对象
 */
public class testlambda {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i=0;i<10;i++){
                System.out.println(i);
            }
        };
    }
}
