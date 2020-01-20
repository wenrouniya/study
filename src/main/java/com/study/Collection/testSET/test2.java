package com.study.Collection.testSET;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class test2 {
    @Test
    public  void test(){
        /**
         * 报错 treeSet中存储的元素类型必须一致
         */
        Set set=new TreeSet();
        set.add("123");
        set.add(456);
    }
}
