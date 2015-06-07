/*A thread can execute a thread join to wait until the other thread terminates
A parent thread may join with many child threads created by the parent.
Or, a parent only join with some of its child threads, and ignore other child threads.
In this case, those child threads that are ignored by the parent will be terminated 
when the parent terminates.
*/
package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadJoin {
	public static List<String> names = new ArrayList<String>();
	public static void main(String[] args){
		List<SampleThread> ll = new ArrayList<SampleThread>();
		for(int i=0;i<5;i++){
			SampleThread t = new SampleThread();
			ll.add(t);
			t.start();		
		}
		
		for (SampleThread st :ll){
			try {
				st.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(names);
		
	}
}

class SampleThread extends Thread {
	public void run(){
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		ThreadJoin.names.add(getName());
	}
	
}
