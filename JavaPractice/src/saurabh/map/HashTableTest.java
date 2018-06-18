package saurabh.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("Saurabh", "101");
		ht.put("Gagan", "102");
		ht.put("Saurabh", "103");
		//ht.put(null, "106"); It will give nullPointerException on compile time
		//ht.put("Amit", null); Neither it stores null key nor null value
		System.out.println(ht.get(""));
		System.out.println("-------------Hash table--------------");
		for(Map.Entry<String, String> m : ht.entrySet()) {
			System.out.println("Key: " +m.getKey() + " = Value: "+ m.getValue());
		}
	}
}
