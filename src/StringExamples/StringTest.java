package StringExamples;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Hello ";
		s += " World ";
		s.trim( );
		System.out.println(s);
		
		char[] arr = {'H','e','l','l','o','J','a','v','a'};
		String s1 = String.copyValueOf(arr);
		System.out.println(s1);
		String s2 = String.copyValueOf(arr,5,4);
		System.out.println(s2);
		
		String str = "Use this string for testing this";
	    System.out.println("Basic indexOf() example");
	    System.out.println("Char 's' at first occurance: "+str.indexOf('s'));
	    System.out.println("String \"this\" at first occurance: "+str.indexOf("this"));
	        /**
	         * Returns the first occurence from specified start index
	         */
	    System.out.println("First occurance of char 's' from 4th index onwards : "
	                            +str.indexOf('s',4));
	    System.out.println("First occurance of String \"this\" from 6th index onwards: "
	                            +str.indexOf("this",6));
	    System.out.println("length of string " + str.length());
	    System.out.println("Last Index Of e " + str.lastIndexOf('e',20));
	    System.out.println("Last Index Of 'this' " + str.lastIndexOf("this",31));
	}
}
