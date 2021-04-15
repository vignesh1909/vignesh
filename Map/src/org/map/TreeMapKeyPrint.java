package org.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapKeyPrint {

	public static void main(String[] args) {
		TreeMap<String,Integer> treemap = new TreeMap<String, Integer>();
		treemap.put("!", 10);
		treemap.put("@", 20);
		treemap.put("#", 30);
		treemap.put("$", 40);
		treemap.put("%", 50);
		treemap.put("^", 60);
		treemap.put("&", 10);
		treemap.put("*", 50);
		treemap.put("(", 40);
		
		Set<Entry<String, Integer>> entrySet = treemap.entrySet();
		System.out.println("The key are follow:");
		for(Entry<String,Integer> entry: entrySet) {
			System.out.println(entry.getKey());
		}

	}

}
