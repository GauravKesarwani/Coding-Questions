

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i < 10; i++)
		{
			System.out.println(" "+ fibonacci(i));
		}

	}



static int fibonacci(int n) {

	//Error condition:
	if(n<0)
	return -1;

	//Base cases:
	else if (n==0)
	return 0;
	else if (n==1) 
	return 1;


	else if (n>1)
	return fibonacci(n-1) + fibonacci(n-2);
	
	return 0;

	}

}