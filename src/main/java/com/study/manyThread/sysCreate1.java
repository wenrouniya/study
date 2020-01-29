package com.study.manyThread;

/**
 * 创建线程的方法一:
 * 实现runnable接口 实现其中的run方法
 * 创建该对象 A
 * 创建Thread对象 将A当参数传入
 * 启动Thread对象的start方法
 *
 */
public class sysCreate1 implements Runnable {


    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("这是第一个线程，当前线程的i值为"+i);
        }
    }


}
