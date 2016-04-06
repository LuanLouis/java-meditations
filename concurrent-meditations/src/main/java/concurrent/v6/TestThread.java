package concurrent.v6;

import com.luanlouis.medidations.concurrent.util.ThreadRegistry;

/**
 * Created by DT on 16/4/6.
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
