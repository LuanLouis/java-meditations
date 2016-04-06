package concurrent.v6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by DT on 16/4/6.
 */
public class AppTest {





    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Thread thread1 = new Thread(new TestThread("Thread1"));
        Thread thread2 = new Thread(new TestThread("Thread2"));
        Thread thread3 = new Thread(new TestThread("Thread3"));
        Thread thread4 = new Thread(new TestThread("Thread4"));
        Thread thread5 = new Thread(new TestThread("Thread5"));
        Thread thread6 = new Thread(new TestThread("Thread6"));

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);




    }


}
