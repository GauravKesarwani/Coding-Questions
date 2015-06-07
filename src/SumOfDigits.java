
public class SumOfDigits {
 
    int sum = 0;
     
    public int getNumberSum(int number){
         
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
        SumOfDigits mns = new SumOfDigits();
        System.out.println("Sum is: "+mns.getNumberSum(223));
    }
}
	
