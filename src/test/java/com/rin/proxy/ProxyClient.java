package com.rin.proxy;

/**
 * @program: ���ģʽ
 * @description:
 * @author: Silince
 * @create: 2020-09-18 13:07
 **/
public class ProxyClient {
    public static void main(String[] args) {
        IStudentDao target = new StudentDao();

        IStudentDao proxyInstance=(IStudentDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.doHomework("sss");
    }
}
