package com.study.manyThread;

public class Tickett {

    private  volatile int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
