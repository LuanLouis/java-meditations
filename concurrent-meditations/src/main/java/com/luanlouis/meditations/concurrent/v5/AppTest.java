package com.luanlouis.meditations.concurrent.v5;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 * Created by DT on 16/4/6.
 */
public class AppTest {



    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable(){
            public void run() {

                while(true)
                {
                    try {
                        ThreadRegistry.doSomethingforNothing(1000);
                        Thread.sleep(1000);


                        synchronized (AppTest.class){
                            System.out.println("GOINGTO SLEEP......");
                            AppTest.class.wait(10000);

                        }


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        ThreadRegistry.registerThread(thread1);
        ThreadRegistry.registerThread();
        thread1.start();
        ThreadRegistry.monitorThreadsStatus();


    }

}
