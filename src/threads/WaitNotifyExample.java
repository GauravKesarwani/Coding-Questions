package threads;

public class WaitNotifyExample extends Thread {
	private static NumUtility;
	
	public WaitNotifyExample(NumUtility n, int max, boolean isEvenNumber){
		
	}
	
	public void run(){
		
		if(isEvenNumber)
			NumUtility.printEven()
		
	}
	
	public static void main(String[] args){
		NumUtility n = new NumUtility();
		WaitNotifyExample oddGen = new WaitNotifyExample(n,10,false);
		WaitNotifyExample evenGen = new WaitNotifyExample(n,10,true);
		
		oddGen.start();
		evenGen.start();
	}
}

class NumUtility {

	public void printOdd(){
		
	
	}
	
	public synchronized void printEven(){
	
	}
}