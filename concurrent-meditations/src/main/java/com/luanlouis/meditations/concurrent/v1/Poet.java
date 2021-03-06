package com.luanlouis.meditations.concurrent.v1;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 * Base class of Poet
 * Created by LuanLouis on 16/4/5.
 */
public abstract class Poet implements Runnable{

    protected String name;
    protected String title;
    protected String content;
    protected Printer printer;

    public Poet(String name, String title, String content,Printer printer) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.printer = printer;
    }

    /**
     * 子类实现这一功能
     */
    public abstract void writePoem();

    protected void doWritePoem() {
        String[] paragraphs = content.split("\n");
        for (String paragraph: paragraphs) {

            //check status first
            //ThreadRegistry.checkThreadsStatus();
            printer.println("\t"+paragraph);

            //无意义的loop,使当前代码再当前线程中空运行指定时间
            ThreadRegistry.doSomethingforNothing(1000);

        }
    }


    public void run() {

        writePoem();

    }
}
