package com.study.Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class testColection {
    @Test
    public  void test(){
        Collection list=new ArrayList();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add(123);

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add(123);
        //将集合转换为数组
        Object [] arr=list.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        //Arrays类的静态方法 asList 可以将数组转换为集合  具体是集合中的list
       List list1 = Arrays.asList("aa","bb",123);
        System.out.println(list1);
    }
}
