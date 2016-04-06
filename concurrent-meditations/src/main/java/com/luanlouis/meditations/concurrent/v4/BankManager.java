package com.luanlouis.meditations.concurrent.v4;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 * Created by LuanLouis on 16/4/5.
 */
public class BankManager extends Thread {

    private BankNotePool bankNotePool;



    public BankManager(String name,BankNotePool bankNotePool) {
        super(name);
        this.bankNotePool= bankNotePool;
    }

    @Override
    public void run() {



        while(true){

            //only try to get monotior when it need to
            if(bankNotePool.needsCheck())
            {
                    synchronized (bankNotePool) {
                        ThreadRegistry.doSomethingforNothing(1000);

                        bankNotePool.adjustAmount(1000);

                        bankNotePool.setCheckFlag(false);
                        System.out.println("Adjusting and  notify...................................");
                        //已经调整好了,通知当前正在pending在这个上面的用户,激活等在bankNotePool这个资源上的线程,使其状态变成RUNNABLE
                        bankNotePool.notify();
                    }
            }
        }




    }
}
