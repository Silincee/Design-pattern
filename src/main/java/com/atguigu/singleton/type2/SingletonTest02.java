package com.atguigu.singleton.type2;

import java.io.IOException;
import java.util.Properties;

public class SingletonTest02 {

	public static void main(String[] args) {
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

/**
* @description: ����ʽ(��̬����)
 * ʹ�ó���������������Ҫ��ʼ���������
*/

class Singleton {
	
	//1. ������˽�л�, ʹ���ⲿ����new
	private Singleton() {

	}

//	private Singleton(String info) {
//		this.info = info;
//	}

	//2.�����ڲ���������ʵ��
	private  static  final Singleton INSTANCE;
//	private String info;

	// �ھ�̬������У�������������
	static {
//		try {
//			Properties pro = new Properties();
//			pro.load(Singleton.class.getClassLoader().getResourceAsStream("single.properties"));
//			INSTANCE = new Singleton(pro.getProperty("info"));
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
		INSTANCE =  new Singleton();
	}
	
	//3. �ṩһ�����еľ�̬����������ʵ������
	public static Singleton getInstance() {
//		System.out.println(INSTANCE.info);
		return INSTANCE;
	}
	
}