/**
 *
 * 该实例展示了 在方法上添加synchronized 标记,表明在调用这个方法时,要先获得当前方法所属对象上的锁,由于这个对象上的锁只要调用这个方法的时候,都会显式要求获取
 * 所以这个比较有一般性. 这个控制的力度比较细,
 *
 *
 *
 * Created by LuanLouis on 16/4/5.
 */
package com.luanlouis.meditations.concurrent.v3;