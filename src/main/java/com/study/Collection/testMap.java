package com.study.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(4,5);
        int value=map.get(1);//get返回的是value  即 用key查value
        boolean key=map.containsValue(2);//containsValue 并不能返回key值  只能返回是否包value值
        boolean is = map.containsKey(1);//返回是否包含key值


        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();//返回集合中key value的映射
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer trueKEY=next.getKey();
            Integer trueValue=next.getValue();

            System.out.print(trueKEY);
            System.out.println("  "+trueValue);

        }

    }
}
