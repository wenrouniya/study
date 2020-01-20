package com.study.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class singleExecutor {

    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        new ScheduledThreadPoolExecutor(1);
        newSingleThreadExecutor();
    }

}
