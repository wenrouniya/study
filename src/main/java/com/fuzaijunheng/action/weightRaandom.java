package com.fuzaijunheng.action;

import com.fuzaijunheng.domain.serverMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 加权+随机
 * 添加一个ip列表 按照权重大小像列表中添加Ip 权重大的添加的多
 * 最后用一个随机数 从列表中随机取值 即实现了按权重随机分配
 */
public class weightRaandom {
    public static ArrayList<String> ipList=new ArrayList<>();
    @Test
    public void test(){
        serverMap serverMap=new serverMap();
        //keySet的取值为乱序  作为迭代器的set
         Set <String> ipSet=serverMap.map.keySet();
        Iterator<String> iterator = ipSet.iterator();
        while(iterator.hasNext()){
            String server=iterator.next();
            Integer weight = serverMap.map.get(server);
            for(int i=0;i<weight;i++){
                ipList.add(server);
            }
        }

        for(int i=0;i<10;i++) {
            int length = ipList.size();
            Random random = new Random();
            int k= random.nextInt(length);
            System.out.println(ipList.get(k));
            System.out.println(k);
        }
    }
}
