package com.threading;

//1. Example for Extends Thread Class 
class Runner extends MyThread{

	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("Hello Nishant Extends Thread Class  " +i);
             MyThread.sleep(100);
		}		
	}

	
	
	public void start() {
		// TODO Auto-generated method stub	
	}	
}

public class App {

public static void main(String[] args) {
		// TODO Auto-generated method stub
      Runner runner1= new Runner();
          runner1.start();

        /*Runner runner2= new Runner();
           runner2.start();*/
	}

}
