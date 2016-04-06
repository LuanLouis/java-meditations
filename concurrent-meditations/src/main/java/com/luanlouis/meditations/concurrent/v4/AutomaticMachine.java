package com.luanlouis.meditations.concurrent.v4;

/**
 * Created by DT on 16/4/5.
 */
public class AutomaticMachine implements Cashier,BankNotePool {

    private String currentAccount;

    private volatile boolean checkFlag;

    private int amount;

    public AutomaticMachine(int amount) {
        this.amount = amount;
        this.checkFlag = false;
    }

    public String getCurrentAccount() {
        return currentAccount;
    }

    public String setValidationRule() {
        return null;
    }

    public boolean validateAccount() {
        return false;
    }

    public int query()
    {
        System.out.println("querying......");
        return 10;
    }

    public boolean withdraw(int money){

        System.out.println("withdrawing "+money+" RMB......");

        if (money > this.getMaxAmount())
        {
            System.out.println("Sorry , The cashier doesn't have enough money....");
            return false;
        }

        return true;

    }

    public boolean deposit(int amount){

        System.out.println("depositing....");
        return false;
    }

    public int getMaxAmount() {
        return 0;
    }

    public void setCurrentAcount(String account) {
        this.currentAccount = account;
    }



    // bank note pool implementation
    public boolean adjustAmount(int amount) {
        return false;
    }

    public int cleanPool() {
        return 0;
    }

    public boolean needsCheck() {
        return checkFlag;
    }

    public void setCheckFlag(boolean checkFlag) {
        this.checkFlag = checkFlag;
    }


}
