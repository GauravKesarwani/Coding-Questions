/*
 * Write a code to find if all the characters are unique in a string
 */

package StringExamples;

public class AllUnique {
	
	public static void main(String[] args){
		boolean unique[] = new boolean[256];
		String s= "Gaurav";
		for (int i=0;i<s.length();i++)
		{
			int c=(int)s.charAt(i);
			if(unique[c])
				System.out.println("Not unique");
			else{
				unique[c]=true;
			}
		}	
		System.out.println("Unique");
	}
}
