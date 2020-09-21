package com.rin.proxy;

/**
 * @program: 设计模式
 * @description:
 * @author: Silince
 * @create: 2020-09-18 12:59
 **/
public class StudentDao implements IStudentDao {
    @Override
    public void doHomework(String str) {
        System.out.println("student doing homework"+str);
    }

    @Override
    public void sayHello(String str) {
        System.out.println("student say hello"+str);
    }
}
