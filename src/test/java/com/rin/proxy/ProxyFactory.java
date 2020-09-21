package com.rin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: 设计模式
 * @description:
 * @author: Silince
 * @create: 2020-09-18 13:00
 **/
class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("proxy beginning");
                        Object returnVal = method.invoke(target, args);
                        System.out.println("jdk proxy done");
                        return returnVal;
                    }
                });
    }
}
