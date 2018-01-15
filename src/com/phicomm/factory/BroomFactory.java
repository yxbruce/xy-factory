package com.phicomm.factory;

public class BroomFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		// TODO Auto-generated method stub
		return new Broom();
	}

}
