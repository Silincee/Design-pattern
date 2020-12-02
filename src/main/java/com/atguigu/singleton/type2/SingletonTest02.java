package com.atguigu.singleton.type2;

import java.io.IOException;
import java.util.Properties;

public class SingletonTest02 {

	public static void main(String[] args) {
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

/**
* @description: 饿汉式(静态变量)
 * 使用场景：在有属性需要初始化的情况下
*/

class Singleton {
	
	//1. 构造器私有化, 使得外部不能new
	private Singleton() {

	}

//	private Singleton(String info) {
//		this.info = info;
//	}

	//2.本类内部创建对象实例
	private  static  final Singleton INSTANCE;
//	private String info;

	// 在静态代码块中，创建单例对象
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
	
	//3. 提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
//		System.out.println(INSTANCE.info);
		return INSTANCE;
	}
	
}