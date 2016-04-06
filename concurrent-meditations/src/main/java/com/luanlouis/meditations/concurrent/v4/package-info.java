/**
 *
 *
 *
 * 这个实例演示了   两个线程竞争同一个资源的过程;
 *
 * 一个线程先尝试获取到一个资源的管程,如果获取管程失败, 则这个线程会被置为 BLOCKED状态;
 *
 * 当某一线程获取到了某一资源的管程,要暂时释放掉当前的管程(object.wait()),则该线程会变成WAITING状态
 * 只能等待其他的线程在这个资源上调用(object.notify())方法,则将WAITING的线程置成BLOCKED,参与管程的竞争
 *
 *
 * Created by LuanLouis on 16/4/5.
 */
package com.luanlouis.meditations.concurrent.v4;

