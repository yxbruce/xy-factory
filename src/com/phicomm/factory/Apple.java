package com.phicomm.factory;

public class Apple {
	
	//单例模式，从始至终只有一个实例
	public static Apple ap = new Apple();
	
	private Apple() {}
	
	//任何方法，在方法内控制对象产生的逻辑，都可以叫工厂方法
	public static Apple getInstance() {
		return ap;
	}
	
	public void eat() {
		System.out.println("苹果是甜的");
	}
}
