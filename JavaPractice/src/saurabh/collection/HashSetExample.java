package saurabh.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet class will create an sorted and unique list of elements
		Set<String> hs = new HashSet<String>();
		hs.add("Rachit");
		hs.add("Amit");
		hs.add("Amit");
		hs.add("Jack");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
