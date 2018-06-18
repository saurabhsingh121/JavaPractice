package saurabh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));
		
		Set<Entry<String, Integer>> st = hm.entrySet();
		for (Entry<String, Integer> entry : st) {
			System.out.print(entry.getKey()+ ":");
			System.out.println(entry.getValue());
		}
	}
}
