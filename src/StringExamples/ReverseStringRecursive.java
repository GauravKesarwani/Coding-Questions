package StringExamples;

public class ReverseStringRecursive {
	
	public static  String reverseRecursively(String s)
	{
		//Base Condition
		
		if (s.substring(1).equals(""))
			return s;
		else
		{
			char firstchar = s.charAt(0);
			String remainder = s.substring(1);
			String str = reverseRecursively(remainder) + s.charAt(0);
			return str;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(reverseRecursively("Gaurav Kesarwani"));
	}

}
