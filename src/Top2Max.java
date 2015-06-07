
public class Top2Max {
	
	public static void findTop2Max(int[] arr)
	{
		int MaxOne=0;
		int MaxTwo=0;
		
		if (arr.length < 2)
			System.out.println("Array size is less than 2");
		else
			if (arr.length == 2)
				System.out.println("Top 2 elements in array");
			else
			{				
				for (int i : arr)
				{
					if (i > MaxOne){
						MaxTwo=MaxOne;
						MaxOne=i;
					}
					else if (i > MaxTwo)
						MaxTwo=i;
					else 
						continue;
				}
			}
		System.out.println("Top two elements "+ MaxOne);
		System.out.println("Top two elements "+ MaxTwo);
	}

	public static void main(String[] args){
		int[] arr = {23,12,45,89,14};
		findTop2Max(arr);
		
	}
}
