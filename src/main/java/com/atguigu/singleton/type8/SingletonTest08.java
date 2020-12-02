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
* @description: 使用枚举，可以实现单例, 推荐
 * 枚举类型:表示该类型的对象是有限的几个。
 * 我们可以限定为一个，就成了单例。
 * ?? 枚举类型的构造器全部都是私有化的
*/
enum Singleton {
	INSTANCE; //属性 第一行写常量对象列表
	public void sayOK() {
		System.out.println("ok~");
	}
}