package com.threading;

public class Current {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hellllooooo");
MyThread t = (MyThread) MyThread.currentThread();

     System.out.println("current thread "+t);
     System.out.println(t.getName());
	}

}

