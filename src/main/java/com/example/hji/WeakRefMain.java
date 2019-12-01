package com.example.hji;

import java.lang.ref.WeakReference;

/**
 * Hello world!
 *弱引用
 * 只要发生gc就回收
 */
public class WeakRefMain
{
    public static void main( String[] args )
    {
        Object obj1=new Object();
        WeakReference weakReference=new WeakReference(obj1);
        obj1=null;
        System.out.println(weakReference.get());
        System.gc();
        System.out.println("gc之后:"+weakReference.get());
    }
}
