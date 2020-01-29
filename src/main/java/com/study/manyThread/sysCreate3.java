package com.study.manyThread;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口  实现它的call方法
 * 该线程的逻辑写在call方法中
 */
public class sysCreate3 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i=0;i<10;i++){
            System.out.println("这是第三个线程，当前线程的i值为"+i);
        }
        return null;
    }
}
