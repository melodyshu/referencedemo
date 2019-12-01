package com.example.hji;

/**
 * Hello world!
 *强引用
 * 我们使用的大部分引用实际上都是强引用，这是使用最普遍的引用。
 * 如果一个对象具有强引用，那就类似于必不可少的生活用品，垃圾回收器绝不会回收它。
 * 当内存空间不足，Java虚拟机宁愿抛出OutOfMemoryError错误，
 * 使程序异常终止，也不会靠随意回收具有强引用的对象来解决内存不足问题。
 */
public class StrongRefMain
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Object obj1=new Object();
        Object obj2=obj1;
        obj1=null;
        System.gc();
        System.out.println("gc之后:"+obj2);

    }
}
