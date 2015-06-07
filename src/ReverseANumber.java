
public class ReverseANumber {

	static int rev=0;
	public static int reverseNum(int num){
		if(num == 0)
			return 0;
		else{
			int lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
			reverseNum(num/10);
		}
		return rev;
	}
	
	public static void main(String[] args){
		System.out.println(reverseNum(1234));
	}
}
