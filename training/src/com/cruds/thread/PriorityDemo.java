package com.cruds.thread;

public class PriorityDemo {

	public static void main(String[] args) {

		Clicker hi=new Clicker(Thread.NORM_PRIORITY +2);
		Clicker low=new Clicker(Thread.NORM_PRIORITY -2);
		
		low.start();
		hi.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hi.stop();
		low.stop();
		
		System.out.println("High Counter "+hi.counter);
		System.out.println("Low Counter "+low.counter);
	}

}
