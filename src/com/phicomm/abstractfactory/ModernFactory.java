package com.phicomm.abstractfactory;

public class ModernFactory extends AbstractFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new AK47();
	}

	@Override
	public Supply createSupply() {
		// TODO Auto-generated method stub
		return new Oil();
	}
}
