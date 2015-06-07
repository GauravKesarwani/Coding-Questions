package StringExamples;

import java.util.Arrays;
import java.util.Comparator;

class Anagrams3 implements Comparator<String>{
	
	
	public String sortc(String s) {
		char[] c =  s.toCharArray();
		Arrays.sort(c);
		System.out.println(""+ new String(c));
		return new String(c);	
	}
	
	public int compare(String s1,String s2){
		return sortc(s1).compareTo(sortc(s2));
	}
}

public class Anagrams2 {
	
	public static void main(String[] args) {	
		String[] s = {"gaurav","aguarv","bat","abt"};
		Arrays.sort(s, new Anagrams3());
		for (String str: s)
			System.out.println(" " + str);
	}
}
