package com.study.manyThread;

/**
 * 生产者--消费者模式
 * 面报工厂
 */
public class breadFactory {

    //面包个数计数器
    private int count=0;

    //生产面包的机器
    private  Object  o=new Object();
    //生产面包和消费面包的转换锁机制  一开始为false 是让！flag为true 让消费者线程先wait  生产者先生产
    private static boolean flag=false;

    //生产面包的方法
    public  void create(){
     synchronized(o){
            if(flag){
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
         System.out.println(Thread.currentThread().getName()+"生产了"+ ++count+"个面包");
                flag=!flag;//使自己的线程睡眠 即if条件成立
                o.notify();//唤醒其他wait状态的线程

      }
    }

    //消费面包的方法
    public void  consume(){
    synchronized (o){
            if(!flag){

                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //控制线程时间 让程序进行缓慢结果方便观察 与生产者消费者交换并没有实际意义
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        System.out.println(Thread.currentThread().getName()+"消费了第"+count+"个面包");
            flag=!flag;
            o.notify();

      }
    }


    public static void main(String[] args) throws InterruptedException {
        //notify唤醒的是持有同一个锁的线程 所以需要用同一个对象传给两个线程  让sychronized锁住的对象一致
        breadFactory breadFactory = new breadFactory();
        //breadFactory breadFactory1 =new breadFactory();
        creatre creater = new creatre(breadFactory);
        new Thread(creater).start();
        consumer consumer = new consumer(breadFactory);
        new Thread(consumer).start();


    }
}
