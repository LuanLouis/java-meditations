package concurrent.v1;

import com.luanlouis.medidations.concurrent.util.ThreadRegistry;

/**
 * Created by DT on 16/4/5.
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
