package saurabh.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		//LinkedHashSet class will have the set of elements as it it inserted
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("Mariana");
		lhs.add("Rick");
		lhs.add("Sam");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
