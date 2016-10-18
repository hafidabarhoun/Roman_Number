package hello;

import java.util.*;

public class RomanNumberConverter {
	HashMap<Integer, String> hashMap;
	
	public RomanNumberConverter() {
		hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "I");
		hashMap.put(5, "V");
		hashMap.put(10, "X");
		hashMap.put(50, "L");
		hashMap.put(100, "C");
		hashMap.put(500, "D");
		hashMap.put(1000, "M");
	}
	
	public int convert(String romanNumber) {
		System.out.println("string -> int");
		
		for (Object o: hashMap.entrySet() ) {
			Map.Entry entry = (Map.Entry) o;
			if(entry.getValue().equals(romanNumber)) {
				return (int)entry.getKey();
			}
		}
		return -1;
	}
	
	public String convert(int number) {
		System.out.println("int -> String");
		return hashMap.get(number);
	}
}
