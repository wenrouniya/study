package com.Thread;

public class changeThread {
    public static  final Object o=new Object();
    public static void main(String[] args) {
       Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
            synchronized (o){
                for(int i=1;i<10;i+=2){
                    System.out.println(i);
                    o.notify();
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

            }
        });

       Thread t2=new Thread(new Runnable() {
           @Override
           public void run() {
               synchronized (o){
                   for(int i=2;i<10;i+=2){
                       System.out.println(i);
                       o.notify();
                       try {
                           o.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
               }


           }
       });
    t1.start();
    t2.start();
    }
}
