package StringExamples;

import java.util.ArrayList;

//Write a method to calculate all the permutations of a string

public class CalcPerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gaurav";
		System.out.println(s.substring(0, 1));
		System.out.println(s.substring(1));
	
	}
/*
	public void calcperm(String s)
	{
		ArrayList<String> strings = new ArrayList<String>();
		for (int i=1;i<s.length();i++)
			return s.substring(i);
	}
	
	public static ArrayList<String> getPerms(String s){
		ArrayList<String> perms = new ArrayList<String>();
		if (s==null)
			return null;
		if (s.length()==0){
			perms.add("");
			return perms;
		}
		
		char c = s.charAt(0);
		String remainder = s.substring(1);
		ArrayList<String> words=getPerms(remainder);
		for (String w:words){
			for (int j=0;j<w.length();j++){
				perms.add(insertCharAt(w,c,j));
			}
		}
		return perms;
	}
	public static String insertCharAt(String word,char c, int i){
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}
*/}
