package com.luanlouis.meditations.concurrent.v3;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 *
 *
 * Created by LuanLouis on 16/4/5.
 */
public class Printer {

    public void println(String content){

        String[] lines = content.split("\n");
        for (String line : lines) {
            System.out.println(line);
            ThreadRegistry.doSomethingforNothing(1000);
        }
    }

    /**
     * 同步方法的实质是,执行到带有synchronized 的方法时,JVM会尝试请求当前所属对象的monitor
     * @param content
     */
    public synchronized void printlnWithConcurrency(String content){

        String[] lines = content.split("\n");
        for (String line : lines) {
            System.out.println(line);
            ThreadRegistry.doSomethingforNothing(1000);
        }
    }


}
