package com.study.manyThread;


/**
 * 售票员类
 */
public class seller implements  Runnable{

    private Tickett  t;
    public seller(Tickett t){
        this.t=t;
    }
    public void run() {
        //线程持续保持售票状态

        while(true){
//synchronized(this) 每个不同的对象是不同的锁 所以用this不能锁住这段代码   所有的线程进入这段代码回并行执行  不回被锁住
//synchronized(sell.class) 因为new的所有sell对象是来自同一个sell类  所有sell.class能锁住这段代码 所有线程不回同时进入   会被锁住
         //   System.out.printlnt(Thread.currentThread().getName()+"进入run方法");
          synchronized (t){
             //   System.out.println(Thread.currentThread().getName()+"竞争到锁");
                if(t.getCount()<=0){
                    System.out.println("当前票数已经抢光");
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               t.setCount(t.getCount()-1);
                System.out.println(Thread.currentThread().getName()+"成功抢到票，当前剩余票数为:"+t.getCount());
          }
        }
    }
}
