package com.cruds.thread;

public class Clicker implements Runnable {

	long counter;
	Thread t;
	volatile boolean running=true;  // volatile means what??
	public Clicker(int priority) {
		
		t=new Thread(this);
		t.setPriority(priority);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread()+"RUN METHOD");
		while(running) {
			counter++;
		}
	}
	public void stop() {
		System.out.println(Thread.currentThread()+"STOP METHOD");
		running =false;
	}
	public void start() {
		System.out.println(Thread.currentThread()+"START METHOD");
		t.start();
	}

}
