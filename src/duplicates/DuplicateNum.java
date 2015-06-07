package duplicates;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNum {

	int findSum(List<Integer> nums){
		int sum = 0;
		for (int num : nums) {
			sum +=num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i=1;i <= 10;i++)
		{
			numbers.add(i);
		
		}
		numbers.add(5);
		DuplicateNum n = new DuplicateNum();
		int highestnum = numbers.size() - 1;
		int repeatedNum = n.findSum(numbers) - (highestnum * (highestnum + 1)/2);
		System.out.println("Repeated Number "+ repeatedNum);
		
	}

}
