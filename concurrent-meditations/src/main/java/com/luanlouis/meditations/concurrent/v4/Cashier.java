package com.luanlouis.meditations.concurrent.v4;

/**
 * Created by DT on 16/4/5.
 */
public interface Cashier {

    /**
     * 返回当前使用者的卡
     * @return
     */
    public String getCurrentAccount();


    /**
     * 设置Account校验规则
     * @return
     */
    public String setValidationRule();


    /**
     * 验证卡号正确性
     * @return
     */
    public boolean validateAccount();


    /**
     * 查询余额
     * @return
     */
    public int query();


    /**
     * 取钱
     * @param amount
     * @return
     */
    public boolean withdraw(int amount);

    /**
     * 存钱
     * @param amount
     * @return
     */
    public boolean deposit(int amount);

    /**
     * 最多取款额度
     * @return
     */
    public int getMaxAmount();


    public void setCurrentAcount(String account);

    public void setCheckFlag(boolean checkFlag);


}
