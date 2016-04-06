package concurrent.v2;

import com.luanlouis.medidations.concurrent.v1.Printer;

/**
 * Created by DT on 16/4/5.
 */
public class EnglishPoet extends Poet {


    public EnglishPoet(String name, String title, String content, Printer printer) {
        super(name, title, content, printer);
    }

    public void writePoem() {

        //Hello JVM, 接下来的这些操作中,我所在的这个线程要唯一占有这个printer的使用权,
        synchronized (printer){
            printer.println("\n----Begin to Write a Poem....");
            printer.println("Title:"+title);
            printer.println("Author:"+name);
            doWritePoem();
            printer.println("---Finished.\n");
        }
    }
}
