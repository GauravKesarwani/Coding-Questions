package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*List<Integer> can be used to store int type elements , though int[] cannot be converted to List<Integer>
using Arrays.asList method */

public class List1 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 8, 2 };
		List<Integer> ll = new ArrayList<Integer>();
		
	//	List<Integer> ll=Arrays.asList(arr);
 	List<int[]> l2=Arrays.asList(arr);
		for (int index = 0; index < arr.length; index++) {
			ll.add(arr[index]);
		} 
		
		for (int a: ll)
			System.out.println(a);
	}
}