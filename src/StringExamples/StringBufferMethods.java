/*
 * The StringBuffer and StringBuilder classes are used when there is a necessity to make a lot of
 *  modifications to Strings of characters.

	Unlike Strings objects of type StringBuffer and Stringbuilder can be modified over and over
	again with out leaving behind a lot of new unused objects.
	he StringBuilder class was introduced as of Java 5 and the main difference between the StringBuffer and StringBuilder is that StringBuilders methods are not thread safe(not Synchronised).

	It is recommended to use StringBuilder whenever possible because it is faster than 
	StringBuffer. However if thread safety is necessary the best option is StringBuffer objects.
 */

package StringExamples;

public class StringBufferMethods {
	public static void main(String[] args){
		
		StringBuffer sbuffer = new StringBuffer("Test");
		sbuffer.append(" append1");
		sbuffer.append(" append2");
		System.out.println(" "+sbuffer);
		
		//reverse string
		sbuffer.reverse();
		System.out.println(" "+sbuffer);
		
		char[] charArray = { 'a','b','c','d','e'};
		
		sbuffer.insert(5, charArray);
		
		System.out.println(" " + sbuffer);
	}
}
