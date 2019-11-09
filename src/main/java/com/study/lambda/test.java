package com.study.lambda;

import java.util.ArrayList;

/**
 * ()->{}
 * () 为参数列表  没有可以不写
 * {} 为lambda表达体
 *
 * 只适用于函数式接口：有且只有一个方法的接口
 *
 */
public class test {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.set(1, 1);
        arrayList.set(2, 2);
        arrayList.set(3, 3);
        arrayList.set(4, 4);
        arrayList.forEach(n ->System.out.println(n));

        StringBuilder sb=new StringBuilder();
    }

    //等价于
    //()->3.14;
    public double test(){
        return 3.14;
    }


}
