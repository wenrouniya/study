package com.Thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();
    volatile int i = 1;//为1则线程tA打印，为2则线程tB打印，为3则线程C打印


    public void printA() {
        for (int i = 1; i <= 100; i++) {
            lock.lock();
            try {
                while (Demo.this.i != 1) {
                    conditionA.await();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
                Demo.this.i = 2;
                conditionB.signal(); //唤醒线程B
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public void printB() {
        for (int i = 1; i <= 100; i++) {
            lock.lock();
            try {
                while (Demo.this.i != 2) {
                    conditionB.await();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
                Demo.this.i = 3;
                conditionC.signal();//唤醒线程C
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public void printC() {
        for (int i = 1; i <= 100; i++) {
            lock.lock();
            try {
                while (Demo.this.i != 3) {
                    conditionC.await();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
                Demo.this.i = 1;
                conditionA.signal();//唤醒线程A
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        new Thread(()->{
            demo.printA();
        },"tA").start();
        new Thread(()->{
            demo.printB();
        },"tB").start();
        new Thread(()->{
            demo.printC();
        },"tC").start();
    }
}

