package org.map;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableKeyPrint {

	public static void main(String[] args) {
		//Key    : mani,vannan,boss,Vengat,subash
       // Values : Selenium,framework,oracle,corejava,jirav
		Hashtable<Object,Object> hashtable = new Hashtable<Object, Object>();
		hashtable.put("vignesh", "selenium");
		hashtable.put("kasi", "framework");
		hashtable.put("venget", "oracle");
		hashtable.put("arul", "corejava");
		hashtable.put("jaya", "jirav");
		
		Set<Entry<Object,Object>> entrySet = hashtable.entrySet();	
		System.out.println("The key value are follow:");
		for (Entry<Object,Object> entry: entrySet) {
			System.out.println(entry.getKey());
		}

	}

}
