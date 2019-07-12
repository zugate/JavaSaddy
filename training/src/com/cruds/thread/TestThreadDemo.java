package com.cruds.thread;

public class TestThreadDemo {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		for(int i=5;i>0;i--) {
			System.out.println("Inside Main Thread "+i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main thread exit");
		
		
	}

}
/*Inside Main Thread 5
Inside Child Thread
Child Thread Count5
Child Thread Count4
Child Thread Count3
Child Thread Count2
Child Thread Count1
Child Thread Exiting!
Inside Main Thread 4
Inside Main Thread 3
Inside Main Thread 2
Inside Main Thread 1
Main thread exit
*/