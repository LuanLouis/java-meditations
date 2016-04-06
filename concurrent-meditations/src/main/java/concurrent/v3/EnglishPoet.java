package concurrent.v3;



/**
 * Created by DT on 16/4/5.
 */
public class EnglishPoet extends Poet {


    public EnglishPoet(String name, String title, String content, Printer printer) {
        super(name, title, content, printer);
    }

    public void writePoem() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----Begin to Write a Poem....\n");
        buffer.append("Title:"+title+"\n");
        buffer.append("Author:"+name+"\n");
        buffer.append(content+"\n");
        buffer.append("---Finished.\n");

//        printer.println(buffer.toString());

        printer.printlnWithConcurrency(buffer.toString());

    }
}
