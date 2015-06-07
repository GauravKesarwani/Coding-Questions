package mypackage;

import java.util.ArrayList;


public class ArrayListEx {
	
	public static void main(String[] args){
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(40);
	l.add(50);
	l.add(55);
	
	for (Integer value : l)
		System.out.println(" Number "+ value);
	}
}
   