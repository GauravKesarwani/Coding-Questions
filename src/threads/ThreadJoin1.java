package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadJoin1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " started");

		/*class InnerThread implements Runnable {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ " started");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ " completed");

			}
		}*/
		
		  Thread t1 = new Thread(){
	            public void run(){
	                try {
	                    System.out.println(Thread.currentThread().getName() + " is Started");
	                    Thread.sleep(2000);
	                    System.out.println(Thread.currentThread().getName() + " is Completed");
	                } catch (InterruptedException ex) {
	                    Logger.getLogger(ThreadJoin1.class.getName()).log(Level.SEVERE, null, ex);
	                }
	            }
	        };

		//InnerThread t = new InnerThread();
		//Thread t1 = new Thread(t);
		t1.start();
		
		t1.join();
		System.out.println(Thread.currentThread().getName()
				+ " completed");
		
	}
}


