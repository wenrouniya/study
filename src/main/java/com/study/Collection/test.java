package com.study.Collection;

import java.util.HashMap;
import java.util.Stack;

public class test{
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("123","23");
        Stack stack=new Stack();
        System.out.println("".equals(null));
        String s=new String("");
        System.out.println(s.length());
        boolean b=(s==null||s.length()==0);//检查字符串既不为空也不为null
        // 要先检查字符串是否为null 因为在null值上调用任何方法都会抛异常
        //若元素为null  即并没一个真正指向的java对象 在其上不能使用任何方法
        if(s!=null&&(s.isEmpty())){//在判断s是否为空时 要先判断字符串是否为null  否则使用isEmpty会抛出异常
            System.out.println(s);//输出了空串在控制台空了一行 注意观察哦
        }
      //  System.out.println(b);
        String s1="1";
        String s2="2";
        System.out.println(s1.equals(s2));
    }
}
