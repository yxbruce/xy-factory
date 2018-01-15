package com.phicomm.abstractfactory;

public class AncientFactory extends AbstractFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Horse();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public Supply createSupply() {
		// TODO Auto-generated method stub
		return new Grass();
	}

}
