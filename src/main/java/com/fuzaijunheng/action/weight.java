package com.fuzaijunheng.action;

import com.fuzaijunheng.domain.serverMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * 设置权重法
 *
 *权重高的优先被选中
 *设置一个ip列表 依据权重的大小 将IP添加到列表中 权重大的添加的次数多
 * 最终从ip列表中顺序循环取值 即按照了IP权重取值
 */
public class weight {
    //存放可以被访问的ip的列表
    public  static ArrayList<String> list=new ArrayList<>();
    //标志访问list中的第几个ip
    public static int  index;
    @Test
    public void test(){
        //存放所有ip的容器 迭代他遍历容器
        Set<String> serverList=serverMap.map.keySet();
        //迭代器
        Iterator<String> iterator=serverList.iterator();
        //存放IP和权重的类
        serverMap serverMap = new serverMap();

        while(iterator.hasNext()) {
            String server = iterator.next();
            int weight = serverMap.map.get(server);
            for (int i = 0; i < weight; i++) {
                list.add(server);
            }
        }

        int i=0;
        while(i<list.size()){
            if(list.size()==0){
                System.out.println("现在没有可以服务的ip");
                return;
            }

            if(index>list.size()){
                index=0;
            }
            System.out.println(list.get(index));
            index++;
            i++;
        }



    }
    @Test
    public void test1() {
    }


}
