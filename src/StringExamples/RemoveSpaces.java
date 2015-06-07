package StringExamples;

import java.util.StringTokenizer;

public class RemoveSpaces {
	public static void main(String[] args){
		String str = "Removal     of          spaces!!";
		System.out.println(str);
		//str.replace(" ", "a");
		System.out.println(str.replace(" ",""));
		
		//Removal of multiple spaces
		StringTokenizer st = new StringTokenizer(str," ");
		StringBuffer bf = new StringBuffer();
		while(st.hasMoreTokens()){
			bf.append(st.nextElement() + " ");
		}
		System.out.println(bf.toString());
	}
	
}
