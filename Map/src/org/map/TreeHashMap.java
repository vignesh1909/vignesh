package org.map;

import java.util.TreeMap;

public class TreeHashMap {

	public static void main(String[] args) {
		TreeMap<String, String> obj =  new TreeMap<String, String>();
		obj.put("!", "10");
		obj.put("@", "20");
		obj.put("#", "30");
		obj.put("$", "40");
		obj.put("%", "50");
		obj.put("^", "60");
		obj.put("&", "10");
		obj.put("*", "50");
		obj.put("(", "40");
		System.out.println(" "+obj);
		

	
	}

}
