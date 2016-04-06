package concurrent.v2;

import com.luanlouis.medidations.concurrent.v1.Printer;

/**
 * Created by DT on 16/4/5.
 */



public class ChinesePoet extends Poet {


    public ChinesePoet(String name, String title, String content, Printer printer) {
        super(name, title, content, printer);
    }

    public void writePoem() {

            synchronized (printer){
                printer.println("\n----开始作诗....");
                printer.println("标题:"+title);
                printer.println("作者:"+name);
                doWritePoem();
                printer.println("---完成.\n");
            }
    }

}
