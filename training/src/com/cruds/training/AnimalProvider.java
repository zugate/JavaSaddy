package com.cruds.training;

public abstract class AnimalProvider {

	public static Animal getAnimal(String type) {
		if(type.equalsIgnoreCase("Faithfull")) {
				return new Dog();
		}
		if(type.equalsIgnoreCase("Cute")) {
			return new Cat();
		}
		return null;
	}
}
