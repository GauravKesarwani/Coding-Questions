package mypackage;

import java.util.Arrays;
import java.util.Comparator;

public class CompareToInJava implements Comparator<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Strings are immutable";
		//String str1 = "cog";
		String str2 = "Strings are immutable";
	//	String str2 = "dat";
		
		
		String str3 = "Integers are not immutable";

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);

		result = str3.compareTo(str1);
		System.out.println(result);
		
		String s= new String("gaurav");
		String s1 = sortChars(s);
	//	System.out.println(" "+s1);
		sortArray();
	}
	
	public static void sortArray()
	{
		String[] arr1 = new String[7];
		arr1[0]="gaurav";
		arr1[1]="ravi";
		arr1[2]="arun";
		arr1[3]="vniay";
		arr1[4]="agaurv";
		arr1[5]="vinay";
		arr1[6]="raiv";
		
		Arrays.sort(arr1);
		
		for(String s: arr1)
			System.out.println(" " +s);
		System.out.println("");

		Arrays.sort(arr1,new CompareToInJava());
				
		for(String s: arr1)
			System.out.println(" " +s);
		
	}
	
	public static String sortChars(String s)
	{
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public int compare(String s1,String s2)
	{
		return sortChars(s1).compareTo(sortChars(s2));
		
	}
}
