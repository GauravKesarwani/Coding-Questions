
public class FindIndex {

	
	
	public static void findIndex(int arr[])
	{
		int startind=0; int endind = arr.length - 1;
		int sumleft=0;int sumright=0;
		while(true)
		{
			if ( sumleft > sumright)
				sumright += arr[endind--];
			else 
				sumleft += arr[startind++];
			
			if (startind > endind)
				if (sumleft == sumright){
					System.out.println(" Sum of left is equal to sum of right at index "+ endind);
					break;
				}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,4,5,4,1,2,5};
		findIndex(arr);
	}
	
	
}
