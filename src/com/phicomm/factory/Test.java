package com.phicomm.factory;

public class Test {
	public static void main(String[] args) {
		
		//Apple ap = new Apple();
//		Apple ap = Apple.getInstance();
//		Apple ap1 = Apple.getInstance();
//		
//		if(ap == ap1) {
//			System.out.println("true");
//		}
//		ap.eat();
		
//		Car c1 = Car.getInstance();
//	
//		c1.run();
		
		VehicleFactory factory = new BroomFactory();
		Moveable c1 = factory.create();
		c1.run();
	}
}
 