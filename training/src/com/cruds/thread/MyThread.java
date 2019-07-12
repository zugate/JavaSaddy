package com.cruds.thread;

public class MyThread extends Thread {
	
	public MyThread() {
		
		start();
	}
	
	@Override
	public void run() {
		
		System.out.println("Inside Child Thread");
		for(int i=5;i>0;i--) {
			System.out.println("Child Thread Count"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Exiting!");
	}
}
