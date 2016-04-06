package com.luanlouis.meditations.concurrent.v1;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;

/**
 * Created by LuanLouis on 16/4/5.
 */
public class EnglishPoet extends Poet {


    public EnglishPoet(String name, String title, String content, Printer printer) {
        super(name, title, content, printer);
    }

    public void writePoem() {

        printer.println("\n----Begin to Write a Poem....");
        printer.println("Title:"+title);
        printer.println("Author:"+name);
        doWritePoem();
        ThreadRegistry.doSomethingforNothing(1000);
        printer.println("---Finished.\n");
    }
}
