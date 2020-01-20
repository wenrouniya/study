package com.study.manyThread;

public class test1 implements  Runnable {
    @Override
    public void run() {
        int count=10;

        while(true){
            Thread.currentThread().setName("当前线程是滴几次运行"+count+"你要加油呀！");
            System.out.println(Thread.currentThread().getName());
            if(--count==0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        test1 test1 = new test1();
        new Thread(test1).start();

    }
}
