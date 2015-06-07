package StringExamples;

public class NumPallindrome {
	public static void main(String[] args) {
		if(checkpalindrome(402)) {
			System.out.println(" Number is pallindrome");
		}
		else{
			System.out.println("Number is not pallindrome");
		}
		
		if (414 == reverse(414))
			System.out.println("Number is pallindrome");
	}



public static boolean checkpalindrome(int number)
{
 	String str = String.valueOf(number);
	StringBuffer buff = new StringBuffer(str).reverse();
	int rev = Integer.parseInt(buff.toString());
	return (number == rev);
}

private static int reverse(int number){
    int reverse = 0;
  
    while(number != 0){
      reverse = reverse*10 + number%10; 
      number = number/10;
    }
    return reverse;
 }
}