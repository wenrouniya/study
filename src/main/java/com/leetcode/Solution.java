package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 剑指offer
 * 最小的k个数：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * PriorityQueue 一个基于优先级的无界优先级队列。优先级队列的元素按照其自然顺序进行排序，或者根据构造队列时提供的 Comparator 进行排序，具体取决于所使用的构造方法。该队列不允许使用 null 元素也不允许插入不可比较的对象(没有实现Comparable接口的对象)。
 * PriorityQueue 队列的头指排序规则最小那哥元素。如果多个元素都是最小值则随机选一个。
 * PriorityQueue 是一个无界队列，但是初始的容量(实际是一个Object[])，随着不断向优先级队列添加元素，其容量会自动扩容，无需指定容量增加策略的细节。

 */
public class Solution {
    ArrayList<Integer> result=new ArrayList<Integer>();
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input==null||input.length==0||k<1||k>input.length){
            return result;
        }

        //用大根堆保存最小的k个树  每次只和堆顶比  如果比堆顶小 就删除堆顶 让新数入栈
        //PriorityQueue 为优先级队列 队列头为最小的数
        PriorityQueue<Integer> maxHeap=  new PriorityQueue(k,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2){
                //表示O2-O1升序排序  返回正数，零，负数各代表大于，等于，小于
                //返回整数的话（1） 就让o2在前面 返回负数的话 就让o1在前面
                return o2.compareTo(o1);
            }
        });
        for(int i=0;i<input.length;i++){
            if(maxHeap.size()!=k){//大顶堆的数字个数不等于k 将数组中的元素放入大顶堆一个
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek()>input[i]){//大顶堆的堆顶元素大于数组元素 将堆顶元素弹出 数组中元素入堆
                Integer temp=maxHeap.poll();
                temp=null;//为了GC
                maxHeap.offer(input[i]);
            }
        }

        for(Integer in:maxHeap){
            result.add(in);
        }
        return result;

    }
}

