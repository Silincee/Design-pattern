package com.rin;

import com.rin.singleton.Singleton;

/**
 * @program: ���ģʽ
 * @description:
 * @author: Silince
 * @create: 2020-09-21 16:43
 **/
public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance==instance1);
    }
}
