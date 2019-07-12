package com.cruds.assignment;

public class TestFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(x);
		IFly fly2=FlyProvider.getFly(IFly.FEATHER);
		fly2.fly();
		IFly fly3=FlyProvider.getFly(IFly.CAPE);
		fly3.fly();
		IFly fly4=FlyProvider.getFly(IFly.WINGS);
		fly4.fly();
	}

}
