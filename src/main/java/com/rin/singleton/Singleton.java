package com.rin.singleton;

/**
 * @program: 设计模式
 * @description:
 * @author: Silince
 * @create: 2020-09-21 16:39
 **/
public class Singleton {

    private  static Singleton instance;

    private static class SingletonInstance{
        private final static Singleton INSTANCE = new Singleton();
    }

    public Singleton() {
    }

    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
