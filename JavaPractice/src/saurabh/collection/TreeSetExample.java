package saurabh.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
public static void main(String[] args) {
	//TreeSet class inherits from AbstractSet class and implements Navigable interface
	//In TreeSet, access and retrieval time is faster
	Set<String> ts = new TreeSet<String>();
	ts.add("John");
	ts.add("Sam");
	ts.add("Rick");
	Iterator<String> itr = ts.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
