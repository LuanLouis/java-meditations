package concurrent.v3;

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


    public void run() {

        writePoem();



    }
}
