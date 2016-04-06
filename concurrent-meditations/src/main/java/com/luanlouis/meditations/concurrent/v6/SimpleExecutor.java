package com.luanlouis.meditations.concurrent.v6;

import java.util.concurrent.Executor;

/**
 * 对于每一个提交的Runnable,都创建一个新的线程执行
 * Created by LuanLouis on 16/4/6.
 */
public class SimpleExecutor implements Executor {

    public void execute(final Runnable command) {
          new Thread(command).start();
    }
}
