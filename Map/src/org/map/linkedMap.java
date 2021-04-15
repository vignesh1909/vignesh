package org.map;

import java.util.LinkedHashMap;

public class linkedMap {

public static void main(String[] args) {
	 
	LinkedHashMap<Integer,Integer> hashmp = new LinkedHashMap<Integer,Integer>();
	hashmp.put(10, 10);
	hashmp.put(20, 20);
	hashmp.put(30, 30);
	hashmp.put(40, 40);
	hashmp.put(50, 50);
	hashmp.put(60, 60);
	hashmp.put(10, 10);
	hashmp.put(50, 50);
	hashmp.put(40, 40);
	System.out.println(hashmp);
	
	}

}
