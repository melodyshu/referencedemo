package com.example.hji;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Hello world!
 *虚引用
 * 虚引用主要用来跟踪对象被垃圾回收的活动。
 * 虚引用必须和引用队列（ReferenceQueue）联合使用.
 * 当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，就会在回收对象的内存之前，把这个虚引用加入到与之关联的引用队列中。
 */
public class PhantomRefMain
{
    public static void main( String[] args ) throws InterruptedException {
        Object obj1=new Object();
        System.out.println(obj1);
        ReferenceQueue queue=new ReferenceQueue();
        PhantomReference phantomReference=new PhantomReference(obj1,queue);
        System.out.println(obj1);
        System.out.println(phantomReference.get());//结果是null

        obj1=null;
        System.gc();
        Thread.sleep(100);
        System.out.println(queue.poll());//有值
    }
}
