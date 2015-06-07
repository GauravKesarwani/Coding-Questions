package StringExamples;
/*
 * Given a string with spaces, move the spaces to the beginning of the string
 * 
 * */
public class ShiftSpacesToBeginning {
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("Move the spaces to beginning ");
		int i,j;	
		for (i=0,j=i+1; j < str.length();i++) {
			char c = str.charAt(i);
			str.setCharAt(j, c);
			
		}
	}
}
