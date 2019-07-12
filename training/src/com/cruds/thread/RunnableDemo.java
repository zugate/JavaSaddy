package com.cruds.thread;

public class RunnableDemo {
	public static void main(String...asdf) {
		
		MyThreadR t1=new MyThreadR("Child Thread 1");
		MyThread t2=new MyThread();
		try {
			t2.join();
			t1.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread()+"Exiting");
	}

}
