package saurabh.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		String[] strArray = new String[list.size()];
		strArray = list.toArray(strArray);
		System.out.println(Arrays.toString(strArray));
	}
}
