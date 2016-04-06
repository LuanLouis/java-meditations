package com.luanlouis.meditations.concurrent.v4;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 * Created by LuanLouis on 16/4/5.
 */
public class AppTest {


    public static void main(String[] args) {


        AutomaticMachine automaticMachine = new AutomaticMachine(100);

        Customer customer1 = new Customer("Customer","6226677557471",automaticMachine);
        Customer customer2 = new Customer("Customer","6226677557472",automaticMachine);

        BankManager bankManager = new BankManager("Louis",automaticMachine);

        ThreadRegistry.registerThread(customer1);
        ThreadRegistry.registerThread(bankManager);
        ThreadRegistry.registerThread();
        customer1.start();
        customer2.start();
        bankManager.start();

        ThreadRegistry.monitorThreadsStatus();




    }

}
