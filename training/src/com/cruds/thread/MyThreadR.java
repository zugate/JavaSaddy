package com.cruds.thread;

public class MyThreadR implements Runnable {

	Thread t;
	
	public MyThreadR(String name) {
		
		t=new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=5;i>0;i--) {
			System.out.println("Child Thread "+this);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this + " Exiting!");
	}

}
