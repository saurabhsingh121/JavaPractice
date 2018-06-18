package saurabh.collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		//Use of PriorityQueue class will sort the inserted object
		//Use of ArrayDeque class will keep it on FIFO concept
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("Saurabh");
		queue.add("Masatana");
		queue.add("Jana");
		
		System.out.println("Head: "+ queue.element());
		System.out.println("Head: "+ queue.peek());
		System.out.println("Iterating the queue element:");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
