import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ArraySort {
	
	public static void main(String[] args){
	int[] intArr = {5,1,4,2,7 };
	String[] strArr = {"A","Z","Q","T","E"};
	
	List<String> strList = new ArrayList<String>();
	
	strList.add("A");
	strList.add("Z");
	strList.add("E");
	strList.add("R");
	
	Arrays.sort(intArr);
	Arrays.sort(strArr);
	Collections.sort(strList);
	
	System.out.println(Arrays.toString(intArr));
	System.out.println(Arrays.toString(strArr));
	
	for(String str : strList){
		System.out.println(" " + str);
	}
	}
}
