package com.atguigu.singleton.type8;

public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.sayOK();
	}
}

/**
* @description: ʹ��ö�٣�����ʵ�ֵ���, �Ƽ�
 * ö������:��ʾ�����͵Ķ��������޵ļ�����
 * ���ǿ����޶�Ϊһ�����ͳ��˵�����
 * ?? ö�����͵Ĺ�����ȫ������˽�л���
*/
enum Singleton {
	INSTANCE; //���� ��һ��д���������б�
	public void sayOK() {
		System.out.println("ok~");
	}
}