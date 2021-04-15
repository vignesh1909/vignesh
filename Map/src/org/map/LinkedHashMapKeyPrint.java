package org.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapKeyPrint {

	public static void main(String[] args) {
		LinkedHashMap<Object,Object> linkedHashMap = new LinkedHashMap<Object, Object>();
		linkedHashMap.put(10, 10);
		linkedHashMap.put(20, 20);
		linkedHashMap.put(30, 30);
		linkedHashMap.put(40, 40);
		linkedHashMap.put(50, 50);
		linkedHashMap.put(60, 60);
		linkedHashMap.put(10, 10);
		linkedHashMap.put(50, 50);
		linkedHashMap.put(40, 40);
		
		Set<Entry<Object,Object>> entrySet = linkedHashMap.entrySet();
		System.out.println("The keys are as follow:");
		for(Entry<Object,Object> entry :entrySet) {
			System.out.println(entry.getKey());
		}

	}

}
