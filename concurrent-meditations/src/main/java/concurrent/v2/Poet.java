package concurrent.v2;

import com.luanlouis.medidations.concurrent.util.ThreadRegistry;
import com.luanlouis.medidations.concurrent.v1.Printer;

/**
 * Base class of Poet
 * Created by DT on 16/4/5.
 */
public abstract class Poet implements Runnable{

    protected String name;
    protected String title;
    protected String content;
    protected Printer printer;

    public Poet(String name, String title, String content, Printer printer) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.printer = printer;
    }

    public abstract void writePoem();

    protected void doWritePoem() {
        String[] paragraphs = content.split("\n");
        for (String paragraph: paragraphs) {

            //check status first
            ThreadRegistry.checkThreadsStatus();
            printer.println("\t"+paragraph);

            //无意义的loop,使当前代码再当前线程中空运行指定时间
            ThreadRegistry.doSomethingforNothing(1000);

        }
    }


    public void run() {

        writePoem();



    }
}
