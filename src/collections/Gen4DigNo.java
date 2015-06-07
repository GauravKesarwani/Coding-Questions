package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gen4DigNo {
	private static final int NUMDIGITS = 4;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] arr= {0,1,2,3,4,5,6,7,8,9};
		List<Integer> ll=Arrays.asList(arr);
		System.out.println(generateNumber(ll,NUMDIGITS));
	}
		
	static int generateNumber(List<Integer> ll,int NUMDIGITS){
		
		if (NUMDIGITS <=0 || NUMDIGITS>=10) {
			throw new IllegalArgumentException("Invalid Size "+ NUMDIGITS); }
		
		Collections.shuffle(ll);
		
		StringBuilder sb = new StringBuilder(4);
		for(int i=0;i<NUMDIGITS;i++)
			sb.append(ll.get(i));
		
		//Avoid any type of hard coding
		//String num=""+ ll.get(0) + ll.get(1) + ll.get(2) + ll.get(3);
		
		return Integer.parseInt(sb.toString());
		// TODO Auto-generated method stub
		/*
		int[] arr={12,23,43,19,54,13,78,19,15,90};
		List<int[]> ll=Arrays.asList(arr);
		
		for(int[] i: ll)
			System.out.println(i);
		
		Integer[] arr1={12,23,43,19,54,13,78,19,15,90};
		List<Integer> ll2=Arrays.asList(arr1);
		
		for(Integer i: ll2)
			System.out.println(i);
		String[] arr3={"gaurav","saurav","neha","veenu"};
		List<String> strlist=Arrays.asList(arr3);
	//	you cannot add an element into arraylist
	//	strlist.add("resham");
		for (String str:strlist)
		System.out.println(str);
		
	
		ArrayList assetTradingList = new ArrayList();                      

		assetTradingList.add("Stocks trading");
		assetTradingList.add("futures and option trading");
		assetTradingList.add("electronic trading");
		assetTradingList.add("forex trading");
		assetTradingList.add("gold trading");
		assetTradingList.add("fixed income bond trading");
		String [] assetTradingArray = new String[assetTradingList.size()];
		assetTradingList.toArray(assetTradingArray);

	*/
	}
}

