package com.rin;

import java.util.Calendar;

/**
 * @program: 设计模式
 * @description: 测试
 * @author: Silince
 * @create: 2020-09-11 15:02
 **/
public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
        
    }
}

class Singleton{
    private Singleton(){}

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
