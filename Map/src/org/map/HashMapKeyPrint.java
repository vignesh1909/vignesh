package org.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapKeyPrint {

	public static void main(String[] args) {
		HashMap<Object,Object> hashmap = new HashMap<>();
		hashmap.put(10, "java");
		hashmap.put(20, "sql");
		hashmap.put(30, "oops");
		hashmap.put(40, "sql");
		hashmap.put(50, "oracle");
		hashmap.put(60, "DB");
		hashmap.put(10, "selenium");
		hashmap.put(50, "psql");
        hashmap.put(40, "hadoop");
        
        Set<Entry<Object,Object>> entrySet = hashmap.entrySet();
        System.out.println("The keys are as follow:");
        for(Entry<Object,Object> entry :entrySet) {
        	System.out.println(entry.getKey());
        	
        }


		
		



}

}
