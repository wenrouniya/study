package com.study.Collection.testSET;

import org.junit.Test;

import java.util.*;

public class test3 {
    @Test
    public  void test(){
        Map map=new HashMap();
        map.put(123, 456);
        map.put(789, 123);
        map.put(234, 453);
        System.out.println(map);

        /**
         * 删除指定key的键值对
         * 返回value
         */
//        Object o=map.remove(123);
//        System.out.println(o);

        //遍历所有的key:keySet()
        Set set=map.keySet();
       Iterator iterator= set.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

       //遍历所有的value集 ：values()
        Collection values = map.values();
for (Object o1:values){
    System.out.println(o1);
}
//遍历所有的key-value
       Set set1= map.entrySet();
      Iterator iterator1=  set1.iterator();
      while (iterator1.hasNext()){
          Object next = iterator1.next();
          Map.Entry entry=(Map.Entry) next;
          System.out.println(entry.getKey()+"------>"+entry.getValue());
      }
    }
}
