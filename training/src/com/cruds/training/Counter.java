package com.cruds.training;

public class Counter {

	public static int objectCount;
	
	public Counter()
	{
		objectCount++;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method Entered "+objectCount);
		objectCount--;
		System.out.println("finalize method Exit "+objectCount);
	}
}
