package saurabh.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("My");
		al.add("Name");
		al.add("Is");
		al.add("Saurabh");
		al.add("Singh");
		System.out.println(al);
		System.out.println();
		List<String> range = new ArrayList<>();
		//return List between 2nd(Including)
		//and 4th element(excluding)
		range = al.subList(2, 4);
		System.out.println(range);
		
	}
}
