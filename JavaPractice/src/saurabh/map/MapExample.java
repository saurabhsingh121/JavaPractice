package saurabh.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put("A", "A");
		map.put("B", "B");
		map.put("C", "C");
		map.put("D", null);
		//map.put(null, "Z");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		System.out.println(set);
		
		String value = map.getOrDefault("E", "This key value pair doesn't exist");
		System.out.println(value);
		Collection<String> values = map.values();
		System.out.println(values);
	}
}
