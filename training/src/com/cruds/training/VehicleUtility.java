package com.cruds.training;

public class VehicleUtility {


	public static IVehicle2 getVehicle(String type) {
		if(type.equals(IVehicle2.LUXURY_TYPE))
			return (IVehicle2) new Car();
		else if(type.equals(IVehicle2.PASS_TYPE))
			return (IVehicle2) new Bus();
		else if(type.equals(IVehicle2.PET_TYPE))
			return (IVehicle2) new Dog();
		else if(type.equals(IVehicle2.LOADER))
			return (IVehicle2) new Truck();
		return null;
	}
}
