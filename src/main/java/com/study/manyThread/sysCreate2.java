package com.study.manyThread;

/**
 * 线程的创建方法二：
 *继承Thread的类
 * 重写run方法
 * 创建该类的对象
 * 调用对象的start方法
 */
public class sysCreate2 extends Thread {

    @Override
    public void run() {
       for(int i=0;i<10;i++){
           System.out.println("这是第二个线程，当前下程的i值为"+i);
       }
    }

}
