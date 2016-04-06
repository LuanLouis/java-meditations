/**
 *
 * 使用synchronized(object)进行同步的机制
 *
 * 这个要注意,这个object资源,如果在多个线程中使用,那么要注意,某个线程中单方面使用了synchronized代码段,实际上使没有任何效果的,
 * 其他线程在使用这一资源的时候,不会有任何的限制
 *
 * synchronized(object)起效果的时候,必须要明确,它会在多线程中使用,并且每处用到这个资源的代码中,必须要明确是否需要使用synchronized()代码段
 * 这个要求你对整个对象的使用场景特别熟悉才可以
 *
 * Created by DT on 16/4/5.
 */
package concurrent.v2;