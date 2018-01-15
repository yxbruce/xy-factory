package com.phicomm.property.factory;

import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		p.load(Test.class.getClassLoader().
				getResourceAsStream("com/phicomm/property/factory/test.properties"));
		String vehicleTypeName = p.getProperty("VehicleType");
		System.out.println(vehicleTypeName);
		Object o = Class.forName(vehicleTypeName).newInstance();
		Moveable m = (Moveable)o;
		m.run();
		
//		Moveable m = new Car();
//		m.run();
	}
}
