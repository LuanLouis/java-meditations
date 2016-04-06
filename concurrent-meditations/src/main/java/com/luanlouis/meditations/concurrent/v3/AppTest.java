package com.luanlouis.meditations.concurrent.v3;

import com.luanlouis.meditations.concurrent.util.ThreadRegistry;


/**
 * Created by DT on 16/4/5.
 */
public class AppTest {


    public static void main(String[] args) {

        String chinesePoem = "辛苦最怜天上月，\n" +
                "一夕如环，\n" +
                "夕夕都成决。\n" +
                "若似月轮终皎洁，\n" +
                "不辞冰雪为卿热。\n" +
                "无那尘缘容易绝，\n" +
                "燕子依然，\n" +
                "软踏帘钩说。\n" +
                "唱罢秋坟愁未歇，\n" +
                "春丛认取双栖蝶。\n";



        String englishPoem = "Shall I compare thee to a summer's day? \n" +
                "Thou art more lovely and more temperate: \n" +
                "Rough winds do shake the darling buds of May, \n" +
                "And summer's lease hath all too short a date: \n" +
                "Sometime too hot the eye of heaven shines, \n" +
                "And often is his gold complexion dimm'd; \n" +
                "And every fair from fair sometime declines, \n" +
                "By chance or nature's changing course untrimm'd; \n" +
                "But thy eternal summer shall not fade \n" +
                "Nor lose possession of that fair thou owest; \n" +
                "Nor shall Death brag thou wander'st in his shade, \n" +
                "When in eternal lines to time thou growest: \n" +
                "So long as men can breathe or eyes can see, \n" +
                "So long lives this and this gives life to thee. \n";
            Printer printer = new Printer();


            Thread chinese = new Thread(new ChinesePoet("纳兰性德","蝶兰花",chinesePoem,printer),"ChinesePoetHostedThread");
            Thread english = new Thread(new EnglishPoet("Shakespeare","Shall I compare thee to a summer's day?",englishPoem,printer),"EnglishPoetHostedThread");
            ThreadRegistry.registerThread(chinese);
            ThreadRegistry.registerThread(english);
            ThreadRegistry.registerThread();

            ThreadRegistry.checkThreadsStatus();

            //chinese.setPriority(1);
            english.start();
            chinese.start();

    }





}
