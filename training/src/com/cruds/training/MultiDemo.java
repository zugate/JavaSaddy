package com.cruds.training;

public class MultiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSalary(new Director(101, "Anil"));
	}
	
	private static void printSalary(Object obj) {
		
		if(obj instanceof Employee) {
			System.out.println("Salary is 10k");
		}
		else if(obj instanceof Manager)
		{
			System.out.println("Salary is 50k");
		}
		else if(obj instanceof Director)
		{
			System.out.println("Salary is 1 lakh");
		}
		
		
	}
}
