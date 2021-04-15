package org.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapValuePrint {

	public static void main(String[] args) {
		//key    : 10,20,30,40,50,60,10,50,40
       // Values : 10,20,30,40,50,60,10,50,40
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
		System.out.println("The value are as :");
		for (Entry<Object,Object> entry:entrySet) {
			System.out.println(entry.getValue());
		}

	}

}
