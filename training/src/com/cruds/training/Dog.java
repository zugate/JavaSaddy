package com.cruds.training;

public class Dog extends Animal implements IVehicle{

	public void talk() {
		System.out.println("BOW WOW");
	}
	
	public void wagTail()
	{
		System.out.println("Dog wags tail");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats bones");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Dog Starts");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Dog Stops");
	}
}
