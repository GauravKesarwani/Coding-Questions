package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<Integer>();
		
		ll.add(20);
		ll.add(40);
		ll.add(30);
		for (Integer value: ll)
			System.out.println(" " + value);
		
		
		System.out.println("size" + ll.size());
		ll.remove(2);
		System.out.println(" Iteration# 2");
		for (Integer value: ll)
			System.out.println(" " + value);
		
		List<String> values = new ArrayList<String>();
		
	}

}
