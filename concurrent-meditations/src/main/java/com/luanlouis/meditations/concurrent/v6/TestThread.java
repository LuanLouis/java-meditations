package com.luanlouis.meditations.concurrent.v6;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 * Created by LuanLouis on 16/4/6.
 */
public class TestThread implements Runnable {

    private String name;

    public TestThread(String name) {
        this.name = name;
    }

    public void run() {

        System.out.println(name);
        ThreadRegistry.doSomethingforNothing(200000);


    }
}
