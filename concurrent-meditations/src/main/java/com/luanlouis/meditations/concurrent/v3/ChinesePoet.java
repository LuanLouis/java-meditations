package com.luanlouis.meditations.concurrent.v3;

/**
 * Created by DT on 16/4/5.
 */



public class ChinesePoet extends Poet {


    public ChinesePoet(String name, String title, String content, Printer printer) {
        super(name, title, content, printer);
    }



    public void writePoem() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----开始作诗...."+"\n");
        buffer.append("标题:"+title+"\n");
        buffer.append("作者:"+name+"\n");
        buffer.append(content+"\n");
        buffer.append("---完成.\n");

//        printer.println(buffer.toString());
        printer.printlnWithConcurrency(buffer.toString());
    }

}
