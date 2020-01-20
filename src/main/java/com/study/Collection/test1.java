package com.study.Collection;

import org.junit.Test;

import java.util.ArrayList;

public class test1 {
    private int a=0;
    private String str="adad";
    @Test
    public  void test(){
        //System.out.println(a);
        testt();
    }
    private void testt(){
      //  System.out.println(str);
        ArrayList ls=new ArrayList();
       ls.add(1);
       ls.add(2);
       ls.remove(ls.size()-1);
        System.out.println(ls.size());
    }

}

