package com.cruds.thread;

public class SyncDemo {

	public static void main(String[] args) {
		
		Printer p=new Printer();
		User U1=new User(p,"Hello");
		User U2=new User(p,"Synchronized");
		User U3=new User(p,"World");
		
		
		try {
			U1.t.join();
			U2.t.join();
			U3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
