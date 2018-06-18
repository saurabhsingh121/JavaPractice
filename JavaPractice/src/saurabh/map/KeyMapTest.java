package saurabh.map;

import java.util.HashMap;
import java.util.Map;

public class KeyMapTest {
	
	public static void main(String[] args) {
		Map<Key, Integer> map = new HashMap<Key,Integer>();
		map.put(new Key("vishal"), 10);
		map.put(new Key("Sachin"), 20);
		map.put(new Key("vaibhav"), 30);
		
		System.out.println();
		System.out.println("Value for key Sachin: "+ map.get(new Key("Sachin")));
		System.out.println("Value for key vaibhav: "+ map.get(new Key("vaibhav")));
	}
}
