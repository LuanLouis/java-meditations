package com.luanlouis.meditations.concurrent.v4;

/**
 * Created by DT on 16/4/5.
 */
public class Technician extends  Thread {

    private Machine machine;
    public Technician(String name,Machine machine) {
        super(name);
        this.machine = machine;
    }

    @Override
    public void run() {

        synchronized (machine){

            while(true)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                machine.maintain();
            }
        }




    }
}
