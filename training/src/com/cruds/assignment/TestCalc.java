package com.cruds.assignment;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calqculator c=new Calqculator();
		int result=0;
		try {
			result=c.divide(10, 0);
		}
		catch(RuntimeException re){
			System.out.println(re.getMessage());
		}
		finally {
			System.out.println("Finally in Main ===>");
		}
		System.out.println("Result is "+result);
	}

}
