package com.cruds.training;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.start();
		c.stop();
		
		IVehicle v=new Bus();
		v.start();
		v.stop();
		
		IVehicle2 v2=VehicleUtility.getVehicle(IVehicle2.LUXURY_TYPE);
		v2.start();
		v2.stop();
	}

}
