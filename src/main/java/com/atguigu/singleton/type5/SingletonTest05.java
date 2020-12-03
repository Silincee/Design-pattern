package com.atguigu.singleton.type5;


public class SingletonTest05 {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);//结果应该是true
		System.out.println(instance1.hashCode() == instance2.hashCode());
	}
}

/**
 * 单例模式 懒汉式（不安全）
 * 虽然加了同步关键字，但同样是线程不安全的，
 * 因为可能有几个线程同时进入if(singleton == nul)的判断，然后再同步创建出多个实例出来。
 */
class Singleton {
	// 1.声明一个私有变量
	private static Singleton singleton;

	// 2.私有化构造函数（防止被人可以new对象出来）
	private Singleton(){};

	// 3.对外暴露获取对象的方法
	public static Singleton getInstance(){
		//如果对象为空，则创建。不为空，则返回
		if(singleton == null){
			// 4.加入同步代码块
			synchronized (Singleton.class){
				singleton = new Singleton();
			}
		}
		return singleton;
	}
}