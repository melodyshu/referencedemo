package com.example.hji;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * 软引用
 * 如果内存空间足够，垃圾回收器就不会回收它，如果内存空间不足了，就会回收这些对象的内存。
 */
public class SoftRefMain {
    public static void main(String[] args) {
        Object obj1=new Object();
        System.out.println(obj1);
        SoftReference softReference=new SoftReference(obj1);
        System.out.println(softReference.get());
        obj1=null;
        System.out.println(softReference.get());
        System.gc();
        System.out.println("gc之后:"+softReference.get());
    }
}
