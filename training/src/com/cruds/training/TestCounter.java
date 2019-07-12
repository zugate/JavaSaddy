package com.cruds.training;

public class TestCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1=new Counter();
		Counter c2=new Counter();
		
		System.out.println(Counter.objectCount);
		
		c1=null;
		c2=null;
		
		System.gc();
	}

}
