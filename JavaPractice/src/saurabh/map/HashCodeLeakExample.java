package saurabh.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeLeakExample {
	private String id;
	
	public HashCodeLeakExample(String id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		try {
			Map<HashCodeLeakExample, String> map = new HashMap<HashCodeLeakExample, String>();
			while (true) {
				map.put(new HashCodeLeakExample("id"), "any value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
