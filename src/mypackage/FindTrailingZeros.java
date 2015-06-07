package mypackage;

public class FindTrailingZeros {
	public static void main(String[] args)
	{
		
		
		int num=1200000;
		int count=0;
		while((num/10)!=0){
			if ((num%10) == 0) {
				
				count++;
				num = num/10; System.out.println("print" + num);}
			else
			{   num=num/10;
				continue;
			}
		}
		System.out.println(" Count "+ count);
	}
}
