package com.study.Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testList {
    /**
     * list接口的常用方法
     * list 元素有序  可重复
     * 元素有序体现在 list中增加了很多依据索引操作的方法 eg:get(int index)
     *
     */
    @Test
    public void test1(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);

        List list1= Arrays.asList(1,2,3);
        list.addAll(list1);
        System.out.println(list.size());//2+3

        list.add(list1);
        System.out.println(list.size());//5+1

        //indexOf（o'b'j ）返回obj首次在list中出现的位置  没有则返回-1
        //lastIndexOf(obj) 返回obj在list中最后一次出现的位置
        System.out.println(list.indexOf(456));
        list.add(456);
        System.out.println(list.lastIndexOf(456));

        //remove(int index) 删除指定位置的元素  返回删除位置的元素  remove(Object o)删除元素o  o为自动装箱的元素
        list.remove(0);
        list.remove("456");

        System.out.println(list);
        //set(int index ,object o)将index索引处的值改为o
        //返回从2到4 的list  左闭右开
        List list2 = list.subList(2,4);
        System.out.println(list2);
    }

}
