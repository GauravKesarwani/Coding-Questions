/* 
 * 1. Synchronization is built around an internal entity called intrinsic lock or monitor lock.
 * 
 * 2. Every object has an intrinsic lock associated with it.
 * 
 * 3. By convention, a thread that needs exclusive and consistent access to an object's fields has 
 * to acquire the object's intrinsic lock before accessing them, and then release the intrinsic lock when
 * it's done with them. A thread is said to own the intrinsic lock between the time it has acquired the lock 
 * and released the lock. As long as a thread owns an intrinsic lock, no other thread can acquire the same 
 * lock. The other thread will block when it attempts to acquire the lock.
 * Synchronized methods enable a simple strategy for preventing thread interference and 
 * memory consistency errors.
 * 
 */

/*	Example of synchronized and join keywords. 
 *	The join keyword ensures that both the child threads complete before the main
 *  and current value of count is displayed at the console
 * */


package threads;

public class SynchronizedExample {
	private int count=0;
	
	public synchronized void increment(){
		count++;
	}
	public void doWork(){
		
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				increment();	
			}	
		});
		
		Thread t2=new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i=0;i<10000;i++)
				increment();	
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("Value of count "+ count);
	}
	
	public static void main(String[] args){
		
		new SynchronizedExample().doWork();
	}

}
