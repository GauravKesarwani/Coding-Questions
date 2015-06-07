/*
 * Finds a duplicate number in array using hashset.
*/
package duplicates;

import java.util.HashSet;

public class FindDuplicate1 {
	
	public static void findDuplicateNumber(int arr[]){
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(Integer value:arr) {
		
			if (! hs.add(value))
				System.out.println("Duplicate number "+ value);
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr = {20,30,40,10,20};
		findDuplicateNumber(arr);
		
	}

}
