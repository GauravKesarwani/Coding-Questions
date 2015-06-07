/*
 * Method to determine if two strings are anagrams or not
 * 
 * Check if two strings have identical counts of each unique char
 */

package StringExamples;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
	
	//Easiest method 1. Sort both the strings and then compare
	public static void checkAnagrams(String s1,String s2){
		if(s1.length()!=s2.length())
			System.out.println("Strings are not");
			
			char[] c1=s1.toCharArray();
			Arrays.sort(c1);
			char[] c2 = s2.toCharArray();
			Arrays.sort(c2);
			int i= new String(c1).compareTo(new String(c2));
			System.out.println( " "+ i);
			if(i==0)
				System.out.println("String are Anagrams");
			else 
				System.out.println("String are not Anagrams");
			
	}

	//2nd method using hashmap
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "mbguaa";
		String str2 = "aumgb";
		boolean flag = true;
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();

		if (str1.length() != str2.length())
			flag = false;

		for (int i = 0; i < str1.length(); i++) {
			map1.put("" + str1.charAt(i), 0);
		}

		for (int i = 0; i < str2.length(); i++) {
			map2.put("" + str2.charAt(i), 0);
		}

		for (int i = 0; i < str1.length(); i++) {
			int val1 = map1.get("" + str1.charAt(i));
			val1++;
			map1.put("" + str1.charAt(i), val1);
		}

		for (int i = 0; i < str2.length(); i++) {
			int val2 = map2.get("" + str2.charAt(i));
			val2++;
			map2.put("" + str2.charAt(i), val2);
		}

		for (int i=0; i< str1.length();i++){
			int val1 = map1.get("" + str1.charAt(i));
			int val2 = map2.get(""+str1.charAt(i));
			if (val1 != val2){
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("String are anagrams");
		else
			System.out.println("Strings are not amagrams");
	}
}
