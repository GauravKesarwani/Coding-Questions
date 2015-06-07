// This program will detect if there are duplicates in Array or not.

package collections;

import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// check duplicate using Set
		Integer[] arr1 = new Integer[]{1,2,3,4,4,5};
		Integer[] arr2 = new Integer[]{1,2,3,4,5,6};
		
	    if (detectDuplicate(arr1))
	    	System.out.println("Duplicate Detected in Array 1");
	    
	    if (! detectDuplicate(arr2))
	    	System.out.println("No Duplicates in Array 2");
		
	}
	
	public static boolean detectDuplicate(Integer[] arr1)
	{
		Set s = new HashSet(Arrays.asList(arr1));
		
	//	System.out.println(arr1.length);
	//	System.out.println(s.size());
	//	System.out.println(Arrays.asList(arr1).size());
		if (s.size() < Arrays.asList(arr1).size())
		{
			return true;
		}
		return false;
	}

}
