package com.study.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class foreachTest {
    /**
     * jdk1.5 使用的增强foreach循环
     * 用于遍历集合和数组
     * Vector
     */
  public void test1(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");
        collection.add(123);
        collection.add(new String("tom"));
       //for（集合元素的类型 局部变量：集合对象）
        for(Object object :collection){
            System.out.println(object);
        }
    }

}
