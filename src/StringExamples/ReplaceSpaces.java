package StringExamples;

public class ReplaceSpaces {
	
	public static void main(String args[]){
	    String str1 = "Replace All Spaces !!";
	    StringBuffer strbuff = new StringBuffer();
	    
	    for(int i=0;i<str1.length();i++)
	    {
	    	if (str1.charAt(i)!= ' ')
	    		strbuff.append(str1.charAt(i));
	    	else
	    		strbuff.append("%20");
	    }
	  
	    System.out.println(new String(strbuff));

	    //******* Approach 2 *******//
		
		
		String str2 = "Replace All Spaces !!";
		int spacecount=0;
		for (int i=0;i<str2.length();i++)
			if(str2.charAt(i) == ' ')
				spacecount++;
		
		System.out.println(spacecount);
		int newlength = str2.length() + spacecount *2;
		System.out.println("newlength "+ newlength);
		String newstring = "";
		
		for(int i=0;i<str2.length();i++){
			if (str2.charAt(i) != ' ') 
				newstring = newstring + str2.charAt(i);
			else
				newstring = newstring + "%20";
		
		}
	}
}