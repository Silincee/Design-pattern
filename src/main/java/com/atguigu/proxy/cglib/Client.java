package com.atguigu.proxy.cglib;

import com.atguigu.proxy.cglib.ProxyFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Ŀ�����
		TeacherDao target = new TeacherDao();
		// ��ȡ��������󣬲��ҽ�Ŀ����󴫵ݸ��������
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

		// ִ�д������ķ���������intercept �������Ӷ�ʵ�� ��Ŀ�����ĵ���
		String res = proxyInstance.teach2();
		System.out.println("res=" + res);
	}

}
