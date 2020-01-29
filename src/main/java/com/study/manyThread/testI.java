package com.study.manyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 启动两个线程
 */
public class testI {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        sysCreate1 i1 = new sysCreate1();
        sysCreate2 i2 = new sysCreate2();
         sysCreate3 i3 = new sysCreate3();
        //包装-设计模式  因为i1是实现runnable方法
        Thread thread = new Thread(i1);
        thread.start();
     //i2继承的是Thread的类  Thread类有start方法
        i2.start();
        //i3线程的启动方法  执行器服务 执行器助手
        //但不推荐使用这种方法
        //Executors默认方法创建线程池，会允许创建最大长度为Integer.MAX_VALUE或者是大量的请求，从而导致OOM
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        Future submit = cachedThreadPool.submit(i3);
       // System.out.println(submit.get());
        cachedThreadPool.shutdown();
    }
}
