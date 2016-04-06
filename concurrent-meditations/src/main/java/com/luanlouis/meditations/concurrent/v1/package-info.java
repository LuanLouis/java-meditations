/**
 *
 *
 * 该package提供实例:
 * 两个线程,共同使用一个资源,由于连个线程之间缺乏同步机制的操作,导致资源使用混乱
 *
 * 1. 线程一, ChinesePoet,通过打印机,打印出一首 纳兰性德的一首诗
 * 2. 线程二, EnglishPoet,通过打印机 ,打印出一首 莎士比亚的十四行诗
 *  打印的过程中,连个线程公用printer这个对象资源,导致打印出来的结果错综复杂
 *
 * Created by LuanLouis on 16/4/5.
 */
package com.luanlouis.meditations.concurrent.v1;