package com.study.manyThread;

//消费者线程
public class consumer implements  Runnable {

    private  breadFactory bf;
    public  consumer(breadFactory breadFactory){
        this.bf=breadFactory;
    }
    @Override
    public void run() {

        while(true){
            bf.consume();
        }
    }
}
