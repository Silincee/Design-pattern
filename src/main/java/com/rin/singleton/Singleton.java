package com.rin.singleton;

/**
 * @program: 设计模式
 * @description:
 * @author: Silince
 * @create: 2020-09-21 16:39
 **/
public class Singleton {

    private  static Singleton instance;

    public Singleton() {
    }

    public static  Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
//                if (instance==null){
                    instance=new Singleton();
//                }
            }
        }
        return  instance;
    }
}
