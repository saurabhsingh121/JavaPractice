package saurabh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSort {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < 10; i++)
			ints.add(random.nextInt(100));
		//natural sorting using collection class
		Collections.sort(ints);
		System.out.println("Natural sorting: "+ ints);
		//My custom sorting reverse order
		ints.sort((o1,o2) -> {return (o2-o1);});
		System.out.println("Reverse sorting: "+ ints);
	}
}
