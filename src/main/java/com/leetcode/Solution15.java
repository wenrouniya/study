package com.leetcode;

import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution15 {

    private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>(){
        @Override
        public int compare(Integer o1,Integer o2){
            return o2-o1;
        }
    });
    int count=0;
    public void Insert(Integer num) {
        if(count%2==0){//偶数
            maxHeap.offer(num);
            int max=maxHeap.poll();
            minHeap.offer(max);
        }else{//奇数
            minHeap.offer(num);
            int min=minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        if(count%2==0){
            return new  Double ((maxHeap.peek()+minHeap.peek())/2);

        }else{
            return new Double(minHeap.peek());
        }

    }


}
