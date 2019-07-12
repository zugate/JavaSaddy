package com.cruds.assignment;

public class FlyProvider {

	public static IFly getFly(String type) {
		if(type.equalsIgnoreCase(IFly.FEATHER))
			return new Bird();
		else if(type.equalsIgnoreCase(IFly.CAPE))
			return new Superman();
		else if(type.equalsIgnoreCase(IFly.WINGS))
			return new Aeroplane();
		return null;
	}
}
