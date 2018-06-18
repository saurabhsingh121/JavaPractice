package saurabh.map;

import java.util.HashSet;
import java.util.Set;

public class EqualTest{

	public static void main(String[] args) {
		/*Circle c1 = new Circle(100, 200);
		Circle c2 = new Circle(100, 200);
		Set<Circle> set = new HashSet<Circle>();
		set.add(c1);
		System.out.println(set.contains(c2));*/
		
		Circle c = new Circle(100, 200);
		Circle c2 = new Circle(100, 200);
		System.out.println(c.equals(c2));

		ColoredCircle cc = new ColoredCircle(100, 200, "Red");

		System.out.println(c.equals(cc)); // prints true

		System.out.println(cc.equals(cc)); // prints false
		
		Set<Circle> hashSet1 = new java.util.HashSet<Circle>();
		hashSet1.add(c);
		System.out.println(hashSet1.contains(cc));    // prints false

		Set<Circle> hashSet2 = new java.util.HashSet<Circle>();
		hashSet2.add(cc);
		System.out.println(hashSet2.contains(c));  // prints true
	}
}