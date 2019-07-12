package com.cruds.training;

public class Cat extends Animal{

	public void talk() {
		System.out.println("Meow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats eat fish!");
	}
}
