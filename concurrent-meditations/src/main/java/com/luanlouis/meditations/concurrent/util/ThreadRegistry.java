package com.luanlouis.meditations.concurrent.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ThreadRegistry 工具类用来管理线程引用,并提供了一些方法用来监控这些进城的运行状态
 *
 *
 * ThreadRegistry Utility class is used as a container of threads references.
 *
 *
 * Created by DT on 16/4/5.
 */
public class ThreadRegistry {

    /**
     * Container of thread reference
     */
    private static List<Thread> threadList = new ArrayList<Thread>();

    /**
     * Register current Thread reference to container
     */
    public static void registerThread(){
        registerThread(Thread.currentThread());
    }

    /**
     * Register a thread reference to container
     * @param thread
     */
    public static void registerThread(Thread thread){
        synchronized (threadList){
            if(!threadList.contains(thread))
            threadList.add(thread);
        }
    }


    /**
     * 查看当前Registry内部的所有线程的当前状态
     */
    public static void checkThreadsStatus(){

        for (Thread thread : threadList) {

            System.out.println("Thread Name: " + thread.getName()+"----Thread State:"+thread.getState());

        }

    }


    /**
     *
     * 获取当前Registry注册的所有线程引用
     * @return
     */
    public static List<Thread> getThreadList(){
        return threadList;
    }


    /**
     *
     * 使线程空运行一段时间,用来尽可能地体现出进程在切换直接的变化
     *
     * @param millis
     */
    public static void doSomethingforNothing(long millis){

        Long current = System.currentTimeMillis();

        while(System.currentTimeMillis()-current< millis)
        {
            //Nothing, empty loop
        }

    }


    /**
     * 创建daemon线程,监控当前所注册的线程的所有的运行状态
     */
    public static void monitorThreadsStatus(){

        Thread demon = new Thread(new Runnable(){

            public void run() {

                while(true){

                    ThreadRegistry.doSomethingforNothing(1000);
                    checkThreadsStatus();
                }


            }
        });
        demon.setDaemon(true);
        demon.start();


    }



}
