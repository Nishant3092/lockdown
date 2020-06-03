package com.threading;


//1. Example for Extends Thread Class 
class Runner1 implements Runnable{



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++ ){
			System.out.println("Hello Nishant Implements Runnable Interface  " +i);	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	
	
}


public class App1 {

	public static void main(String[] args)  {
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		t1.start();
	
		t2.start();
		
	}

}

