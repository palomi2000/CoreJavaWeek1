package com.neosoft.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args)
	{
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,6,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,4,5,6,7,5}));
		
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union: "+union);
		
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: "+intersection);
		
		Set<Integer> diff = new HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println("Difference: "+diff);
		
		System.out.println("2 is there? "+diff.contains(2));
		System.out.println("remove 0 "+diff.remove(0));
		
		for(Integer i:diff)
			System.out.print("Element: "+i+",");
		
		System.out.println("\nWith iterator:");
		Iterator<Integer> itr = diff.iterator();
		while(itr.hasNext())
			System.out.println("Element "+itr.next()+",");
		
		System.out.println("\n\t\tLinkedHashSet Example\n");
		
		Set <String> lhs = new LinkedHashSet<String>();  
		lhs.add("Harry");
		lhs.add("Zayn"); 
		lhs.add("Liam");
		lhs.add("Louis");
		lhs.add("Niall");
		
		System.out.print("Element : "+lhs);
		
		lhs.remove("Zayn");
		System.out.print("\nElement : "+lhs);
		
		System.out.println();
		System.out.println("\n\t\tTreeSet Example\n");
		Set <String> ts = new TreeSet<String>(); 
		ts.add("Harry");
		ts.add("Zayn"); 
		ts.add("Liam");
		ts.add("Louis");
		ts.add("Niall");
		
		System.out.print("Element : "+ts);
		
		ts.remove("Jonah");
		System.out.print("\nElement : "+ts);
	}
}
