package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EntrysetEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("two",2);
		hm.put("three",3);
		
		// Set of Entries
		Set<Entry<String, Integer>> s= hm.entrySet();
		/*You can pass the entire collection to list 
		to create a list
*/		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(s);
		System.out.println(s);
		
		Iterator i = s.iterator();
		/*
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			//System.out.println(i.next());
		}*/
		
		/*for(Map.Entry<String, Integer> e : s){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}*/
		
		/*The reason for using list is that Collections.sort method accepts only list type
		for sorting the elements*/
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2)
			{
				return (e1.getValue()).compareTo(e2.getValue()) ;
			}
		});
		
		for (Map.Entry<String, Integer> e : list){
			System.out.println(e.getValue());
		}
		
	}
}
