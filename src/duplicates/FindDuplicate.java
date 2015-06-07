package duplicates;

import java.util.Arrays;

public class FindDuplicate {
	public static void main(String[] args){
		int[] numbers = {7, 1, 4, 5, 9, 8, 3, 4, 5 };
		
		Arrays.sort(numbers);
		for (int i=1; i < numbers.length ;i++)
			if (numbers[i] == numbers[i-1])
				System.out.println("Repeated Number "+ numbers[i]);
	}
}