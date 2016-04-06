package com.luanlouis.meditations.concurrent.v4;

/**
 * Created by DT on 16/4/5.
 */
public interface BankNotePool {


    public boolean adjustAmount(int amount);

    public int cleanPool();

    public boolean needsCheck();

    public void setCheckFlag(boolean checkFlag);


}
