package com.cruds.assignment;

import com.cruds.training.Student;

public class Calqculator {
	
	public int divide(int x,int y) {
		int result=0;
		int num[]=new int[3];
		
		Student s=null;
		System.out.println("Before Dividion");
		try {
			System.out.println(s.getName());
			num[3]=99;
			result=x/y;
			System.out.println("After division");
		}
		catch(ArithmeticException ae) {
			System.out.println("IUInvalid divisor, please provide proper one");
		}
		catch(ArrayIndexOutOfBoundsException aobe) {
			System.out.println(aobe.getMessage());
		}
		finally {
			System.out.println("Inside finally line 1...");
			s.getRollNo();
			System.out.println("Inside the finally line 2");
		}
		return result;
	}
}
