package com.phicomm.abstractfactory;

public class Test {
	public static void main(String[] args) {
		
		AbstractFactory factory = new ModernFactory();
		
		Vehicle v = factory.createVehicle();
		v.run();
		Weapon w = factory.createWeapon();
		w.shoot();
		Supply s = factory.createSupply();
		s.printName();
	}
}
 