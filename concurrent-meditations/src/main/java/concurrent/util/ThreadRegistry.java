package concurrent.util;

import java.util.ArrayList;
import java.util.List;

/**
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

    public static void checkThreadsStatus(){

        for (Thread thread : threadList) {

            System.out.println("Thread Name: " + thread.getName()+"----Thread State:"+thread.getState());

        }

    }

    public static List<Thread> getThreadList(){
        return threadList;
    }

    public static void doSomethingforNothing(long millis){

        Long current = System.currentTimeMillis();

        while(System.currentTimeMillis()-current< millis)
        {
            //Nothing, empty loop
        }

    }


    public static void printStatus(){

        Thread demon = new Thread(new Runnable(){

            public void run() {

                while(true){

                    ThreadRegistry.doSomethingforNothing(1000);
                    for (Thread thread : threadList) {

                        System.out.println("Thread Name: " + thread.getName()+"----Thread State:"+thread.getState());

                    }
                }


            }
        });
        demon.setDaemon(true);
        demon.start();


    }



}
