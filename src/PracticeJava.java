import java.util.ArrayList;
import java.util.Arrays;


public class PracticeJava {

	static int returnInt(String s){
		int num=0;
	
		for(int i=0;i<s.length();i++){
			int c=s.charAt(i);
			if(c< 48 || c > 57){
				throw new NumberFormatException();
			}
			num=num*10 + c-48;
		}
		return num;
	}
	
	static int numtrailzeros(int num){
		int c=0;
		for(int i=5;num/i >0;i*=5){
			c+=num/i;			
		}
		return c;
	}
	
	static ArrayList<String> getPerms(String s){
		ArrayList<String> perms=new ArrayList<String>();
		if(s.length()==0){
			perms.add("");		
			return perms;
		}
		char firstc=s.charAt(0);
		String remainder=s.substring(1);
		ArrayList<String> words=getPerms(remainder);
		//words=getPerms(remainder);
		for(String word:words){
			for(int i=0;i<=word.length();i++){
				perms.add(insertcharAt(firstc,word,i));
			}
		 }
		return perms;
		}
	
	private static String insertcharAt(char firstc, String w, int i) {
		String start=w.substring(0,i);
		String end=w.substring(i);
		return start+firstc+end;
	}
	
	static int fib(int n){
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else 
			return fib(n-1) + fib(n-2);
	}
	
	static int iterfib(int n){
		int fib1=0;
		int fib2=1;
		int fib3=0;
		for(int i=3;i<=n;i++){
			fib3=fib2+fib1;
			fib1=fib2;
			fib2=fib3;
		}	
		return fib3;
	}
	
	static boolean AllUnique(String s){
	
		boolean flag[]=new boolean[256];
		for(int i=0;i<s.length();i++){
			int c=(int)s.charAt(i);
			if(flag[c])
				return false;
			flag[c]=true;
		}
		return true;
	}
	
	static String reverseString(String s){
		char[] str=s.toCharArray();
		int leftptr=0;
		int rightptr=str.length-1;
		char tmp;
		while(leftptr < rightptr){
			tmp=str[leftptr];
			str[leftptr]=str[rightptr];
			str[rightptr]=tmp;
			leftptr++;rightptr--;
			}
		return new String(str);
		}
	
	static String removeDuplicate(String s){
		char[] str=s.toCharArray();
		//char[] str2=new char[str.length];
		StringBuffer buff=new StringBuffer();
		//int tail=0;
		for(int i=0;i<str.length;i++){
			for(int j=0;j<=i;j++){
				if(j==i){
					buff.append(str[i]);
				}
				if(str[i] == str[j])
					break;	
			}
		}
		return buff.toString();
	}
	//remove duplicates in O(n)
	static String removeDuplicate1(String s){
		boolean hit[]=new boolean[256];
		StringBuffer buff=new StringBuffer();
	//	char[] strArr=s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(!hit[(int)s.charAt(i)])
				buff.append(s.charAt(i));
			hit[(int)s.charAt(i)]=true;
		}
		return buff.toString();
			
	}
	
	static boolean isAnagram(String s1,String s2){
		if(s1.length() != s2.length())
			return false;
		char[] strArr1=s1.toCharArray();
		char[] strArr2=s2.toCharArray();
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		System.out.println(new String(strArr1));
		System.out.println(new String(strArr2));
		if(new String(strArr1).equals(new String(strArr2)))
			return true;
		else 
			return false;
			
	}
	
	static boolean isAnagram2(String s1,String s2){
		int[] c=new int[256];
		int num_unique=0,num_tally=0;
		for(int i=0;i<s1.length();i++){
			if(c[(int)s1.charAt(i)]==0) 
				num_unique++;
			c[(int)s1.charAt(i)]++;
			
		}
		
		for(int j=0;j<s2.length();j++){
			c[(int)s1.charAt(j)]--;
			if(	c[(int)s1.charAt(j)] ==0)
				return false;
			--c[(int)s1.charAt(j)];
			if(c[(int)s1.charAt(j)]==0){
				num_tally++;
				if(num_tally==num_unique)
					return j==s2.length()-1;
			}	
		}
		return false;	
	}
	public static void main(String[] args){
	//	System.out.println(returnInt("12"));
	//	System.out.println(getPerms("gaurav"));
	//	System.out.println("" + iterfib(4));
	//	System.out.println(AllUnique("gaur"));
	//	System.out.println(reverseString("gaurav"));
		System.out.println(removeDuplicate1("gaaurav"));
		System.out.println(isAnagram("gaurav","aurvam"));
		
		
		
		/*int j=0;
		for(j=0;j<3;j++)
			System.out.println(j);
		
		System.out.println(j);*/
	
	}
}
