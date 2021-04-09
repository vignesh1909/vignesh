package org.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashadd {
	//Input : List = 10,20,30,90,10,10,40,50

	public static void main(String[] args) {
		Set<Integer> si = new HashSet();
		si.addAll(List.of(10, 20, 30, 90, 10 ,40, 50));
		System.out.println(si);
		
		

	}

}
