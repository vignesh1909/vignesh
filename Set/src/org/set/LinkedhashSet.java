package org.set;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedhashSet {

	public static void main(String[] args) {
		Set<Integer> si = new LinkedHashSet();
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);
		si.add(60);
		si.add(70);
		si.add(80);
		si.add(90);
		si.add(10);
		si.add(20);
		System.out.println(si);

	}

}
