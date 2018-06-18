package saurabh.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Saurabh
 *
 */
public class ArrayToList {
	/**
	 * List is backed by array, we cannot do structural modification Both the below
	 * statement will throw java.lang.UnsupportedOperationException
	 * vowelsList.remove("e");
	 * vowelsList.clear();
	 * @param String
	 *
	 *
	 */
	public static void main(String[] args) {
		String[] vowels = {"a","e", "i", "o","u" };
		List<String> vowelsList = Arrays.asList(vowels);
		System.out.println(vowelsList);
		/*List is backed by array, we cannot do structural modification
		Both the below statement will throw java.lang.UnsupportedOperationException*/
		//vowelsList.remove("e");
		//vowelsList.clear();
		
		List<String> myList = new ArrayList();
		for(String s : vowels)
			myList.add(s);
		System.out.println(myList);
		myList.clear();
		
	}
}
