package concurrent.v4;

import com.luanlouis.medidations.concurrent.util.ThreadRegistry;

/**
 * Created by DT on 16/4/5.
 */
public class Customer extends Thread {

    private Cashier cashier;

    private String account;

    public Customer(String name,String account,Cashier cashier){
        super(name+"_"+account);
        this.cashier = cashier;
        this.account = account;

    }


    @Override
    public void run() {



        synchronized (cashier){
            System.out.println("Customer :" + account +" get the monitor now!!!");
            cashier.setCurrentAcount(account);

            ThreadRegistry.doSomethingforNothing(1000);



            if(!cashier.withdraw(1000)){

                //取钱失败,将当前的取款机状态置为 needsCheck状态

                cashier.setCheckFlag(true);

                try {
                    //让当前线程等待cashier资源,当其他线程调用了cashier.notify()的时候,这个线程的状态会变成RUNNABLE的状态,展开竞争
                    System.out.println("The money you want to withdraw is not enough,then wait manager to adjust amount....");
                    //当调用wait的时候,这时候当前线程运行到这行代码就暂停运行了,一直会卡在这里,直到其他线程调用了cashier.notify()方法,然后会继续往下走
                    cashier.wait();

                    //当运行到这里的时候,说明当前的线程已经重新获取到了cashier的monitor了

                    ThreadRegistry.doSomethingforNothing(1000);

                    System.out.println("OK, I'm alive now, try it again....");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            else{

            }




        }



    }
}
