package com;

import java.util.PriorityQueue;

/**
 *进行位运算的部分必须带（）
 */
public class testWeiyunsuan {
    public static void main(String[] args) {
//        int i=1;
//        int j=3;
//        int k=((j-i)>>1)+i;
//        System.out.println(k);
       PriorityQueue min= new PriorityQueue<Integer>();
       min.offer(1);
       min.offer(5);
       min.offer(2);
       min.offer(3);
       min.offer(4);
        System.out.println(min.peek());
        System.out.println(min.poll());

    }
}
