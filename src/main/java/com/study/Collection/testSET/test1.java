package com.study.Collection.testSET;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test1 {
    @Test
    public void test(){
        Set set=new HashSet();
        set.add("123");
        set.add(123);
        set.add("456");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
