package com.leetcode;

import java.util.*;
//创建最大堆 从大到小存值
public class Solution16 {
    ArrayList<Integer> list=new ArrayList<Integer>();
    PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>((o1,o2)->o2-o1);//大顶堆从大到小排列
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num==null||num.length<0||size<=0||size>num.length){
            return list;
        }
        int count=0;
        for(;count<size;count++){
            maxHeap.offer(num[count]);
        }
        while(count<num.length){
            list.add(maxHeap.peek());
            maxHeap.remove(num[count-size]);
            maxHeap.offer(num[count]);
            count++;
        }
        list.add(maxHeap.peek());
        return list;
    }
}
