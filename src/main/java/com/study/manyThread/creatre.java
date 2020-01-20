package com.study.manyThread;

//生产者线程
public class creatre implements  Runnable {

    private  breadFactory bf;
    public    creatre(breadFactory breadFactory){
        this.bf=breadFactory;
    }
    @Override
    public void run() {
        while(true){
            bf.create();
        }

    }
}
