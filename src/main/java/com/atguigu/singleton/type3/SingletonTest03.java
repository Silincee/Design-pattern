package com.atguigu.singleton.type3;


public class SingletonTest03 {

	public static void main(String[] args) {
		System.out.println("����ʽ1 �� �̲߳���ȫ~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

/**
* @description: ����ʽ:
 * �ӳٴ������ʵ������
 * ��1��������˽�л�
 * ��2����һ����̬�����������Ψһ��ʵ��
 * ��3���ṩһ����̬��������ȡ���ʵ������
 *  ?? �̲߳���ȫ
*/
class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ����ȥ���� instance
	//������ʽ
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}