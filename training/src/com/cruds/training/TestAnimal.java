package com.cruds.training;

public class TestAnimal {

	public static void main(String[] args) {

		Animal a =AnimalProvider.getAnimal("cute");
		a.talk();
		
		if(a instanceof Dog) {
			((Dog)a).wagTail();
		}
	}

}
