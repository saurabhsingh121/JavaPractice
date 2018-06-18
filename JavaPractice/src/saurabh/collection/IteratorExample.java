package saurabh.collection;

import java.util.Vector;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args){
		Vector<Integer> v = new Vector<>();
		for(int i = 1; i <= 10; i++)
			v.addElement(i);
		
		System.out.println(v);
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			int i = (Integer)itr.next();
			System.out.print(i + " ");
			if(i%2 != 0) { 
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(v);
	}
}
