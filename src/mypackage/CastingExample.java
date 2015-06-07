
/*Casting in Java isn't magic, it's you telling the compiler that an Object of type A is 
 actually of more specific type B, and thus gaining access to all the methods on B that you 
 wouldn't have had otherwise. You're not performing any kind of magic or conversion when 
 performing casting, you're essentially telling the compiler "trust me, I know what I'm doing 
 and I can guarantee you that this Object at this line is actually a ." For example:

Object o = "str";
String str = (String)o;

The above is fine, not magic and all well. The object being stored in o is actually a string, and therefore we can cast to a string without any problems.

There's two ways this could go wrong. Firstly, if you're casting two objects in completely 
different inheritance hierarchies then the compiler will know you're being silly and stop you.

String o = "str";
Integer str = (Integer)o; //Compilation fails here

Secondly, if they're in the same hierarchy but still an invalid cast then a ClassCastException 
will be thrown at runtime:

Number o = new Integer(5);
Double n = (Double)o; //ClassCastException thrown here
*/


package mypackage;

public class CastingExample {
	
	public static void main(String[] args)
	{
		Object str = "Java follows CamelCase";
		String castVar = (String)str;
		System.out.println("You can now use string methods"+ castVar.charAt(2));
		
		// Example of Casting Exception
		
		Number num1 = new Integer(5);
		Double d = (Double)num1;
		//System.out.println(" Double "+ d);
	}

}
