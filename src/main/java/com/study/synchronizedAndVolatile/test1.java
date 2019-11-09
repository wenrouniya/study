package com.study.synchronizedAndVolatile;

import java.util.HashMap;

/**
 * volatile 不能保证原子性  要在需要保证原子性的方法上加synchronized方法同步
 */
public class test1 {
    public static  volatile  int num=0;
    public static   synchronized void increa(){
        num++;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[10];
        for (int i=0;i<10;i++) {
        threads[i] =  new Thread(new Runnable() {
                public void run() {
                    for (int j=0;j<100;j++) {
                        increa();
                    }
                }
            });
        threads[i].start();
        }
        for (Thread th:threads){
            th.join();
        }
        System.out.println(num);
    }
   // HashMap
}

