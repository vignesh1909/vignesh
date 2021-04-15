package org.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapValuePrint {

	public static void main(String[] args) {
		 //key    : 10,20,30,40,50,60,10,50,40
        // values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
		HashMap<Object,Object> hashmap = new HashMap<Object, Object>();
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
		System.out.println("The value are as follow:");
		for(Entry<Object,Object> entry: entrySet) {
			System.out.println(entry.getValue());
		}

	}

}
