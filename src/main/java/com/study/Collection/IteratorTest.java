package com.study.Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    /**
     * 迭代器 对集合中的元素进行遍历操作 是由迭代器Iterator接口
     * 主要利用hasNext()和next()方法
     * Iterator是一个迭代器 并不存放元素 只用于遍历元素
     */
    @Test
    public  void test1(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");
        collection.add(123);
        collection.add(new String("tom"));
        Iterator iterator=collection.iterator();
        //iterator.next() 返回集合的下一个元素
        System.out.println(iterator.next());
        //判断是否还有下一个元素
        while(iterator.hasNext()){
            //指针下移 将下移的指针指向的元素返回
            System.out.println(iterator.next());
        }


        /**
         * 错误写法一
         * 想用next方法代替hasNext
         * 结果：会跳过元素并且抛出异常
         */
        while(iterator.next()!=null){
            System.out.println(iterator.next());
        }
    }
        @Test
        public void test2(){
            Collection collection = new ArrayList();
            collection.add("aa");
            collection.add("bb");
            collection.add("cc");
            collection.add(123);
            collection.add(new String("tom"));
//            Iterator iterator=collection.iterator();
            /**
             * 错误方式二 ：每次调用集合的iterator方法 就会返回一个新的Iterator对象  默认游标都在集合的第一个对象之前
             * 结果：会造成死循环 反复输出集合中第一个元素
             */
            while(collection.iterator().hasNext()){
                System.out.println(collection.iterator().next());
            }

    }
}
