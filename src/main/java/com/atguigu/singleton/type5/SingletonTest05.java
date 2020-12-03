package com.atguigu.singleton.type5;


public class SingletonTest05 {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);//���Ӧ����true
		System.out.println(instance1.hashCode() == instance2.hashCode());
	}
}

/**
 * ����ģʽ ����ʽ������ȫ��
 * ��Ȼ����ͬ���ؼ��֣���ͬ�����̲߳���ȫ�ģ�
 * ��Ϊ�����м����߳�ͬʱ����if(singleton == nul)���жϣ�Ȼ����ͬ�����������ʵ��������
 */
class Singleton {
	// 1.����һ��˽�б���
	private static Singleton singleton;

	// 2.˽�л����캯������ֹ���˿���new���������
	private Singleton(){};

	// 3.���Ⱪ¶��ȡ����ķ���
	public static Singleton getInstance(){
		//�������Ϊ�գ��򴴽�����Ϊ�գ��򷵻�
		if(singleton == null){
			// 4.����ͬ�������
			synchronized (Singleton.class){
				singleton = new Singleton();
			}
		}
		return singleton;
	}
}