package threads;

import java.util.ArrayList;
import java.util.List;

/* Counter is the task which will be performed
	Threads initiate the tasks
*/
public class Counter implements Runnable {
	private int countNum;
	public Counter(int countNum){
		this.countNum = countNum;
	}
	
	public void run(){
		int sum=0;
		for(int i=0;i< countNum;i++)
			sum +=i;
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		
		List<Thread> threads = new ArrayList<Thread>();
		for(int i=0;i<500;i++){
			Runnable task = new Counter(i);
			Thread worker = new Thread(task);
			worker.setName(String.valueOf(i));
			worker.start();
			threads.add(worker);
		}
		
		int running = 0;
		do{
			for(Thread t: threads){
				if(t.isAlive()){
					running++;
				}
			}
			System.out.println("We have " + running + " threads running");
		}while(running > 0);
	}
}
