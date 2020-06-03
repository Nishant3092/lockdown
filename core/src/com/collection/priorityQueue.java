package com.collection;

import java.util.PriorityQueue;

public class priorityQueue {
	
	public static void main (String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		while(que.isEmpty()==false) 
			System.out.printf("%d ", que.remove());
		
		System.out.println("/n");
	}

}

/*Explanation: Priority queue always outputs the minimum element from the queue 
 * when remove() method is called,no matter what the sequence of input is.*/
 
